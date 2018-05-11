package com.example.annat.miza.Domain;

import java.util.ArrayList;
import java.util.List;

public class SupermercadoService {
    private static List<Supermercado> supermercadoList = new ArrayList<Supermercado>();

    public static List<Supermercado> getSupermercadoList(){
        criarSupermercado();
        return supermercadoList;
    }

    public static void saveSupermercados(String nome, String rua, int numero, String bairro,
                                         String telefone){
        try{
            supermercadoList.add(new Supermercado(nome, rua, numero, bairro, telefone));
        }catch (Error error){

        }
    }

    public static void criarSupermercado(){
        for(int i = 0; i < 10; i++){
            saveSupermercados(""+i,""+i, i, ""+i, ""+i);
        }
    }

}
