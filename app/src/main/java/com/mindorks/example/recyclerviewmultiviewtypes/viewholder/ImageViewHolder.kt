package com.mindorks.example.recyclerviewmultiviewtypes.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.example.recyclerviewmultiviewtypes.R
import com.mindorks.example.recyclerviewmultiviewtypes.model.ImageModel

class ImageTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image: ImageView = itemView.findViewById(R.id.background_image)
    fun bindViews(imageModel: ImageModel) {
        image.setImageResource(imageModel.imageId)
    }
}