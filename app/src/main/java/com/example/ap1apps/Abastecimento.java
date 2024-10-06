package com.example.ap1apps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Abastecimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abastecimento);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        Button btnLimpar = findViewById(R.id.button22);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputGasolina = findViewById(R.id.textinput1);
                EditText inputAlcool = findViewById(R.id.textinput2);

                inputAlcool.setText("");
                inputGasolina.setText("");
            }
        });
    }
    public void calcAlcXGaso(View view) {

        EditText inputGasolina = findViewById(R.id.textinput1);
        EditText inputAlcool = findViewById(R.id.textinput2);

        String GasStr = inputGasolina.getText().toString();
        String AlcStr = inputAlcool.getText().toString();

        try {
            float Gasolina = Float.parseFloat(GasStr);
            float Alcool = Float.parseFloat(AlcStr);

            float result = Alcool / Gasolina;
            TextView texto = findViewById(R.id.textView4);

            if (result > 0.7) {
                texto.setText("Abasteça com Alcool");
            } else {
                texto.setText("Abasteça com Gasolina");
            }
        } catch (NumberFormatException e) {

            TextView texto = findViewById(R.id.textView4);
            texto.setText("Por favor, insira valores válidos");
        }
    }
    }
