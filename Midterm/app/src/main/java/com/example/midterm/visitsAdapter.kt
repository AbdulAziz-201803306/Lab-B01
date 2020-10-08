package com.example.midterm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.visit_list_item.view.*

class visitsAdapter(val visits : List<Visit>, val context : Context) : RecyclerView.Adapter<visitsAdapter.visitsViewHolder>(){
    class visitsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(visit : Visit){
            itemView.apply {
                countryName.text = visit.name
                ratingBar.numStars = visit.rating.hashCode()
                amountValue.text = visit.amount.toString()
                val countryName = visit.code
                val countryNameID = context.resources.getIdentifier(countryName, "drawable", context.packageName)
                imageView.setImageResource(countryNameID)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): visitsViewHolder {
        val itemView = LayoutInflater.from(context)
            .inflate(R.layout.visit_list_item, parent , false)
        return visitsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: visitsViewHolder, position: Int) {
        holder.bind(visits[position])
    }

    override fun getItemCount() = visits.size

}