package com.mindorks.example.recyclerviewmultiviewtypes

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.example.recyclerviewmultiviewtypes.adapter.MultiViewTypeAdapter
import com.mindorks.example.recyclerviewmultiviewtypes.model.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MultiViewTypeAdapter(createList(),this)
        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapter
    }

    private fun createList(): MutableList<ParentModel> {
        val list = mutableListOf<ParentModel>()
        list.add(ImageModel(R.drawable.image1))
        list.add(TextImageModel("Hello! This is text/image View Type.", R.drawable.image2))
        list.add(AudioModel("Hello! This is audio type view. Press on the play button to play a sample audio",R.raw.the_chainsmokers))
        list.add(TextModel("Hello! This is text only View Type.", "Lorem ipsum dolor sit amet, consectetur adipiscing"))
        list.add(TextImageModel("Hello! This is text/image View Type.", R.drawable.image3))
        list.add(ImageModel(R.drawable.image4))
        list.add(TextModel("Hello! This is text only View Type.", "Lorem ipsum dolor sit amet, consectetur adipiscing"))
        list.add(ImageModel(R.drawable.image5))
        list.add(AudioModel("Hello! This is audio type view. Press on the play button to play a sample audio",R.raw.the_chainsmokers))
        list.add(TextModel("Hello! This is text only View Type.", "Lorem ipsum dolor sit amet, consectetur adipiscing"))
        return list
    }

}

