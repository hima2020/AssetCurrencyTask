package com.asset.currency.ui.details.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.domain.model.CommonCurrency
import com.asset.currency.domain.usecases.GetConvertingHistory
import com.asset.currency.domain.usecases.GetLatestCurrencies
import com.asset.currency.utils.ScopedViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import kotlin.reflect.full.memberProperties

class DetailsViewModel(
    private val getConvertingHistory: GetConvertingHistory,
    private val getLatestCurrencies: GetLatestCurrencies,
    uiDispatcher: CoroutineDispatcher
) : ScopedViewModel(uiDispatcher) {

    private val uiModel = MutableLiveData<UiModel>()
    val model: LiveData<UiModel>
        get() {
            if (uiModel.value == null) refresh()
            return uiModel
        }

    sealed class UiModel {
        object Loading : UiModel()
        class Content(val history: List<ConvertingDataModel>,val commonCurrencies:List<CommonCurrency>) : UiModel()
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
            val history = getConvertingHistory.invoke()
            val commonCurrenciesMap = getLatestCurrencies.invoke().rates?.asMap()
            val commonList = commonCurrenciesMap?.map {
                CommonCurrency(it.key,it.value.toString())
            }
            uiModel.value = UiModel.Content(history,commonList!!)

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