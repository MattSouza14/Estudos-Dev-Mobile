package com.example.ap1apps;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculadoraIMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void calculadoraImc(View view) {
        EditText inputPeso = findViewById(R.id.editTextNumberDecimal);
        EditText inputAltura = findViewById(R.id.editTextNumberDecimal2);

        String pesoStr = inputPeso.getText().toString();
        String alturaStr = inputAltura.getText().toString();

        float peso = Float.parseFloat(pesoStr);
        float altura = Float.parseFloat(alturaStr);

        float imc;

        imc = peso / (altura * altura);
        TextView texto = findViewById(R.id.textView9);
        if (imc < 18.5){
            texto.setText("Baixo peso" + imc);
        }
        else if((imc >= 18.5) && (imc <=24.9)){
            texto.setText("Peso normal" + imc);
        }
        else if ((imc >= 25.0) && (imc <=29.9)){
            texto.setText("Sobrepeso" + imc);
        }
        else if ((imc >= 30.0) && (imc <=34.9)){
            texto.setText("Obesidade grau I" + imc);
        }
        else if ((imc >= 35.0) && (imc <=39.9)){
            texto.setText("Obesidade grau II" + imc);
        }
        else if(imc >= 40) {
            texto.setText("Obesidade grau III" + imc);
        }
        else{
            texto.setText("Aconteceu algum erro. Tente novamente");
        }
    }

}