package com.example.annat.miza.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.annat.miza.Adapter.AdapterProduto;
import com.example.annat.miza.Domain.Produto;
import com.example.annat.miza.Domain.ProdutoService;
import com.example.annat.miza.R;

import java.util.List;

public class ProdutoDepartamentoActivity extends BaseActivity{
    private RecyclerView recyclerViewProd;
    private List<Produto> produtos;
    private String nomeDepartamento;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos_departamento);
        recyclerViewProd = (RecyclerView) findViewById(R.id.recyclerview_prod_departamento);
        recyclerViewProd.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        recyclerViewProd.setItemAnimator(new DefaultItemAnimator());
        recyclerViewProd.setHasFixedSize(true);
        Bundle params = new Bundle();
        this.nomeDepartamento = params.getString("nome");
        setUpToolbar(nomeDepartamento);
        taskProdutos();
    }

    private void taskProdutos() {
        produtos = ProdutoService.searchProdutoByDepartamento(nomeDepartamento);
        recyclerViewProd.setAdapter(new AdapterProduto(produtos,getBaseContext(),onClickProd()));
    }

    private AdapterProduto.ProdutoOnClickListener onClickProd() {
        return new AdapterProduto.ProdutoOnClickListener() {
            @Override
            public void onClickProduto(View view, int id) {
                Toast.makeText(getBaseContext(),"CLick",Toast.LENGTH_SHORT).show();
            }
        };
    }
}
