package com.example.annat.miza.Activity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.annat.miza.Adapter.AdapterMostrarProduto;
import com.example.annat.miza.Domain.Produto;
import com.example.annat.miza.Domain.ProdutoService;
import com.example.annat.miza.R;

import java.util.List;

public class ProdutoActivity extends BaseActivity{
    private ImageView imageview;
    private TextView tvNomeProduto;
    private TextView tvSupermercado;
    private TextView tvMenorPreco;
    private RecyclerView rvProdutos;
    private List<Produto> produtos;
    private Produto produto;

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
       // Intent intent = getIntent();
        Bundle bundle = new Bundle();
        int pos= bundle.getInt("position");
        this.produto = ProdutoService.getItemProduto(pos);
        imageview = (ImageView) findViewById(R.id.mostrar_img_produto);
        tvNomeProduto = (TextView) findViewById(R.id.mostrar_nome_doproduto);
        tvSupermercado = (TextView) findViewById(R.id.mostrar_menor_supermercado);
        tvMenorPreco = (TextView) findViewById(R.id.mostrar_menor_preco);
        rvProdutos = (RecyclerView) findViewById(R.id.mostrar_recyclerview_produto);

        rvProdutos.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        rvProdutos.setItemAnimator(new DefaultItemAnimator());
        rvProdutos.setHasFixedSize(true);

        tvNomeProduto.setText(produto.getNome());
        tvSupermercado.setText(produto.getSupermercado());
        tvMenorPreco.setText("R$ "+produto.getPreco());
        taskProdutos();

    }

    private void taskProdutos() {
        produtos = ProdutoService.searchProduto(produto.getNome());
        rvProdutos.setAdapter(new AdapterMostrarProduto(produtos,getBaseContext()));
    }
}
