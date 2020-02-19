package com.example.islamy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamy.Interfaces.OnItemClickListener
import com.example.islamy.R
import kotlinx.android.synthetic.main.ahadith_item.*

class AhadithAdapter(val nums : List<Int>):RecyclerView.Adapter<AhadithAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ahadith_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nums.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val num = nums.get(position)
        holder.hadithNum.setText("حديث ${(position+1)}")
        if (onItemClickListener != null){
        holder.itemView.setOnClickListener({
            onItemClickListener?.onItemClick(position,"${num}")
        })
        }
    }

    var onItemClickListener : OnItemClickListener? = null



    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        lateinit var hadithNum : TextView
        init {
            hadithNum = itemView.findViewById(R.id.hadith)
        }
    }
}