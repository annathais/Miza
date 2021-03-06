package com.example.annat.miza.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.annat.miza.Adapter.AdapterSupermercado;
import com.example.annat.miza.DB.DBFirebase;
import com.example.annat.miza.Domain.Supermercado;
import com.example.annat.miza.Domain.SupermercadoService;
import com.example.annat.miza.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FragmentSupermercado extends Fragment {
    private List<Supermercado> supermercados;
    private RecyclerView recyclerView;
    private DatabaseReference reference = new DBFirebase().getReference().child("Supermercado");
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle){
        View view = layoutInflater.inflate(R.layout.fragment_supermercado, viewGroup, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_supermercado);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        taskSupermercados();
    }
    private void taskSupermercados() {
        supermercados = new ArrayList<Supermercado>();

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot data: dataSnapshot.getChildren()) {
                    //Supermercado supermercado =(Supermercado) data.getValue(Supermercado.class);
                    supermercados.add((Supermercado) data.getValue(Supermercado.class));
                    Log.i("Supermercado class","Supermercados ="+supermercados);
                }
                recyclerView.setAdapter(new AdapterSupermercado(supermercados, getContext()));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //Log.i("Supermercado class","Supermercados ="+supermercados);
        //recyclerView.setAdapter(new AdapterSupermercado(supermercados, getContext()));
    }

    public static FragmentSupermercado newInstance(){
        FragmentSupermercado fragmentSupermercado = new FragmentSupermercado();
        return fragmentSupermercado;
    }
}
