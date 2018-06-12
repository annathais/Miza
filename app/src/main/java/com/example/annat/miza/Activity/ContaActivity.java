package com.example.annat.miza.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.annat.miza.R;

public class ContaActivity extends BaseActivity {

    private Button btDetalhesConta;
    private Button btExcluirConta;
    private Button btSairConta;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        btDetalhesConta = (Button) findViewById(R.id.bt_conta_detalhes);
        btExcluirConta = (Button) findViewById(R.id.bt_conta_excluir);
        btSairConta = (Button) findViewById(R.id.bt_conta_sair);

        btDetalhesConta.setOnClickListener(detalharConta());
        btExcluirConta.setOnClickListener(excluirConta());
        btSairConta.setOnClickListener(sairConta());

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

    private View.OnClickListener detalharConta() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }
}