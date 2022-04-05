package com.asset.currency.data.model

import com.asset.currency.domain.model.RateDataModel

data class CurrencyDataModel(
    val base: String?,
    val rates: RateDataModel?,
)
