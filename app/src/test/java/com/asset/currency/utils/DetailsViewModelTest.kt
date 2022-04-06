package com.asset.currency.utils

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.domain.usecases.GetConvertingHistory
import com.asset.currency.domain.usecases.GetLatestCurrencies
import com.asset.currency.ui.details.viewmodel.DetailsViewModel
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
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class DetailsViewModelTest {
    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()
    private lateinit var viewModel: DetailsViewModel

    @Mock
    private lateinit var getConvertingHistory: GetConvertingHistory

    @Mock
    private lateinit var uiDispatcher: CoroutineDispatcher

    @Mock
    private lateinit var getLatestCurrencies: GetLatestCurrencies

    @Mock
    private lateinit var currenciesResponseObserver: Observer<DetailsViewModel.UiModel>

    @Before
    fun setUp() {
        viewModel = DetailsViewModel(getConvertingHistory, getLatestCurrencies, uiDispatcher)
    }

    @Test
    fun `when returning convertions history and common rates`() {
        val emptyList = arrayListOf<CurrencyDataModel>()
        testCoroutineRule.runBlockingTest {
            viewModel.model.observeForever(currenciesResponseObserver)
            whenever(getLatestCurrencies.invoke()).thenAnswer {
                Result.success(emptyList)
            }

            viewModel.showUi()
            assertNotNull(viewModel.showUi())
            assertEquals(Result.success(emptyList), viewModel.showUi())
        }
    }


    @After
    fun tearDown() {
        viewModel.model.removeObserver(currenciesResponseObserver)
    }
}