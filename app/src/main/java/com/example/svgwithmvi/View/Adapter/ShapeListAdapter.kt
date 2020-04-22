package com.example.svgwithmvi.View.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.svgwithmvi.R
import com.example.svgwithmvi.View.ShapeFragment
import kotlinx.android.synthetic.main.shape_fragment_recyclerview_items.view.*

class ShapeListAdapter (private val imageIds:List<Int>, val onShapeClickListener:(Int) -> Unit):
    RecyclerView.Adapter<ShapeListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.shape_fragment_recyclerview_items,parent,false)
        return ViewHolder(
            view,
            onShapeClickListener
        )
    }

    override fun getItemCount(): Int {
        return imageIds.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(imageIds[position])
    }


    class ViewHolder(itemView: View, val onShapeClickListener:(Int) -> Unit) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val imageView: ImageView = itemView.shapeFragmentRecyclerViewItemImage
        init {
            imageView.setOnClickListener(this)
        }
        override fun onClick(v: View)
        {
            onShapeClickListener(adapterPosition)
        }
    }
}