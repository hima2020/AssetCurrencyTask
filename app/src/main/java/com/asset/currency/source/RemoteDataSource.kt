package com.asset.currency.source

import com.asset.currency.data.model.CurrencyDataModel

interface RemoteDataSource {
    suspend fun getLatestCurrencies(base: String): CurrencyDataModel
}