package com.example.annat.miza.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.annat.miza.Adapter.AdapterProduto;
import com.example.annat.miza.Adapter.AdapterSupermercado;
import com.example.annat.miza.DB.DBFirebase;
import com.example.annat.miza.Domain.Produto;
import com.example.annat.miza.Domain.ProdutoService;
import com.example.annat.miza.Domain.Supermercado;
import com.example.annat.miza.Domain.SupermercadoService;
import com.example.annat.miza.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FragmentHomeDestaque extends android.support.v4.app.Fragment {
    private RecyclerView recyclerView;
    private List<Produto> produtos ;
    private DatabaseReference reference = new DBFirebase().getReference().child("produto");
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container,
                             Bundle savedInstanceState){

        View view = layoutInflater.inflate(R.layout.fragment_home_destaque, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycleview_produto);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        return view;
    }

    private AdapterProduto.ProdutoOnClickListener onClickProduto(){
        return new AdapterProduto.ProdutoOnClickListener() {
            @Override
            public void onClickProduto(View view, int id) {
                Produto produto = produtos.get(id);
                Toast.makeText(view.getContext(),produto.getNome(),Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("INICIA","COMEÇO");
        taskSupermercados();
    }

    private void taskSupermercados() {
        this.produtos= new ArrayList<Produto>(20);// = ProdutoService.getProdutos();
        reference.orderByChild("preco").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot data: dataSnapshot.getChildren()) {
                    produtos.add((Produto) data.getValue(Produto.class));

                }
                ProdutoService.setProdutos(produtos);
                recyclerView.setAdapter(new AdapterProduto(produtos, getContext(),onClickProduto()));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public static FragmentHomeDestaque newInstance(){
        FragmentHomeDestaque fragmentHomeDestaque = new FragmentHomeDestaque();
        return fragmentHomeDestaque;
    }
}