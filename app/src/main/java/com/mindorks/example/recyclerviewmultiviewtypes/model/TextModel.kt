package com.mindorks.example.recyclerviewmultiviewtypes.model

import com.mindorks.example.recyclerviewmultiviewtypes.R

data class TextModel (
    var text: String = " ",
    var text2: String = " ",
    override val viewType: Int = R.layout.text_type
) : ParentModel