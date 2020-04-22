package com.example.svgwithmvi.View.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.svgwithmvi.R
import com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder
import kotlinx.android.synthetic.main.actions_fragment_custom_recyclearview.view.*

class ActionsAdapter(val actionList:List<RecyclerViewImageAndTextDataListHolder.RecyclerViewData>, val onActionClickListener:(Int) -> Unit):
    RecyclerView.Adapter<ActionsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.actions_fragment_custom_recyclearview,parent,false)
        return ViewHolder(
            view,
            onActionClickListener
        )
    }

    override fun getItemCount(): Int {
        return actionList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(actionList[position].imageId)
        holder.text.text = actionList[position].imageText
    }

    class ViewHolder(itemView: View, val onActionClickListener:(Int) -> Unit) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {


        var image: ImageView = itemView.actionFragmentCustomRecyclerViewImageView
        val text: TextView = itemView.actionFragmentCustomRecyclerViewTextView
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            onActionClickListener(adapterPosition)
        }
    }
}