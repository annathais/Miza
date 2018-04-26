package com.example.annat.miza.Domain;

import java.util.ArrayList;
import java.util.List;

public class SupermercadoService {
    private static List<Supermercado> supermercadoList = new ArrayList<Supermercado>();

    public static List<Supermercado> getSupermercadoList(){
        return supermercadoList;
    }

    public static void saveSupermercados(String nome, String rua, int numero, String bairro,
                                         String telefone){
        try{
            supermercadoList.add(new Supermercado(nome, rua, numero, bairro, telefone));
        }catch (Error error){

        }
    }
//TA FALTANDO EU PEGAR OS DADOS USANDO O GET
    public void criarSupermercado(String nome, String rua, int numero, String bairro, String telefone){
        for(int i = 0; i < 10; i++){
            saveSupermercados(nome, rua, numero, bairro, telefone);
        }
    }

}
