package com.example.cocktail

import Drink

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.cocktail.adapter.DrinksRecyclerViewAdapter
import com.example.cocktail.adapter.IngredientsRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_search_screen.*
import java.util.ArrayList


class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val bundle = intent.extras
        val message = intent.getStringExtra(ID_DRINK)
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


        displayIngredient(listIngredient)
        findViewById<TextView>(R.id.instructions).apply { text= sharedBookingObject?.strInstructions}

    }
    fun displayIngredient(ingredient: List<String>?) {
       val adapter = IngredientsRecyclerViewAdapter(this, ingredient!! )
        recycler_ingredients.adapter = adapter

    }
}
