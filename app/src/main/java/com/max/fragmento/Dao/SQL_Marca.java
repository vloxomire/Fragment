package com.max.fragmento.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

public class SQL_Marca {
    private static final String DBname="Marca";
    private static final Integer DBversion=1;
    private SQLiteDatabase conexion;
    private Context contextSqlMarca;

    public SQL_Modelo(@Nullable Context context) {
        super(context, DBname, null, DBversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `Marca`(`Id`INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
                "`Nombre`\tTEXT NOT NULL UNIQUE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Marca"+DBname);
        onCreate(db);
    }


    C
);
}
