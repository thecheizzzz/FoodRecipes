package com.example.quizapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Food(

    val url: String? = null,
    val foodName: String? = null,
    val Description: String? = null

) : Parcelable {

    constructor():this(
        " " ,
        " ",
        "",

    )

}