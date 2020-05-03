package com.example.cocktail.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context, name: String, version: Int) :
    SQLiteOpenHelper(context, name, null, version) {
    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "drinkDb"
        const val TABLE_DRINKS = "drinks"

        const val KEY_ID = "id"
        const val KEY_NAME = "name"
        const val KEY_IMAGE = "image"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "create table " + TABLE_DRINKS + "(" + KEY_ID + " text primary key," + KEY_NAME + " text,"
                    + KEY_IMAGE + " text" + ")"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
       db?.execSQL("drop table if exists $TABLE_DRINKS")

        onCreate(db)
    }

}