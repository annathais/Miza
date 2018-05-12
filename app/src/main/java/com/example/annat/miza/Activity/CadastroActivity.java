package com.example.annat.miza.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.annat.miza.R;

import org.w3c.dom.Text;

public class CadastroActivity extends BaseActivity {

    private EditText etEmail;
    private EditText etSenha;
    private EditText etRepetirSenha;
    private EditText etNome;
    private EditText etUserName;
    private TextView tvFazerLogin;
    private Button btCancelar;
    private Button btCadastrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        setUpToolbar("Cadastrar");

        etEmail = (EditText) findViewById(R.id.et_cadastro_email_usuario);
        etSenha = (EditText) findViewById(R.id.et_cadastro_senha_usuario);
        etRepetirSenha = (EditText) findViewById(R.id.et_cadastro_repetir_senha);
        etNome = (EditText) findViewById(R.id.et_cadastro_nome_usuario);
        etUserName = (EditText) findViewById(R.id.et_cadastro_username);
        tvFazerLogin = (TextView) findViewById(R.id.tv_cadastro_fazer_login);
        btCancelar = (Button) findViewById(R.id.bt_cadastro_cancelar);
        btCadastrar = (Button) findViewById(R.id.bt_cadastrar);

        tvFazerLogin.setOnClickListener(fazerLogin());
        btCadastrar.setOnClickListener(cadastrar());
        btCancelar.setOnClickListener(cancelar());
    }

    private View.OnClickListener cancelar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };
    }

    private View.OnClickListener cadastrar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    private View.OnClickListener fazerLogin(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarIntent(LoginActivity.class, null);
            }
        };
    }
}
