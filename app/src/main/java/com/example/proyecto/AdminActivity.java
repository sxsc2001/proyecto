package com.example.proyecto;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        // Funciones de administrador, como crear servicios, ver todos los servicios, etc.
        Toast.makeText(this, "Bienvenido, Administrador", Toast.LENGTH_SHORT).show();
    }
}
