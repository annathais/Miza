package com.example.annat.miza.Domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private static List<Produto> produtos = new ArrayList<Produto>();

    public static List<Produto> getProdutos(){
       // criarProduto();
        return produtos;
    }

    public static void saveProdutos(String nomeProduto, BigDecimal precoProduto, int lote,
                                    String supermercado, String departamento, byte[] imagem){
        try{
            produtos.add(new Produto(nomeProduto, precoProduto, lote, supermercado, departamento, imagem));
        }catch (Error error){

        }
    }

    public void criarProduto(){
        for(int i = 0; i < 5; i++){
            //saveProdutos(nomeProduto, precoProduto, lote, supermercado, departamento, imagem);
        }
    }
}
