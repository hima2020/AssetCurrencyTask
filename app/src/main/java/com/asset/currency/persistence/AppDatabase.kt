

package com.asset.currency.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.asset.currency.domain.model.ConvertingHistory
import com.asset.currency.domain.model.DomainCurrency


@Database(entities = [DomainCurrency::class, ConvertingHistory::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

 companion object {
  fun build(context: Context) = Room.databaseBuilder(
   context,
   AppDatabase::class.java,
   "currency-db"
  ).build()
 }

 abstract fun currencyDao(): CurrencyDao
 abstract fun convertingDao(): ConvertingDao
}
