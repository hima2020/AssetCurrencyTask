package com.asset.currency.source

import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.data.model.CurrencyDataModel


interface LocalDataSource {
    suspend fun isEmpty(): Boolean
    suspend fun saveCurrencies(currencies: CurrencyDataModel)
    suspend fun insertConvertHistory(model: ConvertingDataModel)
    suspend fun getConvertingHistory():List<ConvertingDataModel>
    suspend fun getLatestCurrencies(): CurrencyDataModel
    suspend fun findById(id: Int): CurrencyDataModel
    suspend fun update(currency: CurrencyDataModel)
}