package com.example.annat.miza.Activity;


import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import com.example.annat.miza.DB.DBFirebase;
import com.example.annat.miza.Domain.ProdutoService;
import com.example.annat.miza.Domain.Supermercado;
import com.example.annat.miza.Fragments.FragmentHome;
import com.example.annat.miza.R;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity {

    private FirebaseDatabase fbDatabase;
    private DatabaseReference dbReference;
    private static boolean validator = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar("MIZA");
        setUpNavigationDrawer();
        inicializarFragment(new FragmentHome());
        if(!verificaConexao()){
            alertaConexao();
        }

    }

    public  boolean verificaConexao() {
        boolean conectado;
        ConnectivityManager conectivtyManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (conectivtyManager.getActiveNetworkInfo() != null
                && conectivtyManager.getActiveNetworkInfo().isAvailable()
                && conectivtyManager.getActiveNetworkInfo().isConnected()) {
            conectado = true;
        } else {
            conectado = false;
        }
        return conectado;
    }
    private void alertaConexao() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Algo deu errado");
        builder.setMessage("Parece que voce esta sem conexão com a internet");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
