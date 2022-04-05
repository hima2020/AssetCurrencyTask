package com.asset.currency.data.datasource

import com.asset.currency.BuildConfig
import com.asset.currency.data.mappers.toDomainCurrency
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.source.RemoteDataSource


class CurrencyDataSource : RemoteDataSource {

    override suspend fun getLatestCurrencies(base: String): CurrencyDataModel {
        return CurrencyDb.service
            .getAllCurrencies(BuildConfig.APITOKEN).await()
            .toDomainCurrency()
    }
}