package com.example.annat.miza.Activity;


import android.os.Bundle;

import com.example.annat.miza.Fragments.FragmentHome;
import com.example.annat.miza.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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
    }
}
