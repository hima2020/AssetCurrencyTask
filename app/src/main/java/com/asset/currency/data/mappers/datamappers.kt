package com.asset.currency.data.mappers

import com.asset.currency.data.datasource.ServerCurrency
import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.domain.model.ConvertingHistory
import com.asset.currency.domain.model.DomainCurrency


fun CurrencyDataModel.toRoomCurrency(): DomainCurrency =
    DomainCurrency(
        id = 0,
        rates,
        base?:"EUR",

    )
fun ConvertingDataModel.toRoomCurrency(): ConvertingHistory =
    ConvertingHistory(
        id = 0,
        from,
        to, amount, result, date, formatedDate)

fun ConvertingHistory.toDataModelCurrency(): ConvertingDataModel =
    ConvertingDataModel(
        from,
        to, amount, result, date, formatedDate)



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