package com.example.cocktail

import Drink
import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cocktailapp.model.ResultResponse

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val bundle = intent.extras
        val message = intent.getStringExtra(ID_DRINK)
       val sharedBookingObject = bundle!!.getParcelable<Drink>("listDrinks")

        findViewById<TextView>(R.id.glassDetails).apply { text= sharedBookingObject?.strDrink}

    }
}
