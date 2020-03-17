package com.mindorks.example.recyclerviewmultiviewtypes.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.example.recyclerviewmultiviewtypes.R
import com.mindorks.example.recyclerviewmultiviewtypes.model.ImageModel
import com.mindorks.example.recyclerviewmultiviewtypes.model.ParentModel
import com.mindorks.example.recyclerviewmultiviewtypes.model.TextImageModel
import com.mindorks.example.recyclerviewmultiviewtypes.model.TextModel
import com.mindorks.example.recyclerviewmultiviewtypes.viewholder.ImageTypeViewHolder
import com.mindorks.example.recyclerviewmultiviewtypes.viewholder.TextImageTypeViewHolder
import com.mindorks.example.recyclerviewmultiviewtypes.viewholder.TextTypeViewHolder

class MultiViewTypeAdapter(private val dataSet: MutableList<ParentModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        when (viewType) {
            R.layout.text_type -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.text_type, parent, false)
                return TextTypeViewHolder(view)
            }
            R.layout.image_type -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.image_type, parent, false)
                return ImageTypeViewHolder(view)
            }
            R.layout.text_image_type -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.text_image_type, parent, false)
                return TextImageTypeViewHolder(view)
            }


            else -> {
                Log.d("debug",viewType.toString())
                throw IllegalArgumentException()
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return dataSet[position].viewType
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, listPosition: Int) {
        val element = dataSet[listPosition]
        when(holder) {
            is TextTypeViewHolder -> holder.bindViews(element as TextModel)
            is ImageTypeViewHolder -> holder.bindViews(element as ImageModel)
            is TextImageTypeViewHolder -> holder.bindViews(element as TextImageModel)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}