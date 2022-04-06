package com.asset.currency.data.repository

import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.source.LocalDataSource
import com.asset.currency.source.RemoteDataSource
class CurrencyRepository(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val BASE_CURRENCY: String = "EUR"
) {

    suspend fun getLatestCurrencies(): CurrencyDataModel {
        if (localDataSource.isEmpty()) {
            val currencies =
                remoteDataSource.getLatestCurrencies(BASE_CURRENCY)
            localDataSource.saveCurrencies(currencies)
        }

        return localDataSource.getLatestCurrencies()
    }

    suspend fun saveConvertingHistory(model:ConvertingDataModel): Boolean {
        localDataSource.insertConvertHistory(model)
        return true
    }

    suspend fun getConvertingHistory(): List<ConvertingDataModel> {
        return localDataSource.getConvertingHistory()
    }
}