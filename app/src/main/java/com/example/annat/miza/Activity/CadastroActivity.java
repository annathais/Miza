package com.example.annat.miza.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.util.Patterns;
import android.widget.Toast;

import com.example.annat.miza.Domain.Usuario;
import com.example.annat.miza.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;


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
    private Usuario usuario;
    private FirebaseAuth firebaseAuth;
    private ProgressBar progressBar;
    private String email,senha,nome,repetirSenha;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        setUpToolbar("Cadastrar");

        etEmail = (EditText) findViewById(R.id.et_cadastro_email_usuario);
        etSenha = (EditText) findViewById(R.id.et_cadastro_senha_usuario);
        etRepetirSenha = (EditText) findViewById(R.id.et_cadastro_repetir_senha);
        etNome = (EditText) findViewById(R.id.et_cadastro_nome_usuario);

        tvFazerLogin = (TextView) findViewById(R.id.tv_cadastro_fazer_login);
        btCancelar = (Button) findViewById(R.id.bt_cadastro_cancelar);
        btCadastrar = (Button) findViewById(R.id.bt_cadastrar);

        tvFazerLogin.setOnClickListener(fazerLogin());
        btCadastrar.setOnClickListener(cadastrar());
        btCancelar.setOnClickListener(cancelar());
        progressBar = (ProgressBar) findViewById(R.id.progressbarCadastro);

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
                email = etEmail.getText().toString().trim();
                senha = etSenha.getText().toString().trim();
                nome = etNome.getText().toString().trim();
                repetirSenha = etRepetirSenha.getText().toString().trim();
                if (email.isEmpty()) {
                    etEmail.setError("Insira um email");
                    etEmail.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    etEmail.setError("Insira um email valido");
                    etEmail.requestFocus();
                    return;
                }
                if (senha.isEmpty()) {
                    etSenha.setError("Insira uma senha");
                    etSenha.requestFocus();
                    return;
                }
                if (senha.length() < 6) {
                    etSenha.setError("Insira uma senha de no minino 6 caracteres");
                    etSenha.requestFocus();
                    return;
                }
                if (nome.isEmpty()) {
                    etNome.setError("Insira seu Nome");
                    etNome.requestFocus();
                    return;
                }
                if(!senha.equals(repetirSenha)){
                    etRepetirSenha.setError("Verifique a senha digitada");
                    etRepetirSenha.requestFocus();
                }
                progressBar.setVisibility(View.VISIBLE);
                firebase.getFirebaseAuth().createUserWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                            firebaseAuth.signInWithEmailAndPassword(email,senha);
                            UserProfileChangeRequest profile = new UserProfileChangeRequest.Builder()
                                    .setDisplayName(nome)
                                    .build();
                            progressBar.setVisibility(View.GONE);
                            finish();
                            startActivity(new Intent(CadastroActivity.this, MainActivity.class));
                        } else {

                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                Toast.makeText(getApplicationContext(), "Email ja registrado", Toast.LENGTH_SHORT).show();

                            } else {
                                Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }

                        }
                    }
                });

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
