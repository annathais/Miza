package com.example.annat.miza.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.annat.miza.R;

public class ContaActivity extends BaseActivity {

    private TextView tvNomeUsuario;
    private TextView tvEmailUsuario;
    private TextView tvSenhaUsuario;
    private EditText etNomeUsuario;
    private EditText etEmailUsuario;
    private EditText etSenhaUsuario;
    private Button btCancelarEdit;
    private Button btSalvarEdit;
    private Button btExcluirConta;
    private Button btSairConta;
    private ImageView ivEditar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);
        tvNomeUsuario = (TextView) findViewById(R.id.tv_usuario_nome);
        tvEmailUsuario = (TextView) findViewById(R.id.tv_usuario_email);
        tvSenhaUsuario = (TextView) findViewById(R.id.tv_usuario_senha);
        etNomeUsuario = (EditText) findViewById(R.id.et_usuario_nome);
        etEmailUsuario = (EditText) findViewById(R.id.et_usuario_email);
        etSenhaUsuario = (EditText) findViewById(R.id.et_usuario_nome);
        btCancelarEdit = (Button) findViewById(R.id.bt_cancelar_edit);
        btSalvarEdit = (Button) findViewById(R.id.bt_salvar_edit);
        btExcluirConta = (Button) findViewById(R.id.bt_conta_excluir);
        btSairConta = (Button) findViewById(R.id.bt_conta_sair);
        ivEditar = (ImageView) findViewById(R.id.iv_editar);

        setUpToolbar("Detalhes da Conta");

        btCancelarEdit.setOnClickListener(cancelarEdit());
        btSalvarEdit.setOnClickListener(salvarEdit());
        btExcluirConta.setOnClickListener(excluirConta());
        btSairConta.setOnClickListener(sairConta());
        ivEditar.setOnClickListener(editarUsuario());
    }

    private View.OnClickListener editarUsuario() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNomeUsuario.setEnabled(true);
                etEmailUsuario.setEnabled(true);
                etSenhaUsuario.setEnabled(true);
                btCancelarEdit.setVisibility(View.VISIBLE);
                btSalvarEdit.setVisibility(View.VISIBLE);
                btExcluirConta.setVisibility(View.GONE);
                btSairConta.setVisibility(View.GONE);

            }
        };
    }

    private View.OnClickListener salvarEdit() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    private View.OnClickListener cancelarEdit() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNomeUsuario.setEnabled(false);
                etEmailUsuario.setEnabled(false);
                etSenhaUsuario.setEnabled(false);
                btCancelarEdit.setVisibility(View.GONE);
                btSalvarEdit.setVisibility(View.GONE);
                btExcluirConta.setVisibility(View.VISIBLE);
                btSairConta.setVisibility(View.VISIBLE);
            }
        };
    }


    private View.OnClickListener sairConta() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebase.getFirebaseAuth().signOut();
                finish();
                iniciarIntent(MainActivity.class,null);
            }
        };
    }

    private View.OnClickListener excluirConta() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

}