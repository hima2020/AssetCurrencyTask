package com.asset.currency.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
    @Entity
    data class ConvertingHistory(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val from: String,
        val to: String,
        val amount : Double,
        val result : Double ,
        val date:Long ,
        val formatedDate : String
    ): Parcelable
