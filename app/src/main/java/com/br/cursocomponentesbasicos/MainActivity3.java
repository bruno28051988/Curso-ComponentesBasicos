package com.br.cursocomponentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity3 extends AppCompatActivity {

    private EditText campoNome, campoSenha, campoIdade;
    private TextInputEditText campoEmail;
    private TextView textoResultado, textoResultadoLing, textoResultadoSexo;
    private CheckBox checkBranco, checkPreto, checkPardo;
    private RadioButton sexoMasculino, sexoFeminino, sexoIndefinido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        campoNome = findViewById(R.id.edit_nome);
        campoSenha = findViewById(R.id.edit_senha);
        campoEmail = findViewById(R.id.edit_email);
        campoIdade = findViewById(R.id.edit_idade);

        checkBranco = findViewById(R.id.check_branco);
        checkPreto = findViewById(R.id.check_preto);
        checkPardo = findViewById(R.id.check_pardo);

        textoResultado = findViewById(R.id.edit_resultado);
        textoResultadoLing = findViewById(R.id.edit_resultadoLing);

        sexoMasculino = findViewById(R.id.radioButtonMasc);
        sexoFeminino = findViewById(R.id.radioButtonFem);
        sexoIndefinido = findViewById(R.id.radioButtonInd);
        textoResultadoSexo = findViewById(R.id.edit_resultadoSexo);
    }

    public void radioButton(){

        String sexo = "";
        if (sexoMasculino.isChecked()){
            String opcaoSexo = sexoMasculino.getText().toString();
            sexo = opcaoSexo;

        }else if (sexoFeminino.isChecked()){
            String opcaoSexo = sexoFeminino.getText().toString();
            sexo = opcaoSexo;
        }else{
            String opcaoSexo = sexoIndefinido.getText().toString();
            sexo = opcaoSexo;
        }

        textoResultadoSexo.setText(sexo);

    }


    public void checkbox(){

        String texto = " ";

        if(checkBranco.isChecked()){
            //texto = "Branco selecionado - ";

            String corSelecionada = checkBranco.getText().toString();
            texto = corSelecionada;

        }

        if(checkPreto.isChecked()){
           //texto = texto + "Preto selecionado - ";

            String corSelecionada = checkPreto.getText().toString();
            texto = texto + corSelecionada;

        }

        if(checkPardo.isChecked()){
            //texto = texto + "Pardo selecionado - ";

            String corSelecionada = checkPardo.getText().toString();
            texto = texto + corSelecionada;

        }

       textoResultadoLing.setText(texto);

    }

    public void salvar(View view){

        radioButton();

        checkbox();


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

        checkBranco.setChecked(false);
        checkPreto.setChecked(false);
        checkPardo.setChecked(false);
        textoResultadoLing.setText("Resultado Ling");

        sexoMasculino.setChecked(false);
        sexoFeminino.setChecked(false);
        sexoIndefinido.setChecked(false);
        textoResultadoSexo.setText("Resultado Sexo");

    }
}