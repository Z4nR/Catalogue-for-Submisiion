package com.zulham.filmtvapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class TV (
    var title: String?,
    var description: String?,
    var production: String?,
    var date: String?,
    var img: Int?
) : Parcelable