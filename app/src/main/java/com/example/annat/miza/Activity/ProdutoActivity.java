package com.example.annat.miza.Activity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.annat.miza.R;

public class ProdutoActivity extends BaseActivity{

    @Override
    protected void setUpToolbar(String titulo) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrarproduto);
        setUpToolbar("Produto");
        Intent intent = getIntent();
        int pos= intent.getIntExtra("position",-1);

    }
}
