package com.example.proyecto;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ServiciosActivity extends AppCompatActivity {

    private Button crearServicioButton, actualizarServicioButton, eliminarServicioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        crearServicioButton = findViewById(R.id.crearServicioButton);
        actualizarServicioButton = findViewById(R.id.actualizarServicioButton);
        eliminarServicioButton = findViewById(R.id.eliminarServicioButton);

        crearServicioButton.setOnClickListener(v -> Toast.makeText(this, "Servicio creado", Toast.LENGTH_SHORT).show());
        actualizarServicioButton.setOnClickListener(v -> Toast.makeText(this, "Servicio actualizado", Toast.LENGTH_SHORT).show());
        eliminarServicioButton.setOnClickListener(v -> Toast.makeText(this, "Servicio eliminado", Toast.LENGTH_SHORT).show());
    }
}
