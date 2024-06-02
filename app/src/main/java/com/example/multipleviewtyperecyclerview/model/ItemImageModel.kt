package com.example.multipleviewtyperecyclerview.model

import androidx.databinding.ViewDataBinding
import com.example.multipleviewtyperecyclerview.BR
import com.example.multipleviewtyperecyclerview.R
import com.example.multipleviewtyperecyclerview.base.BaseItem
import com.example.multipleviewtyperecyclerview.databinding.ItemImageBinding
import java.util.UUID

data class ItemImageModel(val image: String): BaseItem<ItemImageBinding> {
    override fun layoutId(): Int {
        return R.layout.item_image
    }

    override fun uniqueId(): String {
        return UUID.randomUUID().toString()
    }

    override fun bind(binding: ItemImageBinding, item: BaseItem<ViewDataBinding>) {
        binding.setVariable(BR.item,item)
        binding.executePendingBindings()
    }

}
