package com.example.annat.miza.Domain;

import android.util.Log;

import com.example.annat.miza.DB.DBFirebase;
import com.example.annat.miza.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private static List<Produto> produtos = new ArrayList<Produto>();
    private static DatabaseReference reference = new DBFirebase().getReference().child("produto");
    public static void setProdutos(List<Produto> produtos) {
        ProdutoService.produtos = produtos;
    }
    public static List<Produto> getProdutos(){
        return produtos;
    }

    public static void saveProdutos(String nomeProduto, BigDecimal precoProduto, int lote,
                                    String supermercado, String departamento, byte[] imagem){
        try{
            //produtos.add(new Produto(nomeProduto, precoProduto, lote, supermercado, departamento, imagem));
            //produtos.add(new Produto(nomeProduto, precoProduto, departamento));
        }catch (Error error){

        }
    }


    public static Produto getItemProduto(int pos){
        return produtos.get(pos);
    }

    public static List<Produto> searchProduto(final String nome){
        final List<Produto> busca = new ArrayList<>();
        reference.child("nome").equalTo(nome).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot data: dataSnapshot.getChildren()) {
                        busca.add((Produto) data.getValue(Produto.class));

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        return busca;

    }

    public static List<Produto> searchProdutoByDepartamento(final String nomeDepartamento) {
        final List<Produto> buscaByDep = new ArrayList<>();
        Query query =  reference.child("departamento").equalTo(nomeDepartamento);
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot data: dataSnapshot.getChildren()) {
                        buscaByDep.add((Produto) data.getValue(Produto.class));
                }
                Log.i("Departamento",""+buscaByDep);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        return buscaByDep;

    }
}
