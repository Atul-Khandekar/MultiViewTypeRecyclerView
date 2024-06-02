package com.example.multipleviewtyperecyclerview.adapter

import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView

@BindingAdapter("imageFromUrl")
fun ShapeableImageView.imageFromUrl(image: String?) {
    image?.let {
        Glide.with(context).load(it).into(this)
    }
}