package com.example.annat.miza.Domain;

public class Usuario {
    private String nomeUsuario;
    private String email;
    private String senha;

    public Usuario(String nu, String e, String s){
        nomeUsuario = nu;
        email = e;
        senha = s;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nu) {
        nomeUsuario = nu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String s) {
        senha = s;
    }
}
