

package com.asset.currency.persistence

import androidx.room.*
import com.asset.currency.domain.model.DomainCurrency

@Dao
interface CurrencyDao {

  @Query("SELECT * FROM DomainCurrency")
  fun getAll(): DomainCurrency

  @Query("SELECT * FROM DomainCurrency WHERE id = :id")
  fun findById(id: Int): DomainCurrency

  @Query("SELECT COUNT(id) FROM DomainCurrency")
  fun currencyCount(): Int

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  fun insertCurrencies(currencies: DomainCurrency)

  @Update
  fun updateCurrency(domainCurrency: DomainCurrency)

}
