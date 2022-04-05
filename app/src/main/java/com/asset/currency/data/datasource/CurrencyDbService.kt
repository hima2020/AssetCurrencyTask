package com.asset.currency.data.datasource

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyDbService {

    @GET("latest")
    fun getAllCurrencies(@Query("access_key") ApiToken: String): Deferred<ServerCurrency>
}