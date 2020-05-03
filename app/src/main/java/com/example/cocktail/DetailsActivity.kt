package com.example.cocktail

import Drink
import android.content.ContentValues
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
        val bundle = intent.extras

       val sharedBookingObject = bundle!!.getParcelable<Drink>("listDrinks")

        Glide
            .with(this)
            .load(sharedBookingObject?.strDrinkThumb)
            .into(findViewById<ImageView>(R.id.drinkImgDetail))

        findViewById<TextView>(R.id.nameDetails).apply { text= sharedBookingObject?.strDrink}
        findViewById<TextView>(R.id.alcoholicDetails).apply { text= sharedBookingObject?.strAlcoholic}
        findViewById<TextView>(R.id.glassDetails).apply { text= sharedBookingObject?.strGlass}



        recycler_ingredients.setHasFixedSize(true)
        recycler_ingredients.layoutManager =LinearLayoutManager(this)

        recycler_measure.setHasFixedSize(true)
        recycler_measure.layoutManager =LinearLayoutManager(this)

        val listIngredient = ArrayList<String>()

        sharedBookingObject?.strIngredient1?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient2?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient3?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient4?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient5?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient6?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient7?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient8?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient9?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient10?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient11?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient12?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient13?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient14?.let { listIngredient.add(it) }
        sharedBookingObject?.strIngredient15?.let { listIngredient.add(it) }

        val listMeasure = ArrayList<String>()


        sharedBookingObject?.strMeasure1?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure2?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure3?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure4?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure5?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure6?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure7?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure8?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure9?.let { listMeasure.add(it) }
        sharedBookingObject?.strMeasure10?.let {listMeasure.add(it) }
        sharedBookingObject?.strMeasure11?.let {listMeasure.add(it) }
        sharedBookingObject?.strMeasure12?.let {listMeasure.add(it) }
        sharedBookingObject?.strMeasure13?.let {listMeasure.add(it) }
        sharedBookingObject?.strMeasure14?.let {listMeasure.add(it) }
        sharedBookingObject?.strMeasure15?.let {listMeasure.add(it) }

        displayMeasure(listMeasure)
        displayIngredient(listIngredient)

        findViewById<TextView>(R.id.instructions).apply { text= sharedBookingObject?.strInstructions}
        dbHelper = DbHelper(this,DATABASE_NAME, DATABASE_VERSION)

     val writableDatabase = dbHelper.writableDatabase
     //writableDatabase.execSQL("drop table if exists $TABLE_DRINKS")



        val contentValues = ContentValues()
        contentValues.put(KEY_ID,sharedBookingObject?.idDrink )
        contentValues.put(KEY_NAME,sharedBookingObject?.strDrink )
        contentValues.put(KEY_IMAGE,sharedBookingObject?.strDrinkThumb )
        contentValues.put(KEY_ALCOHOLIC,sharedBookingObject?.strAlcoholic )
        contentValues.put(KEY_GLASS,sharedBookingObject?.strGlass )
        contentValues.put(KEY_INSTRUCTIONS,sharedBookingObject?.strInstructions )
        contentValues.put(KEY_INGREDIENT1,sharedBookingObject?.strIngredient1 )
        contentValues.put(KEY_INGREDIENT2,sharedBookingObject?.strIngredient2 )
        contentValues.put(KEY_INGREDIENT3,sharedBookingObject?.strIngredient3 )
        contentValues.put(KEY_INGREDIENT4,sharedBookingObject?.strIngredient4 )
        contentValues.put(KEY_INGREDIENT5,sharedBookingObject?.strIngredient5 )
        contentValues.put(KEY_INGREDIENT6,sharedBookingObject?.strIngredient6 )
        contentValues.put(KEY_INGREDIENT7,sharedBookingObject?.strIngredient7 )
        contentValues.put(KEY_INGREDIENT8,sharedBookingObject?.strIngredient8 )
        contentValues.put(KEY_INGREDIENT9,sharedBookingObject?.strIngredient9 )
        contentValues.put(KEY_INGREDIENT10,sharedBookingObject?.strIngredient10 )
        contentValues.put(KEY_INGREDIENT11,sharedBookingObject?.strIngredient11 )
        contentValues.put(KEY_INGREDIENT12,sharedBookingObject?.strIngredient12 )
        contentValues.put(KEY_INGREDIENT13,sharedBookingObject?.strIngredient13 )
        contentValues.put(KEY_INGREDIENT14,sharedBookingObject?.strIngredient14 )
        contentValues.put(KEY_INGREDIENT15,sharedBookingObject?.strIngredient15 )
        contentValues.put(KEY_MEASURE1,sharedBookingObject?.strMeasure1 )
        contentValues.put(KEY_MEASURE2,sharedBookingObject?.strMeasure2 )
        contentValues.put(KEY_MEASURE3,sharedBookingObject?.strMeasure3 )
        contentValues.put(KEY_MEASURE4,sharedBookingObject?.strMeasure4 )
        contentValues.put(KEY_MEASURE5,sharedBookingObject?.strMeasure5 )
        contentValues.put(KEY_MEASURE6,sharedBookingObject?.strMeasure6 )
        contentValues.put(KEY_MEASURE7,sharedBookingObject?.strMeasure7 )
        contentValues.put(KEY_MEASURE8,sharedBookingObject?.strMeasure8 )
        contentValues.put(KEY_MEASURE9,sharedBookingObject?.strMeasure9 )
        contentValues.put(KEY_MEASURE10,sharedBookingObject?.strMeasure10 )
        contentValues.put(KEY_MEASURE11,sharedBookingObject?.strMeasure11 )
        contentValues.put(KEY_MEASURE12,sharedBookingObject?.strMeasure12 )
        contentValues.put(KEY_MEASURE13,sharedBookingObject?.strMeasure13 )
        contentValues.put(KEY_MEASURE14,sharedBookingObject?.strMeasure14 )
        contentValues.put(KEY_MEASURE15,sharedBookingObject?.strMeasure15 )


         writableDatabase.insert(TABLE_DRINKS, null, contentValues)




    }
    fun displayIngredient(ingredient: List<String>?) {
       val adapter = IngredientsRecyclerViewAdapter(this, ingredient!! )
        recycler_ingredients.adapter = adapter

    }
    fun displayMeasure(measure: List<String>?) {
        val adapter = MeasureRecyclerViewAdapter( measure!! )
        recycler_measure.adapter = adapter

    }


}
