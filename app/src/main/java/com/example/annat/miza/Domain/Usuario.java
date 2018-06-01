package com.example.annat.miza.Domain;

import com.example.annat.miza.DB.DBFirebase;
import com.google.firebase.database.DatabaseReference;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private String userUsuario;
    private int idUsuario;


    public Usuario( int idUsuario, String emailUsuario, String nomeUsuario, String senhaUsuario, String userUsuario){
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.userUsuario = userUsuario;
        this.idUsuario = idUsuario;
    }
    public Usuario(String nomeUsuario,String emailUsuario,String senhaUsuario, String userUsuario){
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.userUsuario = userUsuario;
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
       this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getUserUsuario() {
        return userUsuario;
    }

    public void setUserUsuario(String userUsuario) {
        this.userUsuario = userUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


}
