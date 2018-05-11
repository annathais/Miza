package com.example.annat.miza.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.annat.miza.R;

public class LoginActivity extends BaseActivity{
    private EditText etEmail;
    private EditText etSenha;
    private TextView tvFazerCadastro;
    private TextView tvRecuperarSenha;
    private TextView tvLoginIncorreto;
    private Button btCancelar;
    private Button btEntrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUpToolbar("Login");

        etEmail =(EditText) findViewById(R.id.et_login_usuario);
        etSenha =(EditText) findViewById(R.id.et_senha_usuario);
        tvFazerCadastro = (TextView) findViewById(R.id.tv_fazer_cadastro);
        tvRecuperarSenha = (TextView) findViewById(R.id.tv_recuperar_senha);
        tvLoginIncorreto = (TextView) findViewById(R.id.tv_login_incorreto);
        btCancelar = (Button) findViewById(R.id.bt_cancelar);
        btEntrar = (Button) findViewById(R.id.bt_entrar);

        tvFazerCadastro.setOnClickListener(fazerCadastro());
        tvRecuperarSenha.setOnClickListener(recuperarSenha());
        btCancelar.setOnClickListener(cancelar());
        btEntrar.setOnClickListener(entrar());
    }

    private View.OnClickListener entrar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    private View.OnClickListener cancelar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };
    }

    private View.OnClickListener recuperarSenha() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    private View.OnClickListener fazerCadastro(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarIntent(CadastroActivity.class, null);
            }
        };
    }
}
