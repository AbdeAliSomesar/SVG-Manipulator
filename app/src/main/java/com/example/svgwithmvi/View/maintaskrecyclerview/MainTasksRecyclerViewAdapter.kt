package com.example.svgwithmvi.View.maintaskrecyclerview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.svgwithmvi.R
import kotlinx.android.synthetic.main.main_custom_recyclerview.view.*

class MainTasksRecyclerViewAdapter(var imageData:List<RecyclerViewImageAndTextDataListHolder.RecyclerViewData>, var mainRecyclerViewClickListener: MainRecyclerViewClickListener):RecyclerView.Adapter<MainTasksRecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var view:View = inflater.inflate(R.layout.main_custom_recyclerview,parent,false)
        return ViewHolder(view,mainRecyclerViewClickListener)
    }

    override fun getItemCount(): Int {
        return imageData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(imageData[position].imageId)
        holder.text.text = (imageData[position].imageText)
    }

    class ViewHolder(view:View, var mainRecyclerViewClickListener: MainRecyclerViewClickListener):RecyclerView.ViewHolder(view),View.OnClickListener
    {
        val image = view.mainCustomRecyclerViewImageView
        val text = view.mainCustomRecyclerViewTextView
        init {
            view.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            mainRecyclerViewClickListener.onClick(adapterPosition)
        }
    }
}