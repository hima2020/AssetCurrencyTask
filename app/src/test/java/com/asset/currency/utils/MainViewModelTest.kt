package com.asset.currency.utils

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.domain.usecases.GetLatestCurrencies
import com.asset.currency.domain.usecases.SaveConvertingHistory
import com.asset.currency.ui.main.viewmodel.CurrencyViewModel
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyDouble
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class CurrencyViewModelTest {
    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()
    private lateinit var viewModel: CurrencyViewModel

    @Mock
    private lateinit var getLatestCurrencies: GetLatestCurrencies

    @Mock
    private lateinit var uiDispatcher: CoroutineDispatcher

    @Mock
    private lateinit var saveConvertingHistory: SaveConvertingHistory

    @Mock
    private lateinit var currenciesResponseObserver: Observer<CurrencyViewModel.UiModel>

    @Before
    fun setUp() {
        viewModel = CurrencyViewModel(getLatestCurrencies, saveConvertingHistory, uiDispatcher)
    }

    @Test
    fun `when convertion ok then return a save db record`() {
        val emptyList = arrayListOf<CurrencyDataModel>()
        testCoroutineRule.runBlockingTest {
            viewModel.model.observeForever(currenciesResponseObserver)
            whenever(getLatestCurrencies.invoke()).thenAnswer {
                Result.success(emptyList)
            }

            viewModel.showUi()
            assertNotNull(
                viewModel.convertCurrencies(
                    anyString(), anyString(), anyDouble(),
                    anyDouble(), anyDouble()
                )
            )
            assertEquals(
                Result.success(emptyList), viewModel.convertCurrencies(
                    anyString(), anyString(), anyDouble(),
                    anyDouble(), anyDouble()
                )
            )
        }
    }


    @After
    fun tearDown() {
        viewModel.model.removeObserver(currenciesResponseObserver)
    }
}