package com.example.annat.miza.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.annat.miza.DB.DataBase;
import com.example.annat.miza.Domain.Usuario;
import com.example.annat.miza.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class LoginActivity extends BaseActivity{
    private EditText etEmail;
    private EditText etSenha;
    private TextView tvFazerCadastro;
    private TextView tvRecuperarSenha;
    private TextView tvLoginIncorreto;
    private Button btCancelar;
    private Button btEntrar;
    private String email,senha;
    private ProgressBar progressBar;

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
        progressBar = (ProgressBar) findViewById(R.id.progressbarLogin);
        tvFazerCadastro.setOnClickListener(fazerCadastro());
        tvRecuperarSenha.setOnClickListener(recuperarSenha());
        btCancelar.setOnClickListener(cancelar());
        btEntrar.setOnClickListener(entrar());
    }

    private View.OnClickListener entrar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = etEmail.getText().toString().trim();
                senha = etSenha.getText().toString().trim();
                if(email.isEmpty()){
                    etEmail.setError("Preencha o campo corretamente");
                    etEmail.requestFocus();
                }
                if(senha.isEmpty()){
                    etSenha.setError("Preencha o campo corretamente");
                    etSenha.requestFocus();
                }
                progressBar.setVisibility(View.VISIBLE);
                firebase.getFirebaseAuth().signInWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if(task.isSuccessful()){
                            finish();
                            iniciarIntent(MainActivity.class,null);
                        }
                        else{
                            toast(task.getException().getMessage());
                        }
                    }
                });

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
                iniciarIntent(RecuperarSenhaActitivty.class,null);
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
