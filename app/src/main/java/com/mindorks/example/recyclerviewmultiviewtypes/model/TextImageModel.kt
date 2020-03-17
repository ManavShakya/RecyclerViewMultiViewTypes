package com.mindorks.example.recyclerviewmultiviewtypes.model

import com.mindorks.example.recyclerviewmultiviewtypes.R

data class TextImageModel (
    var text: String = " ",
    var imageId: Int = 0,
    override val viewType: Int = R.layout.text_image_type
) : ParentModel