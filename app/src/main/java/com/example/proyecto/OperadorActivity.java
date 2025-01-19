package com.example.proyecto;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class OperadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operador);

        // Simulamos que el operador inicia una tarea, por ejemplo, recoger pasajeros
        Toast.makeText(this, "Operador en acción", Toast.LENGTH_SHORT).show();
    }
}
