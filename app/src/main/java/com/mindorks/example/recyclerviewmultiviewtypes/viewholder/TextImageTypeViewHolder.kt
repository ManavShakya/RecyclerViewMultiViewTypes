package com.mindorks.example.recyclerviewmultiviewtypes.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.example.recyclerviewmultiviewtypes.R
import com.mindorks.example.recyclerviewmultiviewtypes.model.TextImageModel

class TextImageTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var txt: TextView = itemView.findViewById(R.id.txt_text_image)
    var image: ImageView = itemView.findViewById(R.id.background_text_image)
    fun bindViews(textImageModel: TextImageModel) {
        txt.text = textImageModel.text
        image.setImageResource(textImageModel.imageId)
    }
}