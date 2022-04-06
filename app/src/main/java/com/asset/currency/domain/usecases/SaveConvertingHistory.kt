package com.asset.currency.domain.usecases

import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.data.repository.CurrencyRepository


class SaveConvertingHistory(private val currenciesRepository: CurrencyRepository) {
    suspend fun invoke(model:ConvertingDataModel) : Boolean = currenciesRepository.saveConvertingHistory(model)
}