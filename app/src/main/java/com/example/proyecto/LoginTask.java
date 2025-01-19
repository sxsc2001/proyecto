package com.example.proyecto;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class LoginTask extends AsyncTask<String, Void, String> {

    private Context context; // Contexto para el Toast

    // Constructor que acepta el contexto
    public LoginTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {
        String correo = params[0];
        String contraseña = params[1];
        String response = "";

        try {
            // URL del servidor PHP donde se maneja la autenticación
            URL url = new URL("http://192.168.1.10/mi_api.php"); // Cambia la IP por la de tu servidor
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            // Parámetros que se enviarán en la solicitud
            String data = "correo=" + URLEncoder.encode(correo, "UTF-8") +
                    "&contraseña=" + URLEncoder.encode(contraseña, "UTF-8");

            // Enviar los datos al servidor
            connection.getOutputStream().write(data.getBytes());

            // Leer la respuesta del servidor
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                response += line;
            }

            reader.close();
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
            response = "Error de conexión: " + e.getMessage();
        }

        return response;
    }

    @Override
    protected void onPostExecute(String result) {
        // Aquí recibimos la respuesta del servidor
        if (result.equals("Login exitoso")) {
            // Si el login es exitoso, mostramos el mensaje
            Toast.makeText(context, "Login exitoso", Toast.LENGTH_SHORT).show();
        } else {
            // Si hubo un error en el login, mostramos el mensaje
            Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
        }
    }
}

