package com.example.cocktail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cocktail.R
import kotlinx.android.synthetic.main.ingredient_layout.view.*

class IngredientsRecyclerViewAdapter(
    internal var ingredientList: List<String>
) :
    RecyclerView.Adapter<IngredientsRecyclerViewAdapter.IngredientsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.ingredient_layout, parent, false)
        return IngredientsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ingredientList.size
    }

    override fun onBindViewHolder(holder: IngredientsViewHolder, position: Int) {
        val ingred = ingredientList[position]
        val pos = position + 1
        holder.strIngredient.text = "$pos. $ingred"
    }

    inner class IngredientsViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val strIngredient: TextView = itemView.drinkIngredient
    }
}
