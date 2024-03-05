package com.bagicode.aplikasipertamaku.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bagicode.aplikasipertamaku.R

data class VerticalItem(val id:Int, val name:String, val address:String, val image:Int)

class VerticalAdapter(
    private val onVerticalClicked: ((VerticalItem) -> Unit) ?= {}
) : ListAdapter<VerticalItem, VerticalAdapter.VerticalViewHolder>(
    object : DiffUtil.ItemCallback<VerticalItem>() {
        override fun areItemsTheSame(oldItem: VerticalItem, newItem: VerticalItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: VerticalItem, newItem: VerticalItem): Boolean {
            return oldItem == newItem
        }

    }
) {

    class VerticalViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    fun VerticalViewHolder.bind(item: VerticalItem) {
        with(itemView) {
            val name = findViewById<TextView>(R.id.tv_name)
            val address = findViewById<TextView>(R.id.tv_address)

            name.setText(item.name)
            address.setText(item.address)

            itemView.setOnClickListener {
                onVerticalClicked?.invoke(item)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical, parent, false)
        return VerticalViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.bind(currentList[position])
    }


}