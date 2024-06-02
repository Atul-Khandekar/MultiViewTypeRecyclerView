package com.example.multipleviewtyperecyclerview.model

import androidx.databinding.ViewDataBinding
import com.example.multipleviewtyperecyclerview.BR
import com.example.multipleviewtyperecyclerview.R
import com.example.multipleviewtyperecyclerview.base.BaseItem
import com.example.multipleviewtyperecyclerview.databinding.ItemImageTextBinding
import java.util.UUID

class ItemImageTextModel(val image: String, val text: String): BaseItem<ItemImageTextBinding> {
    override fun layoutId(): Int {
        return R.layout.item_image_text
    }

    override fun uniqueId(): String {
        return UUID.randomUUID().toString()
    }

    override fun bind(binding: ItemImageTextBinding, item: BaseItem<ViewDataBinding>) {
        binding.setVariable(BR.item,item)
        binding.executePendingBindings()
    }

}