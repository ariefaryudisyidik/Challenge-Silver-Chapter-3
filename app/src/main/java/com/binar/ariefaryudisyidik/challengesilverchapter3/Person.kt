package com.binar.ariefaryudisyidik.challengesilverchapter3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name: String? = null,
    val age: Int? = null,
    val address: String? = null,
    val profession: String? = null
) : Parcelable
