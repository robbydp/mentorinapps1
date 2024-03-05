package com.bagicode.aplikasipertamaku.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bagicode.aplikasipertamaku.R

data class HorizontalItem(val id:Int, val name:String, val address:String, val image:Int)

class HorizontalAdapter(
    private val onVerticalClicked: ((HorizontalItem) -> Unit) ?= {}
) : ListAdapter<HorizontalItem, HorizontalAdapter.HorizontalViewHolder>(
    object : DiffUtil.ItemCallback<HorizontalItem>() {
        override fun areItemsTheSame(oldItem: HorizontalItem, newItem: HorizontalItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: HorizontalItem, newItem: HorizontalItem): Boolean {
            return oldItem == newItem
        }

    }
) {

    class HorizontalViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    fun HorizontalViewHolder.bind(item: HorizontalItem) {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical, parent, false)
        return HorizontalViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.bind(currentList[position])
    }


}