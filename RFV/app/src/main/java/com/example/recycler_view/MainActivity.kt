package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycler_view.models.fragments.CategoryFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.container, CategoryFragment())
            .commit()
    }
}