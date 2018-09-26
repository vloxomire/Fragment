package com.max.fragmento.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

public class SQL_Auto {
    private static final String DBname="Auto";
    private static final Integer DBversion=1;
    private SQLiteDatabase conexion;
    private Context contextSqlAuto;

    public SQL_Auto(SQLiteDatabase conexion, Context context) {
        super(context,DBname,null,DBversion);
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

    CREATE TABLE IF NOT EXISTS `Autos` (
            `Id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
            `Marca`	TEXT NOT NULL UNIQUE,
	`Modelo`	TEXT NOT NULL,
            `Anio`	INTEGER NOT
}
