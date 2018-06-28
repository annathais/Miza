package com.example.annat.miza.DB;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBFirebase {
    private final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    private FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference referenceSupermercado = firebaseDatabase.getReference("server/saving-data/miza-df4ae/Supermercado");

    public FirebaseAuth getFirebaseAuth() {
        return firebaseAuth;
    }

    public DatabaseReference getReferenceSupermercado() {
        return referenceSupermercado;
    }

    public FirebaseUser getFirebaseUser() {
        if(firebaseAuth.getCurrentUser()!=null){
            return firebaseAuth.getCurrentUser();
        }else
            return null;
    }
}
