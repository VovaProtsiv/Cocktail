package com.example.cocktail.adapter

import Drink
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cocktail.R
import kotlinx.android.synthetic.main.drinks_layout.view.*


class DrinksRecyclerViewAdapter(
    internal val context: Context,
    internal var drinkList: List<Drink>,
    internal var mClickListener: DrinkClickListener
) : RecyclerView.Adapter<DrinksRecyclerViewAdapter.DrinkViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.drinks_layout, parent, false)
                return DrinkViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return drinkList.size
    }


    override fun onBindViewHolder(holder: DrinkViewHolder, position: Int) {
        holder.strDrink.text = drinkList[position].strDrink
        Glide
            .with(context)
            .load(drinkList[position].strDrinkThumb)
            .into(holder.strDrinkThumb);
    }

     inner class DrinkViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val strDrink : TextView
        val strDrinkThumb : ImageView


        override fun onClick(v: View) {
            //if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());

            mClickListener.onItemClick(v, adapterPosition)

        }
         init {
              strDrink = itemView.txt_strDrink
             strDrinkThumb = itemView.drinkImg
             itemView.setOnClickListener(this)
         }
    }


    interface DrinkClickListener {
        fun onItemClick(view: View, position: Int)
    }
}


