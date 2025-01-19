package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText correoEditText, contraseñaEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correoEditText = findViewById(R.id.usernameEditText);
        contraseñaEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String correo = correoEditText.getText().toString();
            String contraseña = contraseñaEditText.getText().toString();

            // Llamamos a la tarea asincrónica para hacer el login
            new LoginTask(LoginActivity.this).execute(correo, contraseña);
        });
    }
}

