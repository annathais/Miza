package com.example.annat.miza.Domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto{
    private String nomeProduto;
    private BigDecimal precoProduto;
   // private int lote;
    private String supermercado;
    private String departamento;
    private int imagem;

    public Produto(String nomeProduto, BigDecimal precoProduto,
                    String departamento, String supermercado, int imagem){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.imagem = imagem;
        this.departamento = departamento;
        this.supermercado = supermercado;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
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

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

}
