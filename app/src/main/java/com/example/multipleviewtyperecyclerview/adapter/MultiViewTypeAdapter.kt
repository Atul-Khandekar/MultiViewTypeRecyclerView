package com.example.multipleviewtyperecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.multipleviewtyperecyclerview.base.BaseItem
import com.example.multipleviewtyperecyclerview.base.BaseViewHolder

class MultiViewTypeAdapter :
    ListAdapter<BaseItem<ViewDataBinding>, BaseViewHolder>(DiffUtilCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, viewType, parent, false)
        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class DiffUtilCallBack : DiffUtil.ItemCallback<BaseItem<ViewDataBinding>>() {
        override fun areItemsTheSame(
            oldItem: BaseItem<ViewDataBinding>,
            newItem: BaseItem<ViewDataBinding>
        ): Boolean {
            return oldItem.uniqueId() == newItem.uniqueId()
        }

        override fun areContentsTheSame(
            oldItem: BaseItem<ViewDataBinding>,
            newItem: BaseItem<ViewDataBinding>
        ): Boolean {
            return oldItem::class == newItem::class
        }
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).layoutId()
    }

}