package com.example.cocktail.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.drinks_layout.view.*

class DrinksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val strDrink = itemView.txt_strDrink
    val strDrinkThumb = itemView.drinkImg

}