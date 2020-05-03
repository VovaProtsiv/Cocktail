package com.example.cocktail.dao

import Drink
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DrinkDao {
    @Query("SELECT * FROM drink")
    fun getAll(): List<Drink>

    @Query("SELECT * FROM drink WHERE idDrink IN (:drinkIds)")
    fun loadAllByIds(drinkIds: IntArray): List<Drink>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Drink

    @Insert
    fun insertAll(vararg users: Drink)

    @Delete
    fun delete(user: Drink)
}