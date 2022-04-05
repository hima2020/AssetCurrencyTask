package com.asset.currency.persistence

import androidx.room.*

@Dao
interface RateDAO {

    @Query("SELECT * FROM CurrencyRate")
    fun getAll(): MutableList<CurrencyRate>

    @Query("SELECT * FROM CurrencyRate WHERE rateId = :id")
    fun findById(id: Int): CurrencyRate

    @Query("SELECT COUNT(rateId) FROM CurrencyRate")
    fun rateCount(): Int

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertRates(rates: List<CurrencyRate>)
}