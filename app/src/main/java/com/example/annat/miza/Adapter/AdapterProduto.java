package com.example.annat.miza.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.annat.miza.Activity.BaseActivity;
import com.example.annat.miza.Activity.ProdutoActivity;
import com.example.annat.miza.DB.DBFirebase;
import com.example.annat.miza.R;

import com.example.annat.miza.Domain.Produto;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.StorageReference;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>{
    private final List<Produto> produtos;
    private ProdutoOnClickListener produtoOnClickListener;
    private final Context context;
    private DBFirebase dbFirebase = new DBFirebase();

    public AdapterProduto(List<Produto> produtos, Context context,
                          ProdutoOnClickListener produtoOnClickListener) {
        this.produtos = produtos;
        this.produtoOnClickListener = produtoOnClickListener;
        this.context = context;
    }

    @Override
    public ProdutoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_produto, parent, false);
        ProdutoViewHolder holder = new ProdutoViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final ProdutoViewHolder holder, final int position) {
        Produto produto = produtos.get(position);
        double valor = produto.getPreco();
        //carregaImagem(produto,holder.imagemProduto);
       // Glide.with(context)
         //       .using(new FirebaseImageLoader())
           //     .load(dbFirebase.getPathReference().child(produto.getImagem()))
             //   .into(holder.imagemProduto);
        //int foto = produto.getImagem();
       // if(foto!=null) {
            //Bitmap imagem = BitmapFactory.decodeByteArray(foto, 0, foto.length);
           // holder.imagemProduto.setImageResource(foto);
        //}
        holder.nomeProduto.setText(produto.getNome());
        holder.precoProduto.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(valor)));
        holder.supermercado.setText(produto.getSupermercado());

        if(produtoOnClickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   //produtoOnClickListener.onClickProduto(holder.itemView,position);
                    //Produto produto = produtos.get(position);
                    produtoOnClickListener.onClickProduto(holder.itemView,position);
                }
            });
        }

    }

    private void carregaImagem(Produto produto, ImageView img) {
        //Log.i("img",produto.getImagem());
        // Load the image using Glide
        Glide.with(context)
                .using(new FirebaseImageLoader())
                .load(dbFirebase.getPathReference().child(produto.getImagem()))
                .into(img);
    }

    @Override
    public int getItemCount(){
        return this.produtos != null ? produtos.size():0;
    }

    public interface ProdutoOnClickListener{
        void onClickProduto(View view, int id);
    }

    public static class ProdutoViewHolder extends RecyclerView.ViewHolder{
        public TextView nomeProduto;
        public TextView precoProduto;
        public TextView supermercado;
        public ImageView imagemProduto;

        public ProdutoViewHolder(View view){
            super(view);
            nomeProduto = (TextView) view.findViewById(R.id.nome_produto);
            precoProduto = (TextView) view.findViewById(R.id.preco_produto);
            supermercado = (TextView) view.findViewById(R.id.nome_supermercado);
            imagemProduto = (ImageView) view.findViewById(R.id.imagem_produto);
        }
    }
}