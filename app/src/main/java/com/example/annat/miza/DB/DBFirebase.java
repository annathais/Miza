package com.example.annat.miza.DB;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBFirebase {
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReferenceFromUrl("https://miza-df4ae.firebaseapp.com");

    public DatabaseReference getRef(){
        return ref;
    }
}
