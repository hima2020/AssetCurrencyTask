package com.asset.currency.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.domain.usecases.GetLatestCurrencies
import com.asset.currency.domain.usecases.SaveConvertingHistory
import com.asset.currency.extensions.round
import com.asset.currency.utils.ScopedViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap
import kotlin.reflect.full.memberProperties

class CurrencyViewModel(
    private val getCurrencies: GetLatestCurrencies,
    private val saveHistory:SaveConvertingHistory,
    uiDispatcher: CoroutineDispatcher
) : ScopedViewModel(uiDispatcher) {

    private val uiModel = MutableLiveData<UiModel>()
    val model: LiveData<UiModel>
        get() {
            if (uiModel.value == null) refresh()
            return uiModel
        }

     val convertingResult:MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }


    sealed class UiModel {
        object Loading : UiModel()
        class Content(val currencies: CurrencyDataModel ,val currencyMap :HashMap<String,Double>) : UiModel()
        object showUI : UiModel()
    }

    init {
        initScope()
    }

    private fun refresh() {
        uiModel.value = UiModel.showUI
    }

    fun showUi() {
        launch {
            uiModel.value = UiModel.Loading
            val currencies = getCurrencies.invoke()
            uiModel.value = UiModel.Content(currencies,currencies.rates?.asMap() as HashMap<String, Double>)

        }
    }

    fun convertCurrencies(currencyFrom:String, currencyTo:String , to:Double,from:Double,amount:Double){
        launch {
            val result = (to / from *amount).round(2)
            convertingResult.value = result
            saveHistory.invoke(ConvertingDataModel(
                from = currencyFrom,
                to  = currencyTo,
                amount = amount,
                result = result,
                date = Date().time,
                formatedDate = SimpleDateFormat("yyyy MM DD").format(Date().time)
            ))
        }
    }

    inline fun <reified T : Any> T.asMap() : Map<String, Any?> {
        val props = T::class.memberProperties.associateBy { it.name }
        return props.keys.associateWith { props[it]?.get(this) }
    }

    override fun onCleared() {
        destroyScope()
        super.onCleared()
    }
}