package com.example.multipleviewtyperecyclerview.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: BaseItem<ViewDataBinding>) {
        item.bind(binding,item)
    }
}