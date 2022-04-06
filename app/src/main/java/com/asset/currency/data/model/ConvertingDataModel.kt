package com.asset.currency.data.model

data class ConvertingDataModel(
    val from: String,
    val to: String,
    val amount: Double,
    val result: Double,
    val date:Long,
    val formatedDate : String)
