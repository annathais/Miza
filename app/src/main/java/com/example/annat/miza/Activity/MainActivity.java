package com.example.annat.miza.Activity;


import android.os.Bundle;
import android.util.Log;

import com.example.annat.miza.DB.DBFirebase;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar("MIZA");
        setUpNavigationDrawer();
        inicializarFragment(new FragmentHome());
        cadastra();

    }

    private static void cadastra(){
        DatabaseReference reference = new DBFirebase().getReferenceSupermercado().child("Supermercado");
        Map<String,Supermercado> supermercadoMap = new HashMap<>();
        supermercadoMap.put("Dona Novinha", new Supermercado("Dona Novinha",
                "Isac Peres",666,"Centro","91666666","donanovinha@velha.com"));
        reference.setValue(supermercadoMap, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                if(databaseError == null) {
                    Log.i("AMEM","tudo ok");
                }
            }
        });

    }
}
