package com.example.cocktail

import Drink
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cocktail.adapter.DrinksRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),DrinksRecyclerViewAdapter.DrinkClickListener {
    internal lateinit var adapter : DrinksRecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_recycler_drink.setHasFixedSize(true)
        main_recycler_drink.layoutManager = GridLayoutManager(this, 2)
    }
    fun changeActivity(view: View){
        val intent = Intent(this, SearchScreen::class.java)
        startActivity(intent)
    }

    fun displayData(drinks: List<Drink>?) {
        adapter = DrinksRecyclerViewAdapter(this, drinks!!, this )
        main_recycler_drink.adapter = adapter

    }

    override fun onItemClick(view: View, position: Int) {
        val intent = Intent(this,DetailsActivity::class.java)
        val  bundle = Bundle()
        bundle.putParcelable("listDrinks",adapter.drinkList[position])
        intent.putExtras(bundle)
        startActivity(intent)
    }


}
