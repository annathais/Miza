package com.example.annat.miza.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.annat.miza.Fragments.FragmentHomeDepartamento;
import com.example.annat.miza.Fragments.FragmentHomeDestaque;
import com.example.annat.miza.R;

public class AdapterTabsHome extends FragmentPagerAdapter {
    private Context context;

    public AdapterTabsHome (Context context, FragmentManager fm){
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return context.getString(R.string.tabhome_destaque);
        else
            return context.getString(R.string.tabhome_departamento);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position == 0) {
            fragment = FragmentHomeDestaque.newInstance();
        }
        else{
            fragment = FragmentHomeDepartamento.newInstance();
        }
        return fragment;
    }
}