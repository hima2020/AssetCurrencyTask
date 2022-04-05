package com.asset.currency.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.domain.usecases.GetLatestCurrencies
import com.asset.currency.utils.ScopedViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch

class CurrencyViewModel(
    private val getCurrencies: GetLatestCurrencies,
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
        class Content(val currencies: CurrencyDataModel) : UiModel()
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
            uiModel.value = UiModel.Content(getCurrencies.invoke() )

        }
    }

    override fun onCleared() {
        destroyScope()
        super.onCleared()
    }
}