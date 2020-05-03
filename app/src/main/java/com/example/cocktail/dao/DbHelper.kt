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
        const val KEY_ALCOHOLIC = "alcoholic"
        const val KEY_GLASS = "glass"
        const val KEY_INSTRUCTIONS = "instructions"
        const val KEY_INGREDIENT1 = "ingredient1"
        const val KEY_INGREDIENT2 = "ingredient2"
        const val KEY_INGREDIENT3 = "ingredient3"
        const val KEY_INGREDIENT4 = "ingredient4"
        const val KEY_INGREDIENT5 = "ingredient5"
        const val KEY_INGREDIENT6 = "ingredient6"
        const val KEY_INGREDIENT7 = "ingredient7"
        const val KEY_INGREDIENT8 = "ingredient8"
        const val KEY_INGREDIENT9 = "ingredient9"
        const val KEY_INGREDIENT10 = "ingredient10"
        const val KEY_INGREDIENT11 = "ingredient11"
        const val KEY_INGREDIENT12 = "ingredient12"
        const val KEY_INGREDIENT13 = "ingredient13"
        const val KEY_INGREDIENT14 = "ingredient14"
        const val KEY_INGREDIENT15 = "ingredient15"
        const val KEY_MEASURE1 = "measure1"
        const val KEY_MEASURE2 = "measure2"
        const val KEY_MEASURE3 = "measure3"
        const val KEY_MEASURE4 = "measure4"
        const val KEY_MEASURE5 = "measure5"
        const val KEY_MEASURE6 = "measure6"
        const val KEY_MEASURE7 = "measure7"
        const val KEY_MEASURE8 = "measure8"
        const val KEY_MEASURE9 = "measure9"
        const val KEY_MEASURE10 = "measure10"
        const val KEY_MEASURE11 = "measure11"
        const val KEY_MEASURE12 = "measure12"
        const val KEY_MEASURE13 = "measure13"
        const val KEY_MEASURE14 = "measure14"
        const val KEY_MEASURE15 = "measure15"

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