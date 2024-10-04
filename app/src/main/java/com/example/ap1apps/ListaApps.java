package com.example.ap1apps;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListaApps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista_apps);
        Log.d("ListaApps", "onCreate chamado");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
  public void appNum(View view){

      Intent telaNum = new Intent(this, GeradorDeNumero.class);
      startActivity(telaNum);
  }
    public void appFrases(View view){

        Intent telaFrases = new Intent(this, FrasesNerds.class);
        startActivity(telaFrases);
    }
    public void appImc(View view){

        Intent telaImc= new Intent(this, CalculadoraIMC.class);
        startActivity(telaImc);
    }
    public void appAbast(View view){

        Intent telaAbast = new Intent(this, Abastecimento.class);
        startActivity(telaAbast);
    }


}