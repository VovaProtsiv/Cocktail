package com.example.cocktail

import Drink
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.cocktail.adapter.IngredientsRecyclerViewAdapter
import com.example.cocktail.adapter.MeasureRecyclerViewAdapter
import com.example.cocktail.dao.DbHelper
import com.example.cocktail.dao.DbHelper.Companion.DATABASE_NAME
import com.example.cocktail.dao.DbHelper.Companion.DATABASE_VERSION
import com.example.cocktail.dao.DbHelper.Companion.KEY_ALCOHOLIC
import com.example.cocktail.dao.DbHelper.Companion.KEY_GLASS
import com.example.cocktail.dao.DbHelper.Companion.KEY_ID
import com.example.cocktail.dao.DbHelper.Companion.KEY_IMAGE
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT1
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT10
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT11
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT12
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT13
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT14
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT15
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT2
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT3
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT4
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT5
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT6
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT7
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT8
import com.example.cocktail.dao.DbHelper.Companion.KEY_INGREDIENT9
import com.example.cocktail.dao.DbHelper.Companion.KEY_INSTRUCTIONS
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE1
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE10
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE11
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE12
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE13
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE14
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE15
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE2
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE3
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE4
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE5
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE6
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE7
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE8
import com.example.cocktail.dao.DbHelper.Companion.KEY_MEASURE9
import com.example.cocktail.dao.DbHelper.Companion.KEY_NAME
import com.example.cocktail.dao.DbHelper.Companion.TABLE_DRINKS

import kotlinx.android.synthetic.main.activity_details.*
import java.util.*


class DetailsActivity() : AppCompatActivity() {
    internal lateinit var dbHelper: DbHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setSupportActionBar(findViewById(R.id.toolbarDetails))

        val bundle = intent.extras

