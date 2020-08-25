package com.recyclerview.recyclerviewandroid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)

        holder.itemView.setOnClickListener {

            if (position%2==0) {
                var intent: Intent = Intent(context, SecondScreen::class.java)
                intent.putExtra("step", position.toString())
                context.startActivity(intent)
            } else {
                var intent: Intent = Intent(context, ThirdScreen::class.java)
                intent.putExtra("steps", position.toString())
                context.startActivity(intent)
            }
        }

    }




}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvAnimalType = view.itemMain
}