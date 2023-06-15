package com.example.calculadoram4i3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        textResultado = findViewById(R.id.textResultado);

        Button suma = findViewById(R.id.suma);
        Button resta = findViewById(R.id.resta);
        Button division = findViewById(R.id.division);
        Button multiplicacion = findViewById(R.id.multiplicacion);




        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                int resultado = numero1 + numero2;
                textResultado.setText("Resultado: " + resultado);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                int resultado = numero1 - numero2;
                textResultado.setText("Resultado: " + resultado);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());
                double resultado = numero1 / numero2;
                textResultado.setText("Resultado: " + resultado);
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());
                double resultado = numero1 * numero2;
                textResultado.setText("Resultado: " + resultado);
            }
        });

    }



}