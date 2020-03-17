package com.mindorks.example.recyclerviewmultiviewtypes.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.example.recyclerviewmultiviewtypes.R
import com.mindorks.example.recyclerviewmultiviewtypes.model.TextModel

class TextTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var txt: TextView = itemView.findViewById(R.id.txt_text)
    var txt1: TextView = itemView.findViewById(R.id.txt_text1)

    fun bindViews(textModel: TextModel) {
        txt.text = textModel.text
        txt1.text = textModel.text2
    }
}