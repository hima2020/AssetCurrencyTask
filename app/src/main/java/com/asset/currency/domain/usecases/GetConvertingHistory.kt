package com.asset.currency.domain.usecases

import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.data.repository.CurrencyRepository


class GetConvertingHistory(private val currenciesRepository: CurrencyRepository) {
    suspend fun invoke(): List<ConvertingDataModel> = currenciesRepository.getConvertingHistory()
}