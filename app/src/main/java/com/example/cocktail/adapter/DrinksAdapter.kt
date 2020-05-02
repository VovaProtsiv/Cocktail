package com.example.cocktail.adapter

import Drink
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cocktail.R

class DrinksAdapter(internal val context: Context, internal var drinkList: List<Drink>) :
    RecyclerView.Adapter<DrinksViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int):DrinksViewHolder {
        val itemView = LayoutInflater.from(p0.context)
            .inflate(R.layout.drinks_layout, p0, false)
        return DrinksViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return drinkList.size
    }

    override fun onBindViewHolder(holder: DrinksViewHolder, position: Int) {
        holder.strDrink.text = drinkList[position].strDrink
        Glide
            .with(context)
            .load(drinkList[position].strDrinkThumb)
            .into(holder.strDrinkThumb);

    }

}