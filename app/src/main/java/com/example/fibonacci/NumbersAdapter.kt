package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

 class NumbersAdapter(var numberslist:List<BigInteger>):RecyclerView.Adapter<NumbersRecyclerView>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersRecyclerView {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_list_item,parent,false)
        return NumbersRecyclerView(itemView)

    }

    override fun onBindViewHolder(holder: NumbersRecyclerView, position: Int) {
        holder.tvNumbers.text=numberslist.get(position).toString()

    }

    override fun getItemCount(): Int {
       return numberslist.size
    }
}
class NumbersRecyclerView(itemView:View ):RecyclerView.ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}