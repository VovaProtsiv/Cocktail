package com.example.cocktail.dao

import android.app.Application
import androidx.room.Room


class App : Application() {
    private var database: DrinkDatabase? = null
    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, DrinkDatabase::class.java, "drinkdb")
            .build()
    }

    fun getDatabase(): DrinkDatabase? {
        return database
    }

    companion object {
        var instance: App? = null
    }
}