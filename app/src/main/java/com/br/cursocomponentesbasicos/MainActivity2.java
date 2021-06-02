package com.br.cursocomponentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText campoNome, campoSenha, campoIdade;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        campoNome = findViewById(R.id.edit_nome);
        campoSenha = findViewById(R.id.edit_senha);
        campoEmail = findViewById(R.id.edit_email);
        campoIdade = findViewById(R.id.edit_idade);


        textoResultado = findViewById(R.id.edit_resultado);

    }

    public void salvar(View view){
        String nome = campoNome.getText().toString();
        String senha = campoSenha.getText().toString();
        String email = campoEmail.getText().toString();
        String idade = campoIdade.getText().toString();


        textoResultado.setText("Nome :" + nome + "\nE-mail: "+ email + "\nSenha: " + senha + "\nIdade:" + idade);

    }

    public void limpar(View view){

        campoNome.setText("");
        campoSenha.setText("");
        campoEmail.setText("");
        campoIdade.setText("");
        textoResultado.setText("Resultado");

    }
}