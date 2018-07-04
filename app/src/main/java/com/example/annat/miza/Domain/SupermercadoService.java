package com.example.annat.miza.Domain;

import com.example.annat.miza.DB.DBFirebase;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

public class SupermercadoService {
    private List<Supermercado> supermercadoList = new ArrayList<Supermercado>();

    public List<Supermercado> getSupermercadoList(){
        return supermercadoList;
    }
    public void setSupermercadoList(List<Supermercado> supermercadoList){
        this.supermercadoList = supermercadoList;
    }

    public void saveSupermercados(String nome, String rua, int numero, String bairro,
                                         String telefone,String email, int cnpj, int cep,
                                  String cidade, String estado){
        try{
           // supermercadoList.add(new Supermercado(nome, rua, numero, bairro, telefone,
            //        email, cnpj, cep, cidade, estado));
        }catch (Error error){

        }
    }
}
