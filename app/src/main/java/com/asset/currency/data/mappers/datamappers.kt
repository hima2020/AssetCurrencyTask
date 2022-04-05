package com.asset.currency.data.mappers

import com.asset.currency.data.datasource.CurrencyDataSource
import com.asset.currency.data.datasource.ServerCurrency
import com.asset.currency.data.datasource.ServerRate
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.domain.model.RateDataModel
import com.asset.currency.domain.model.DomainCurrency


fun CurrencyDataModel.toRoomCurrency(): DomainCurrency =
    DomainCurrency(
        id = 0,
        rates,
        base?:"EUR",

    )

fun DomainCurrency.toDataModelCurrency(): CurrencyDataModel =
    CurrencyDataModel(
        base,
       rates

    )

fun ServerCurrency.toDomainCurrency(): CurrencyDataModel =
    CurrencyDataModel(
       base,
        rates

    )