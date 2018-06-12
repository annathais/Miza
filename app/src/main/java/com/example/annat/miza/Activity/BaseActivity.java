package com.example.annat.miza.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.annat.miza.DB.DBFirebase;
import com.example.annat.miza.Fragments.FragmentHome;
import com.example.annat.miza.Fragments.FragmentSupermercado;
import com.example.annat.miza.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class BaseActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    final DBFirebase firebase = new DBFirebase();
    protected void setUpToolbar(String titulo){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar!=null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    protected void inicializarFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container_home, fragment, "TAG").commit();
    }

    protected void setUpNavigationDrawer(){
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu_black_24dp);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        if(firebase.getFirebaseUser() !=null){
            navigationView.getMenu().findItem(R.id.nav_item_fazer_login).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_item_conta).setVisible(true);
            Log.i("LOGADO","TRUE");
        }

        if(navigationView != null && drawerLayout != null){
            setNavViewValues(navigationView, R.string.usuario, R.string.email, R.mipmap.ic_launcher_round);
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    item.setChecked(true);
                    drawerLayout.closeDrawers();
                    onNavDrawerItemSelected(item);
                    return true;
                }
            });
        }
    }

    static private void setNavViewValues(NavigationView navigationView, int usuario, int email, int ic_launcher_round) {
        View headerView = navigationView.getHeaderView(0);
        TextView nomeUsuario = (TextView) headerView.findViewById(R.id.nome_usuario);
        TextView emailUsuario = (TextView) headerView.findViewById(R.id.email_usuario);
        ImageView imagem =  (ImageView) headerView.findViewById(R.id.imagem_usuarioPhoto);

        nomeUsuario.setText(usuario);
        emailUsuario.setText(email);
        imagem.setImageResource(ic_launcher_round);
    }

    private void onNavDrawerItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.nav_item_home:
                inicializarFragment(new FragmentHome());
                break;
            case R.id.nav_item_supermercado:
                inicializarFragment(new FragmentSupermercado());
                break;
            case R.id.nav_item_configuracoes:
                toast("Clicou em Configurações");
                break;
            case R.id.nav_item_sobre:
                toast("Clicou em Sobre");
                break;
            case R.id.nav_item_conta:
                iniciarIntent(ContaActivity.class,null);
                break;
            case R.id.nav_item_fazer_login:
                iniciarIntent(LoginActivity.class, null);
                break;
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                if(drawerLayout != null){
                    openDrawer();
                    return true;
                }
        }
        return super.onOptionsItemSelected(item);
    }

    private void openDrawer() {
        if(drawerLayout != null){
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    private void closeDrawer() {
        if(drawerLayout != null){
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    public void toast(String s){
        Toast.makeText(getBaseContext(),s, Toast.LENGTH_SHORT).show();
    }

    public void iniciarIntent(Class classeDestino, Bundle params){
        Intent intent = new Intent(getBaseContext(), classeDestino);
        if(params != null){
            intent.putExtras(params);
        }
        startActivity(intent);
    }
}