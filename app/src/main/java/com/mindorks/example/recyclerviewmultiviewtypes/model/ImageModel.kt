package com.mindorks.example.recyclerviewmultiviewtypes.model

import com.mindorks.example.recyclerviewmultiviewtypes.R

data class ImageModel (
    var imageId: Int = 0,
    override val viewType: Int = R.layout.image_type
) : ParentModel