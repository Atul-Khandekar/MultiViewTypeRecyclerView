package com.example.multipleviewtyperecyclerview.model

import androidx.databinding.ViewDataBinding
import com.example.multipleviewtyperecyclerview.BR
import com.example.multipleviewtyperecyclerview.R
import com.example.multipleviewtyperecyclerview.base.BaseItem
import com.example.multipleviewtyperecyclerview.databinding.ItemTextBinding
import java.util.UUID

data class ItemTextModel(val text: String): BaseItem<ItemTextBinding> {
    override fun layoutId(): Int {
        return R.layout.item_text
    }

    override fun uniqueId(): String {
        return UUID.randomUUID().toString()
    }

    override fun bind(binding: ItemTextBinding, item: BaseItem<ViewDataBinding>) {
        binding.setVariable(BR.item,item)
        binding.executePendingBindings()
    }

}
