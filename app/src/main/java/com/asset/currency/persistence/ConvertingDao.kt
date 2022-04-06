

package com.asset.currency.persistence

import androidx.room.*
import com.asset.currency.domain.model.ConvertingHistory
import com.asset.currency.domain.model.DomainCurrency

@Dao
interface ConvertingDao {

  @Query("SELECT * FROM ConvertingHistory")
  fun getAll(): ConvertingHistory

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  fun insertCurrencies(currencies: ConvertingHistory)



}
