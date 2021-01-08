package com.example.searchrecyclerviewdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.searchrecyclerviewdemo.data.Person
import com.example.searchrecyclerviewdemo.databinding.RowLayoutBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var oldData = emptyList<Person>()

    class MyViewHolder(val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RowLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.ageTextView.text = oldData[position].age.toString()
        holder.binding.firstNameTextView.text = oldData[position].firstName
        holder.binding.lastNameTextView.text = oldData[position].lastName
    }

    override fun getItemCount(): Int {
        return oldData.size
    }

    fun setData(newData: List<Person>){
        oldData = newData
        notifyDataSetChanged()
    }

}
