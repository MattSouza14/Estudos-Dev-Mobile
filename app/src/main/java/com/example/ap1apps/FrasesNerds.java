package com.example.ap1apps;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class FrasesNerds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frases_nerds);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    String frases[]={"Oi, eu sou o goku",
            "Luke, eu sou seu pai",
            "É assim que morre a democracia, com um estrondoso aplauso",
            "Vou te comer, vou te comer",
            "Velocidade, eu sou a velocidade"};

    public void gerarFrases( View view) {
        int x = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.textView7);
        texto.setText(frases[x]);
    }

}