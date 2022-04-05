package com.asset.currency.data.datasource

import android.os.Parcelable
import com.asset.currency.domain.model.RateDataModel
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ServerCurrency(
    val id: Int,
    @SerializedName("rates")
    val rates: RateDataModel?,
    val base: String,
    val date: String
) : Parcelable

@Parcelize
data class ServerRate(
    val rateId: Int,
    @SerializedName("EUR")
    val eur: Double,
    @SerializedName("JPY")
    val jpy: Double,
    @SerializedName("BRL")
    val brl: Double,
    @SerializedName("GBP")
    val gbp: Double
) : Parcelable