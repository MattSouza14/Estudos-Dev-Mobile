package com.example.ap1apps;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class CriarConta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_criar_conta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void cadastrarNovoUsuario(View view) {
        EditText inputEmail = findViewById(R.id.editTexCriarEmail);
        EditText inputSenha = findViewById(R.id.editTextCriarSenha);
        String email = inputEmail.getText().toString();
        String senha = inputSenha.getText().toString();

        if (!email.isEmpty() && !senha.isEmpty()) {
            Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
            Intent telaApps = new Intent(this, ListaApps.class);
            startActivity(telaApps);
        } else {
            Toast.makeText(this, "Insira email e senha", Toast.LENGTH_SHORT).show();
        }
    }
}