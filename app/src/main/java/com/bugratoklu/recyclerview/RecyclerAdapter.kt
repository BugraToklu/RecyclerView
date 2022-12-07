package com.bugratoklu.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private var txt: List<String>,private var images: List<Int>):
RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val itemTxt : TextView = itemView.findViewById(R.id.description)
        val itemPicture : ImageView = itemView.findViewById(R.id.imageView)

        init {
            itemView.setOnClickListener { v : View ->
                val position: Int = adapterPosition
                Toast.makeText(itemView.context,"asdf #${position+1}",Toast.LENGTH_LONG ).show()

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTxt.text = txt[position]
        holder.itemPicture.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return txt.size
    }
}