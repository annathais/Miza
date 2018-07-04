package com.example.annat.miza.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.annat.miza.Domain.Produto;
import com.example.annat.miza.R;

import java.util.List;

public class AdapterMostrarProduto extends RecyclerView.Adapter<AdapterMostrarProduto.ProdutoViewHolder> {


    private final List<Produto> produtos;
    private final Context context;

    public AdapterMostrarProduto(List<Produto> produtos, Context context) {
        this.produtos = produtos;
        this.context = context;
    }


    @Override
    public ProdutoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_mostrar_produto, parent, false);
        ProdutoViewHolder produtoViewHolder = new ProdutoViewHolder(view);
        return produtoViewHolder;
    }

    @Override
    public void onBindViewHolder(final ProdutoViewHolder holder, final int position) {
        Produto produto = this.produtos.get(position);
        holder.tvNomeSupermercado.setText(produto.getSupermercado());
        holder.tvPrecoSupermercado.setText("R$ "+produto.getPreco());

    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public static class ProdutoViewHolder extends RecyclerView.ViewHolder{

        public TextView tvNomeSupermercado;
        public TextView tvPrecoSupermercado;



        public ProdutoViewHolder(View view){
            super(view);
            tvNomeSupermercado = (TextView) view.findViewById(R.id.tv_supermercado_mostrar);
            tvPrecoSupermercado = (TextView) view.findViewById(R.id.tv_preco_mostrar);
        }

    }
}
