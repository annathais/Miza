package com.example.annat.miza.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBCore extends SQLiteOpenHelper{

    private static final String NOME_BANCO = "mizaApp";
    private static final int VERSAO_BANCO = 6;

    public DBCore(Context context){
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL("CREATE TABLE USUARIO (" +
                "idUsuario INTEGER  NOT NULL , " +
                "emailUsuario VARCHAR(50) NOT NULL, " +
                "nomeUsuario VARCHAR(50) NOT NULL, " +
                "senhaUsuario VARCHAR(10) NOT NULL, " +
                "userUsuario VARCHAR(20) NOT NULL, " +
                "CONSTRAINT PK_USUARIO PRIMARY KEY(idUsuario)" +
                " );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int i, int i1) {
        bd.execSQL("DROP TABLE USUARIO;");
        onCreate(bd);
    }
}