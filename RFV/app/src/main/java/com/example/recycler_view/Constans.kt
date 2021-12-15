package com.example.recycler_view

import android.app.Notification
import com.example.recycler_view.models.Category
import com.example.recycler_view.models.Video

class Constans {
    companion object{
        val category = arrayListOf<Category>(Category(Categories.Action.ordinal, R.string.Action),
        Category(Categories.Anime.ordinal,R.string.Anime),
        Category(Categories.Comedy.ordinal,R.string.Comedy),
        Category(Categories.Drama.ordinal, R.string.Drama),
        Category(Categories.Melodrama.ordinal, R.string.Melodrama))


        val  video = arrayListOf<Video>(
            Video(Categories.Action.ordinal, "описание", "название","url"),
            Video(Categories.Action.ordinal, "описание", "название","url"),
            Video(Categories.Action.ordinal, "описание", "название","url"),

            Video(Categories.Anime.ordinal, "описание", "название","url"),
            Video(Categories.Anime.ordinal, "описание", "название","url"),
            Video(Categories.Anime.ordinal, "описание", "название","url"),

            Video(Categories.Comedy.ordinal, "описание", "название","url"),
            Video(Categories.Comedy.ordinal, "описание", "название","url"),
            Video(Categories.Comedy.ordinal, "описание", "название","url"),

            Video(Categories.Drama.ordinal, "описание", "название","url"),
            Video(Categories.Drama.ordinal, "описание", "название","url"),
            Video(Categories.Drama.ordinal, "описание", "название","url"),

            Video(Categories.Melodrama.ordinal, "описание", "название","url"),
            Video(Categories.Melodrama.ordinal, "описание", "название","url"),
            Video(Categories.Melodrama.ordinal, "описание", "название","url"),


        )
    }
}

enum class Categories(value: Int){
    Comedy(1),
    Anime(2),
    Drama(3),
    Melodrama(4),
    Action(5),



}