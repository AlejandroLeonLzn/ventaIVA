package com.example.ventaiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        //referecina
        TextView tv1 = findViewById(R.id.tv1),
                 tv2 = findViewById(R.id.tv2),
                 tv3 = findViewById(R.id.tv3);
        //Recuperar Valores
        Intent intent = getIntent();
        //regreso
        double totalBruto = intent.getDoubleExtra("totalBruto", 0);
        double totalIva = intent.getDoubleExtra("totalIva", 0);
        double totalNeto = intent.getDoubleExtra("totalNeto", 0);
        //Ahora los mensajes
        String mensajeTotalBruto = "Bruto: "+ totalBruto;
        String mensajeTotalIva = "IVA: "+ totalIva;
        String mensajeTotalNeto = "Neto: "+ totalNeto;
        //xml
        tv1.setText(mensajeTotalBruto);
        tv2.setText(mensajeTotalIva);
        tv3.setText(mensajeTotalNeto);

    }
}