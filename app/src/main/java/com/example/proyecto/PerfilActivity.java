package com.example.proyecto;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        // Mostrar información del perfil (simulado)
        Toast.makeText(this, "Perfil del usuario", Toast.LENGTH_SHORT).show();
    }
}
