package com.mindorks.example.recyclerviewmultiviewtypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.example.recyclerviewmultiviewtypes.adapter.MultiViewTypeAdapter
import com.mindorks.example.recyclerviewmultiviewtypes.model.ImageModel
import com.mindorks.example.recyclerviewmultiviewtypes.model.ParentModel
import com.mindorks.example.recyclerviewmultiviewtypes.model.TextImageModel
import com.mindorks.example.recyclerviewmultiviewtypes.model.TextModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<ParentModel>()
        list.add(ImageModel(R.drawable.image1))
        list.add(TextImageModel("Hello! This is text/image View Type.",
            R.drawable.image2))
        list.add(TextModel("Hello! This is text only View Type.", "Lorem ipsum dolor sit amet, consectetur adipiscing"))
        list.add(TextImageModel("Hello! This is text/image View Type.",
            R.drawable.image3))
        list.add(ImageModel(R.drawable.image4))
        list.add(TextModel("Hello! This is text only View Type.", "Lorem ipsum dolor sit amet, consectetur adipiscing"))
        list.add(ImageModel(R.drawable.image5))
        list.add(TextImageModel("Hello! This is text/image View Type.",
            R.drawable.image1))
        list.add(TextModel("Hello! This is text only View Type.", "Lorem ipsum dolor sit amet, consectetur adipiscing"))
        list.addAll(list)
        list.addAll(list)


        val adapter = MultiViewTypeAdapter(list)
        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapter
    }

}

