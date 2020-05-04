package com.example.cocktail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cocktail.R
import kotlinx.android.synthetic.main.measure_layout.view.*

class MeasureRecyclerViewAdapter(

    internal var measureList: List<String>
) :
    RecyclerView.Adapter<MeasureRecyclerViewAdapter.MeasureViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeasureViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.measure_layout, parent, false)
        return MeasureViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return measureList.size
    }

    override fun onBindViewHolder(holder: MeasureViewHolder, position: Int) {

        holder.strMeasure.text = measureList[position]
    }

    inner class MeasureViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val strMeasure: TextView = itemView.drinkMeasure
    }
}
