package com.project.afinal.classproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.IOException;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME ="MyAndroid";
    String DB_PATH = null;


    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, 3);
        SQLiteDatabase db = this.getWritableDatabase();
    }


        @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE UserInfo (KCSEINDEX INT(11) UNIQUE,KCPEINDEX INT(11) UNIQUE,KCSEYEAR INT(4))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS UserInfo");
        onCreate(db);
    }
}
