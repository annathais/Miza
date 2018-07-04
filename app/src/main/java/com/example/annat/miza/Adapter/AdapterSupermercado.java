package com.example.annat.miza.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.annat.miza.Domain.Supermercado;
import com.example.annat.miza.R;

import java.util.List;

public class AdapterSupermercado extends RecyclerView.Adapter<AdapterSupermercado.SupermercadoViewHolder>{

    private final List<Supermercado> supermercados;
    private final Context context;
    private TranslateAnimation animation;

    public AdapterSupermercado(List<Supermercado> supermercados, Context context){
        this.supermercados = supermercados;
        this.context = context;
    }

    @Override
    public SupermercadoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_supermercado, parent, false);
        SupermercadoViewHolder supermercadoViewHolder = new SupermercadoViewHolder(view);
        return supermercadoViewHolder;
    }

    @Override
    public void onBindViewHolder(final SupermercadoViewHolder holder, final int position) {
        Supermercado supermercado = this.supermercados.get(position);
        holder.nomeSupermercado.setText(supermercado.getNome());
        holder.ruaSupermercado.setText(supermercado.getRua());
        holder.numeroSupermercado.setText(""+supermercado.getNumero());
        holder.bairroSupermercado.setText(supermercado.getBairro());
        holder.telefoneSupermercado.setText(supermercado.getTelefone());
        holder.btShowSupermercado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(holder.layoutInfoSupermercado.getVisibility() == View.VISIBLE){
                    holder.layoutInfoSupermercado.setVisibility(View.GONE);
                    holder.btShowSupermercado.setImageResource(R.mipmap.ic_keyboard_arrow_down_black_24dp);
                }else{
                    holder.layoutInfoSupermercado.setVisibility(View.VISIBLE);
                    holder.btShowSupermercado.setImageResource(R.mipmap.ic_keyboard_arrow_up_black_24dp);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.supermercados != null ? supermercados.size():0;
    }

    public static class SupermercadoViewHolder extends RecyclerView.ViewHolder{
        public TextView nomeSupermercado;
        public TextView ruaSupermercado;
        public TextView numeroSupermercado;
        public TextView bairroSupermercado;
        public TextView telefoneSupermercado;

        public ImageButton btShowSupermercado;
        public LinearLayout layoutInfoSupermercado;
        public SupermercadoViewHolder(View view){
            super(view);
            nomeSupermercado = (TextView) view.findViewById(R.id.card_sm_nome);
            ruaSupermercado = (TextView) view.findViewById(R.id.card_info_sm_rua);
            numeroSupermercado = (TextView) view.findViewById(R.id.card_info_sm_numero);
            bairroSupermercado = (TextView) view.findViewById(R.id.card_info_sm_bairro);
            telefoneSupermercado = (TextView) view.findViewById(R.id.card_info_sm_telefone);
            btShowSupermercado = (ImageButton) view.findViewById(R.id.card_sm_button);
            layoutInfoSupermercado = (LinearLayout) view.findViewById(R.id.card_info_sm);
        }

    }
}
