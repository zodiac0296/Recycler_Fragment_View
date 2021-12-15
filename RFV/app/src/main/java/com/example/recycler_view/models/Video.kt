package com.example.recycler_view.models

import android.media.AudioDescriptor

data class Video(
    var categoryId: Int,
    var descriptor: String,
    var name: String,
    var url: String
)
