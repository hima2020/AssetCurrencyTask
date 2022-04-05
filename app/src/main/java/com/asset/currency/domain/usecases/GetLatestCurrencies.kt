package com.asset.currency.domain.usecases

import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.data.repository.CurrencyRepository


class GetLatestCurrencies(private val currenciesRepository: CurrencyRepository) {
    suspend fun invoke(): CurrencyDataModel = currenciesRepository.getLatestCurrencies()
}