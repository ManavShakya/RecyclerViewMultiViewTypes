package com.mindorks.example.recyclerviewmultiviewtypes.model
import com.mindorks.example.recyclerviewmultiviewtypes.R

data class AudioModel(
    var text: String = " ",
    // address of audio
    var audio: Int = 0,
    override val viewType: Int = R.layout.audio_type
) : ParentModel