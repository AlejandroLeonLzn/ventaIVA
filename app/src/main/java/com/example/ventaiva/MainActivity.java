package com.example.ventaiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtener referencia a los elementos
        final EditText editTextPrecio = findViewById(R.id.et1),
                editTextCantidad = findViewById((R.id.et2));
        Button bottonQueCalcula = findViewById(R.id.b1);
        bottonQueCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtener ambod valores cadena
                String precioString = editTextPrecio.getText().toString(),
                        cantidadString = editTextCantidad.getText().toString();
                //si esta vacio
                if (precioString.isEmpty() || cantidadString.isEmpty()) return;
                //si continua bien
                double precio = Double.parseDouble(precioString),
                        cantidad = Double.parseDouble(cantidadString);
                //calculos
                final double IVA = 0.16;
                double totalBruto = precio * cantidad;
                //calcular por separado IVA
                double totalIva = totalBruto * IVA;
                //neto suma de los anteriores
                double totalNeto = totalBruto + totalIva;
                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                intent.putExtra("totalBruto", totalBruto);
                intent.putExtra("totalIva", totalIva);
                intent.putExtra("totalNeto", totalNeto);
                //Hacemos el cambio
                startActivity(intent);
            }
        });
    }
}

