package com.example.multipleviewtyperecyclerview.base

import androidx.databinding.ViewDataBinding

interface BaseItem< out T> {
    fun layoutId(): Int

    fun uniqueId(): String

    fun bind(binding: @UnsafeVariance T, item: BaseItem<ViewDataBinding>)

}