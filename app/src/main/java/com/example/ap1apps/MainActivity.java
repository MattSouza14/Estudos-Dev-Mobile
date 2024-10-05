package com.example.ap1apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    String emailCorreto = "mateussouzabr1@gmail.com";
    String senhaCorreta = "matt123b";

    public void trocar(View view) {
        EditText inputEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText inputSenha = findViewById(R.id.editTextTextPassword);
        String email = inputEmail.getText().toString();
        String senha = inputSenha.getText().toString();

        if (email.equals(emailCorreto) && senha.equals(senhaCorreta)) {
            Intent segunda_tela = new Intent(this, ListaApps.class);
            startActivity(segunda_tela);
        } else {
           Toast.makeText(this, "Email ou senha incorretos", Toast.LENGTH_SHORT).show();
        }
    }
}