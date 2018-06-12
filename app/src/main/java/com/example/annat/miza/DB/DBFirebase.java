package com.example.annat.miza.DB;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBFirebase {
    final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

    public FirebaseAuth getFirebaseAuth() {
        return firebaseAuth;
    }

    public FirebaseUser getFirebaseUser() {
        if(firebaseAuth.getCurrentUser()!=null){
            return firebaseAuth.getCurrentUser();
        }else
            return null;
    }
}