        val drink = bundle!!.getParcelable<Drink>("listDrinks")
        title = drink?.strDrink

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)

        Glide
            .with(this)
            .load(drink?.strDrinkThumb)
            .into(findViewById<ImageView>(R.id.drinkImgDetail))

        findViewById<TextView>(R.id.nameDetails).apply { text = drink?.strDrink }
        findViewById<TextView>(R.id.alcoholicDetails).apply {
            text = drink?.strAlcoholic
        }

        findViewById<TextView>(R.id.glassDetails).apply { text = drink?.strGlass }

        recycler_ingredients.setHasFixedSize(true)
        recycler_ingredients.layoutManager = LinearLayoutManager(this)

        recycler_measure.setHasFixedSize(true)
        recycler_measure.layoutManager = LinearLayoutManager(this)

        displayMeasure(getListMeasures(drink))
        displayIngredient(getListIngredients(drink))

        findViewById<TextView>(R.id.instructions).apply {
            text = drink?.strInstructions
        }
        dbHelper = DbHelper(this, DATABASE_NAME, DATABASE_VERSION)


        val writableDatabase = dbHelper.writableDatabase

        val rawQuery = writableDatabase.rawQuery(
            "SELECT * FROM $TABLE_DRINKS WHERE $KEY_ID = '" + drink?.idDrink.toString() + "'",
            null
        )
        val id = drink?.idDrink.toString()
        var idFromDb: String? = null
        val columnIndexID = rawQuery.getColumnIndex(DbHelper.KEY_ID)
        if (rawQuery.moveToFirst()) {
            idFromDb = rawQuery.getString(columnIndexID)
        }
        rawQuery.close()
        if (!id.equals(idFromDb)) {
            if (drink != null) {
                writeToDb(drink, writableDatabase)
            }
        }
    }

    fun displayIngredient(ingredient: List<String>?) {
        val adapter = IngredientsRecyclerViewAdapter(ingredient!!)
        recycler_ingredients.adapter = adapter
    }

    fun writeToDb(drink: Drink, writableDatabase: SQLiteDatabase) {
        val contentValues = ContentValues()
        contentValues.put(KEY_ID, drink?.idDrink)
        contentValues.put(KEY_NAME, drink?.strDrink)
        contentValues.put(KEY_IMAGE, drink?.strDrinkThumb)
        contentValues.put(KEY_ALCOHOLIC, drink?.strAlcoholic)
        contentValues.put(KEY_GLASS, drink?.strGlass)
        contentValues.put(KEY_INSTRUCTIONS, drink?.strInstructions)
        contentValues.put(KEY_INGREDIENT1, drink?.strIngredient1)
        contentValues.put(KEY_INGREDIENT2, drink?.strIngredient2)
        contentValues.put(KEY_INGREDIENT3, drink?.strIngredient3)
        contentValues.put(KEY_INGREDIENT4, drink?.strIngredient4)
        contentValues.put(KEY_INGREDIENT5, drink?.strIngredient5)
        contentValues.put(KEY_INGREDIENT6, drink?.strIngredient6)
        contentValues.put(KEY_INGREDIENT7, drink?.strIngredient7)
        contentValues.put(KEY_INGREDIENT8, drink?.strIngredient8)
        contentValues.put(KEY_INGREDIENT9, drink?.strIngredient9)
        contentValues.put(KEY_INGREDIENT10, drink?.strIngredient10)
        contentValues.put(KEY_INGREDIENT11, drink?.strIngredient11)
        contentValues.put(KEY_INGREDIENT12, drink?.strIngredient12)
        contentValues.put(KEY_INGREDIENT13, drink?.strIngredient13)
        contentValues.put(KEY_INGREDIENT14, drink?.strIngredient14)
        contentValues.put(KEY_INGREDIENT15, drink?.strIngredient15)
        contentValues.put(KEY_MEASURE1, drink?.strMeasure1)
        contentValues.put(KEY_MEASURE2, drink?.strMeasure2)
        contentValues.put(KEY_MEASURE3, drink?.strMeasure3)
        contentValues.put(KEY_MEASURE4, drink?.strMeasure4)
        contentValues.put(KEY_MEASURE5, drink?.strMeasure5)
        contentValues.put(KEY_MEASURE6, drink?.strMeasure6)
        contentValues.put(KEY_MEASURE7, drink?.strMeasure7)
        contentValues.put(KEY_MEASURE8, drink?.strMeasure8)
        contentValues.put(KEY_MEASURE9, drink?.strMeasure9)
        contentValues.put(KEY_MEASURE10, drink?.strMeasure10)
        contentValues.put(KEY_MEASURE11, drink?.strMeasure11)
        contentValues.put(KEY_MEASURE12, drink?.strMeasure12)
        contentValues.put(KEY_MEASURE13, drink?.strMeasure13)
        contentValues.put(KEY_MEASURE14, drink?.strMeasure14)
        contentValues.put(KEY_MEASURE15, drink?.strMeasure15)


        writableDatabase.insert(TABLE_DRINKS, null, contentValues)
    }

    fun displayMeasure(measure: List<String>?) {
        val adapter = MeasureRecyclerViewAdapter(measure!!)
        recycler_measure.adapter = adapter

    }

    fun getListIngredients(drink: Drink?): ArrayList<String> {
        val listIngredient = ArrayList<String>()

        drink?.strIngredient1?.let { listIngredient.add(it) }
        drink?.strIngredient2?.let { listIngredient.add(it) }
        drink?.strIngredient3?.let { listIngredient.add(it) }
        drink?.strIngredient4?.let { listIngredient.add(it) }
        drink?.strIngredient5?.let { listIngredient.add(it) }
        drink?.strIngredient6?.let { listIngredient.add(it) }
        drink?.strIngredient7?.let { listIngredient.add(it) }
        drink?.strIngredient8?.let { listIngredient.add(it) }
        drink?.strIngredient9?.let { listIngredient.add(it) }
        drink?.strIngredient10?.let { listIngredient.add(it) }
        drink?.strIngredient11?.let { listIngredient.add(it) }
        drink?.strIngredient12?.let { listIngredient.add(it) }
        drink?.strIngredient13?.let { listIngredient.add(it) }
        drink?.strIngredient14?.let { listIngredient.add(it) }
        drink?.strIngredient15?.let { listIngredient.add(it) }
        return listIngredient
    }

    fun getListMeasures(drink: Drink?): ArrayList<String> {
        val listMeasure = ArrayList<String>()
        drink?.strMeasure1?.let { listMeasure.add(it) }
        drink?.strMeasure2?.let { listMeasure.add(it) }
        drink?.strMeasure3?.let { listMeasure.add(it) }
        drink?.strMeasure4?.let { listMeasure.add(it) }
        drink?.strMeasure5?.let { listMeasure.add(it) }
        drink?.strMeasure6?.let { listMeasure.add(it) }
        drink?.strMeasure7?.let { listMeasure.add(it) }
        drink?.strMeasure8?.let { listMeasure.add(it) }
        drink?.strMeasure9?.let { listMeasure.add(it) }
        drink?.strMeasure10?.let { listMeasure.add(it) }
        drink?.strMeasure11?.let { listMeasure.add(it) }
        drink?.strMeasure12?.let { listMeasure.add(it) }
        drink?.strMeasure13?.let { listMeasure.add(it) }
        drink?.strMeasure14?.let { listMeasure.add(it) }
        drink?.strMeasure15?.let { listMeasure.add(it) }
        return listMeasure
    }

}
