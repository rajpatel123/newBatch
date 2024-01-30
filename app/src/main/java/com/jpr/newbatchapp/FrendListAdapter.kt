package com.jpr.newbatchapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jpr.newbatchapp.databinding.ItemNameBinding

class FrendListAdapter(val freindlist: ArrayList<String>) : RecyclerView.Adapter<FrendListAdapter.FreindsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FreindsViewHolder {
       return  FreindsViewHolder(ItemNameBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return freindlist.size
    }

    override fun onBindViewHolder(holder: FreindsViewHolder, position: Int) {

        val name = freindlist[position]

        holder.binding.nameTV.text=name

    }


    class FreindsViewHolder(var binding: ItemNameBinding) : RecyclerView.ViewHolder(binding.root)
}