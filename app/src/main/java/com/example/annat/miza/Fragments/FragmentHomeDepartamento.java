package com.example.annat.miza.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.annat.miza.Activity.ProdutoActivity;
import com.example.annat.miza.Activity.ProdutoDepartamentoActivity;
import com.example.annat.miza.Adapter.AdapterHomeDepartamento;
import com.example.annat.miza.R;

public class FragmentHomeDepartamento extends android.support.v4.app.Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.fragment_home_departamento, container, false);
        listView = (ListView) view.findViewById(R.id.listview_home_departamento);
        listView.setAdapter(new AdapterHomeDepartamento(view.getContext()));

        listView.setOnItemClickListener(clicouDepartamento());
        return view;
    }


    protected AdapterView.OnItemClickListener clicouDepartamento(){
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String departamento = (String) adapterView.getAdapter().getItem(i);
                Bundle params = new Bundle();
                params.putString("nome",departamento);
                Intent intent = new Intent(getContext(), ProdutoDepartamentoActivity.class);
                getContext().startActivity(intent);
            }
        };

    }

    public static FragmentHomeDepartamento newInstance(){
        FragmentHomeDepartamento fhd = new FragmentHomeDepartamento();
        return fhd;
    }

}