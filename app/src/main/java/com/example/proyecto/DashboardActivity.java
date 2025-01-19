package com.example.proyecto;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private Button serviciosButton, perfilButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        serviciosButton = findViewById(R.id.serviciosButton);
        perfilButton = findViewById(R.id.perfilButton);

        serviciosButton.setOnClickListener(v -> startActivity(new Intent(DashboardActivity.this, ServiciosActivity.class)));
        perfilButton.setOnClickListener(v -> startActivity(new Intent(DashboardActivity.this, PerfilActivity.class)));
    }
}
