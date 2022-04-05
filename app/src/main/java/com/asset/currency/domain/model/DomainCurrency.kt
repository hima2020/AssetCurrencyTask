
package com.asset.currency.domain.model

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
@Entity
data class DomainCurrency(
  @PrimaryKey(autoGenerate = true)
  val id: Int,
  @Embedded val rates: @RawValue RateDataModel?,
  val base: String,
): Parcelable {
  constructor() : this(1, null, "")
}