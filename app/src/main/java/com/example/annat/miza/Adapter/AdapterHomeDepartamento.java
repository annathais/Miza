package com.example.annat.miza.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterHomeDepartamento extends BaseAdapter {
    private  String[] departamentos = new String[]{"Açogue", "Bebidas", "Cereais", "Enlatados",
            "Frios", "Higiene", "Hortifruti", "Laticíneos", "Limpeza", "Petshop"
    };
    private Context context;

    public AdapterHomeDepartamento(Context context){
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return departamentos.length;
    }

    @Override
    public Object getItem(int position) {
        return departamentos[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        String departamento = departamentos[position];
        TextView textView = new TextView(context);
        float dip = 50;
        float densidade = context.getResources().getDisplayMetrics().density;
        int px = (int) (dip * densidade + 0.5f);
        textView.setHeight(px);
        textView.setText(departamento);
        return textView;
    }
}
