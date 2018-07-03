package com.example.annat.miza.Domain;

import java.util.List;

public class Supermercado {
    private String nome;
    private String rua;
    private int numero;
    private String bairro;
    private String telefone;
    private String email;
    private int cnpj;
    private int cep;
    private String cidade;
    private String estado;
    private List<Produto> produto;
    public Supermercado(){

    }

    public Supermercado(String nome, String rua, int numero, String bairro, String telefone,
                        String email, int cnpj, int cep, String cidade, String estado){
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro =bairro;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produtos) {
        this.produto = produtos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nCNPJ: "
                + cnpj + "\nCEP: " + cep + "\nRua: " + rua + "\nNumero: " + numero + "\nBairro: "
                + bairro + "\nCidade: " + cidade + "\nEstado: " + estado;
    }
}
