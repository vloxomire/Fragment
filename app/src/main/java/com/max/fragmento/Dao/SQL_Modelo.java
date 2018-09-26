package com.max.fragmento.Dao;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class SQL_Modelo extends SQLiteOpenHelper {
    private static final String DBname="Modelo";
    private static final Integer DBversion=1;
    private SQLiteDatabase conexion;
    private Context contextSqlModelo;

    public SQL_Modelo(@Nullable Context context) {
        super(context, DBname, null, DBversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE IF NOT EXISTS `Modelo`(`Id`INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE," +
            "`Nombre`	TEXT NOT NULL, `Marca`	TEXT NOT NULL UNIQUE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS Modelo"+DBname);
    onCreate(db);
    }

}
