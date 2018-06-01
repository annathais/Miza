package com.example.annat.miza.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.view.View;

import com.example.annat.miza.Domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private SQLiteDatabase mizaApp;

    public DataBase(Context context){
        DBCore auxBd = new DBCore(context);
        mizaApp = auxBd.getWritableDatabase();
    }

    public void inserir(Usuario usuario){
        ContentValues valores = new ContentValues();
        valores.put("nomeUsuario", usuario.getNomeUsuario());
        valores.put("emailUsuario", usuario.getEmailUsuario());
        valores.put("senhaUsuario", usuario.getSenhaUsuario());
        valores.put("userUsuario", usuario.getUserUsuario());

        mizaApp.insert("usuario", null, valores);
    }

    public void atualizar(Usuario usuario){
        ContentValues valores = new ContentValues();
        valores.put("nomeUsuario", usuario.getNomeUsuario());
        valores.put("emailUsuario", usuario.getEmailUsuario());
        valores.put("senhaUsuario", usuario.getSenhaUsuario());
        valores.put("userUsuario", usuario.getUserUsuario());

        mizaApp.update("usuario", valores, "_id = ?", new String[]{""+usuario.getIdUsuario()});
    }

    public void deletar(Usuario usuario){
        mizaApp.delete("usuario", "_id = "+usuario.getIdUsuario(), null);
    }

    public List<Usuario> buscar(){
        List<Usuario> list = new ArrayList<Usuario>();
        String[] colunas = new String[]{"_id", "nomeUsuario", "emailUsuario", "userUsuario"};

        Cursor cursor = mizaApp.query("usuario", colunas, null, null, null, null, "nomeUsuario");

        if(cursor.getCount() > 0){
            cursor.moveToFirst();

            do{
                Usuario usuario = new Usuario(
                        (int) cursor.getLong(0),
                        cursor.getString(1),//email
                        cursor.getString(2),//nome
                        cursor.getString(3),//senha
                        cursor.getString(4)//user
                );

                list.add(usuario);

            }while(cursor.moveToNext());

        }
        return list;
    }

    public Usuario validarLogin(String user, String senha){
        String[] colunas = new String[]{"senhaUsuario", "userUsuario"};
        String[] argumentos = {user,senha};
        Cursor cursor = mizaApp.query("usuario",colunas,"userUsuario ='"+user+"' AND senhaUsuario='"+senha+"'",null,null,null,null );

        Usuario userLogin;
        if(cursor.getCount() > 0) {
            cursor.moveToFirst();
            userLogin = new Usuario(
                    (int) cursor.getLong(0),
                    cursor.getString(1),//email
                    cursor.getString(2),//nome
                    cursor.getString(3),//senha
                    cursor.getString(4)//user
            );
            return userLogin;
        }
        return null;
    }




}
