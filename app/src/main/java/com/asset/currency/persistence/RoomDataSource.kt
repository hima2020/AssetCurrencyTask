package com.asset.currency.persistence

import com.asset.currency.data.mappers.toDataModelCurrency
import com.asset.currency.data.mappers.toRoomCurrency
import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.source.LocalDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RoomDataSource(db: AppDatabase) : LocalDataSource {

    private val currencyDao = db.currencyDao()
    private val convertingDao = db.convertingDao()

    override suspend fun isEmpty(): Boolean =
        withContext(Dispatchers.IO) { currencyDao.currencyCount() <= 0 }


    override suspend fun findById(id: Int): CurrencyDataModel = withContext(Dispatchers.IO) {
        currencyDao.findById(id).toDataModelCurrency()
    }

    override suspend fun saveCurrencies(currencies: CurrencyDataModel) {
        withContext(Dispatchers.IO) { currencyDao.insertCurrencies(currencies.toRoomCurrency()) }
    }

    override suspend fun insertConvertHistory(model: ConvertingDataModel) {
        withContext(Dispatchers.IO) { convertingDao.insertCurrencies(model.toRoomCurrency()) }
    }

    override suspend fun getConvertingHistory():List<ConvertingDataModel> = withContext(Dispatchers.IO) {
        convertingDao.getAll().map { it.toDataModelCurrency() }.toMutableList()}

    override suspend fun getLatestCurrencies(): CurrencyDataModel = withContext(Dispatchers.IO) {
        currencyDao.getAll().toDataModelCurrency()}
    

    override suspend fun update(currency: CurrencyDataModel) {
        withContext(Dispatchers.IO) { currencyDao.updateCurrency(currency.toRoomCurrency()) }
    }


}