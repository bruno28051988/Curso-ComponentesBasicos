package com.br.cursocomponentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity4 extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private CheckBox checkJava, checkJs, checkPython, checkCmaismais;
    private TextView textoResDados, textoResLing ,textoResSexo;
    private RadioButton sexoMasculino, sexoFeminino, sexoIndefinido;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        campoNome = findViewById(R.id.ed_nome);
        campoEmail = findViewById(R.id.ed_email);

        checkJava = findViewById(R.id.check_java);
        checkJs = findViewById(R.id.check_js);
        checkPython = findViewById(R.id.check_python);
        checkCmaismais = findViewById(R.id.check_c2);

        textoResDados = findViewById(R.id.text_ResutadosDados);
        textoResLing = findViewById(R.id.text_ResutadosLing);

        sexoMasculino = findViewById(R.id.radioButton_Masc);
        sexoFeminino = findViewById(R.id.radioButton_Fem);
        sexoIndefinido = findViewById(R.id.radioButton_Ind);

        opcaoSexo = findViewById(R.id.radioGroup_Sexo);

        textoResSexo = findViewById(R.id.text_ResutadosSexo);

        radioButton();

    }

    public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String sexo = "";
                if (i == R.id.radioButton_Masc){
                    String selecSexo = sexoMasculino.getText().toString();
                    sexo = selecSexo;

                }else if (i == R.id.radioButton_Fem){
                    String selecSexo = sexoFeminino.getText().toString();
                    sexo = selecSexo;

                }else{
                    String selecSexo = sexoIndefinido.getText().toString();
                    sexo = selecSexo;

                }

                textoResSexo.setText(sexo);

            }
        });
    }

    public void checkbox(){

        String texto ="";

        if(checkJava.isChecked()){
            String opcaoSelecionada = checkJava.getText().toString();
            texto = opcaoSelecionada;
        }
        if(checkJs.isChecked()){
            String opcaoSelecionada = checkJs.getText().toString();
            texto = texto + opcaoSelecionada;

        }
        if (checkPython.isChecked()){
            String opcaoSelecionada = checkPython.getText().toString();
            texto = texto + opcaoSelecionada;
        }
        if (checkCmaismais.isChecked()){
            String opcaoSelecionada = checkCmaismais.getText().toString();
            texto = texto + opcaoSelecionada;

        }

        textoResLing.setText(texto);

    }

    public void salvar(View view){
        checkbox();

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResDados.setText("Nome: " + nome + "\nE-mail: " + email);

    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");

        checkJava.setChecked(false);
        checkJs.setChecked(false);
        checkPython.setChecked(false);
        checkCmaismais.setChecked(false);

        sexoMasculino.setChecked(false);
        sexoFeminino.setChecked(false);
        sexoIndefinido.setChecked(false);
        
        textoResDados.setText("Resultado Dados");
        textoResLing.setText("Resultado Linguaguens");
        textoResSexo.setText("Resultado Sexo");
    }
}