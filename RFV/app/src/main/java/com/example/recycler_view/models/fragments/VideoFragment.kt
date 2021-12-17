package com.example.recycler_view.models.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recycler_view.Categories
import com.example.recycler_view.Constans
import com.example.recycler_view.R

class VideoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_video, container,false)
        var filteredArray = Constans.category.filter { item ->
            item.id == Categories.Anime.ordinal || item.id == Categories.Drama.ordinal || item.id == Categories.Melodrama.ordinal

        }
        return view
    }
}
