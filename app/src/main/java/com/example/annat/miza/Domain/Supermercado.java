package com.example.annat.miza.Domain;

public class Supermercado {
    private String nome;
    private String rua;
    private int numero;
    private String bairro;
    private String telefone;
    private String email;


    public Supermercado(String nome, String rua, int numero, String bairro, String telefone,String email){
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro =bairro;
        this.telefone = telefone;
        this.email = email;
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
}
