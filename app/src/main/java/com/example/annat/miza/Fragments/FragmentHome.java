package com.example.annat.miza.Fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.annat.miza.Adapter.AdapterTabsHome;
import com.example.annat.miza.R;

public class FragmentHome extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.fragment_home, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager_home);
        viewPager.setOffscreenPageLimit(1);
        viewPager.setAdapter(new AdapterTabsHome(getContext(), getChildFragmentManager()));
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tablayout_home);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}
