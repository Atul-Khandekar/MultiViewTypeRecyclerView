package com.example.multipleviewtyperecyclerview.model

import androidx.databinding.ViewDataBinding
import com.example.multipleviewtyperecyclerview.base.BaseItem

object DataSource {

    fun getList(): List<BaseItem<ViewDataBinding>> {
        return mutableListOf(
            ItemImageModel(image = "https://images.unsplash.com/photo-1715314117855-3f070860d47f?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            ItemImageTextModel(image = "https://images.unsplash.com/photo-1715276611613-97056c19b775?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", text = "I don't know what city is this but its beautiful"),
            ItemTextModel(text = "You can add whatever you want"),
            ItemImageModel("https://images.unsplash.com/photo-1715868158574-d83d274384f7?q=80&w=1965&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            ItemImageModel("https://images.unsplash.com/photo-1717200997603-097f16adf0de?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            ItemTextModel("Making Plans can help you complete tasks faster"),
            ItemImageModel(image = "https://images.unsplash.com/photo-1716396502668-26f0087e1c7d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0NHx8fGVufDB8fHx8fA%3D%3D"),
            ItemImageTextModel(image = "https://images.unsplash.com/photo-1716987003895-c93907fbdc07?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", text = "Another beautiful city!"),
            ItemTextModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            ItemImageModel("https://images.unsplash.com/photo-1716798781407-1c1767955e2e?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            ItemImageModel("https://images.unsplash.com/photo-1717226263667-7ce6f7f35d9d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxM3x8fGVufDB8fHx8fA%3D%3D"),
            ItemTextModel(text = "I want to start journaling "),
        )
    }
}