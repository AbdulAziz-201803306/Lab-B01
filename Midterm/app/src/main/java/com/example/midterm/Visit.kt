package com.example.midterm

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Visit() : Parcelable {
    var code : String? = null
    var name : String? = null
    var rating : Float? = 0f
    var amount : Float? = 0f
}