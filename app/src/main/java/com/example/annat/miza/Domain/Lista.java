package com.example.annat.miza.Domain;

public class Lista {
    private int idLista;
    private String nomeLista;
    private Produto produtos;

    public Lista(int idLista, String nomeLista){
        this.idLista = idLista;
        this.nomeLista = nomeLista;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }
}
