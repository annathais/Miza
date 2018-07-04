package com.example.annat.miza.Domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto{
    private String nome;
    private float preco;
   // private int lote;
    private String supermercado;
    private String departamento;
    private String imagem;
    private byte[] imagemByte;

    public Produto(String nomeProduto, float precoProduto,
                    String departamento, String supermercado, int imagem){
        this.nome = nomeProduto;
        this.preco = precoProduto;
       // this.imagem = imagem;
        this.departamento = departamento;
        this.supermercado = supermercado;
    }
    public Produto(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nomeProduto) {
        this.nome = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float precoProduto) {
        this.preco = precoProduto;
    }

   /* public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
    */
    public String getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getImagem() {
       return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    /*
    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    */
    public String toString(){
        return "Nome: "+nome+"\n" +
                "Preco:"+preco;
    }

}
