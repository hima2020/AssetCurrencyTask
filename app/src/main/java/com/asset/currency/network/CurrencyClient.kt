
package com.asset.currency.network

import com.skydoves.sandwich.ApiResponse
import javax.inject.Inject

class CurrencyClient @Inject constructor(
  private val currencyService: CurrencyService
) {


  companion object {
    private const val PAGING_SIZE = 20
  }
}
