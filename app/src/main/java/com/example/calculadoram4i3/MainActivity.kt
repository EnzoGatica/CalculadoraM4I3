package com.example.calculadoram4i3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val textResultado = findViewById<TextView>(R.id.textResultado)
        val suma = findViewById<Button>(R.id.suma)
        val resta = findViewById<Button>(R.id.resta)
        val division = findViewById<Button>(R.id.division)
        val multiplicacion = findViewById<Button>(R.id.multiplicacion)

        //Toast.makeText(this, "hi", Toast.LENGTH_LONG).show();
        //Snackbar.make(MainActivity, "hi",Snackbar.LENGTH_LONG).show()
        suma.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 + numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(baseContext, "Apretaste Sumar, resultado: $resultado", Toast.LENGTH_LONG).show()
            }
        }
        resta.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 - numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(baseContext, "Apretaste Resta, resultado: $resultado", Toast.LENGTH_LONG).show()
            }
        }
        division.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty() || num2.getText().toString().toInt() == 0) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 / numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(baseContext, "Apretaste Division, resultado: $resultado", Toast.LENGTH_LONG).show()
            }
        }
        multiplicacion.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 * numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(baseContext, "Apretaste multiplicacion, resultado: $resultado", Toast.LENGTH_LONG).show()
            }
        }
    }
}