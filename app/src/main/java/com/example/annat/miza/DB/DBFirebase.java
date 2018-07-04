package com.example.annat.miza.DB;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class DBFirebase {
    private final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    private FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private FirebaseStorage storage = FirebaseStorage.getInstance();
    private DatabaseReference reference = firebaseDatabase.getReference("server/database");
    private StorageReference storageRef = storage.getReference("Produtos/");

    StorageReference pathReference = storageRef.child("/Produtos");

    public StorageReference getPathReference() {
        return storageRef;
    }


    public FirebaseAuth getFirebaseAuth() {
        return firebaseAuth;
    }

    public DatabaseReference getReference() {
        return reference;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }
    public FirebaseUser getFirebaseUser() {
        if(firebaseAuth.getCurrentUser()!=null){
            return firebaseAuth.getCurrentUser();
        }else
            return null;
    }
}
