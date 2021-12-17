package com.example.recycler_view.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view.R
import com.example.recycler_view.models.Category
import com.example.recycler_view.models.fragments.VideoFragment
import java.security.AccessControlContext

class CategoryAdapter(private val array: ArrayList<Category>, private val context: FragmentActivity):
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tools = view.findViewById<TextView>(R.id.categoty_TV)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.tools.text = holder.itemView.context.getString(item.name)
        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("category", item.id)
        context.supportFragmentManager.beginTransaction()
            .replace(R.id.container,VideoFragment::class.java, bundle)
            .addToBackStack(null)
            .commit()
        }
    }
    override fun getItemCount(): Int {
        return array.size
    }
}