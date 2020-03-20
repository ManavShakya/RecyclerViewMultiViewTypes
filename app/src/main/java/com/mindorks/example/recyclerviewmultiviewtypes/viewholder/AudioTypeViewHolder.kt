package com.mindorks.example.recyclerviewmultiviewtypes.viewholder

import android.content.Context
import android.media.MediaPlayer
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mindorks.example.recyclerviewmultiviewtypes.R
import com.mindorks.example.recyclerviewmultiviewtypes.model.AudioModel

class AudioTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var fabState: Boolean = false
    lateinit var mediaPlayer: MediaPlayer
        val text: TextView = itemView.findViewById(R.id.txt_audio_type)
        val fab: FloatingActionButton = itemView.findViewById(R.id.fab_audio_type)
        fun bindViews(audioModel: AudioModel, context: Context) {
            text.text = audioModel.text
            fab.setOnClickListener(
                object : View.OnClickListener {
                    override fun onClick(view: View?) {
                        if (fabState) {
                            if (mediaPlayer.isPlaying) {
                                mediaPlayer.stop()
                            }
                            fab.setImageResource(R.drawable.ic_play)
                            fabState = false
                        } else {
                            mediaPlayer = MediaPlayer.create(context, R.raw.sound)
                            mediaPlayer.start()
                            mediaPlayer.isLooping = true
                            fab.setImageResource(R.drawable.ic_mute)
                            fabState = true
                        }
                    }
                })
        }
}