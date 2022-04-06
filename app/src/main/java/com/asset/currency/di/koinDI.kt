package com.asset.currency.di

import android.app.Application
import com.asset.currency.data.datasource.CurrencyDataSource
import com.asset.currency.data.repository.CurrencyRepository
import com.asset.currency.domain.usecases.GetLatestCurrencies
import com.asset.currency.domain.usecases.SaveConvertingHistory
import com.asset.currency.persistence.AppDatabase
import com.asset.currency.persistence.RoomDataSource
import com.asset.currency.source.LocalDataSource
import com.asset.currency.source.RemoteDataSource
import com.asset.currency.ui.view.CurrencyFragment
import com.asset.currency.ui.viewmodel.CurrencyViewModel

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.module

fun Application.initDI() {
    startKoin {
        androidLogger()
        androidContext(this@initDI)
        modules(listOf(appModule, dataModule, scopesModule))
    }
}

private val appModule = module {
    single { AppDatabase.build(get()) }
    factory<LocalDataSource> { RoomDataSource(get()) }
    factory<RemoteDataSource> { CurrencyDataSource() }
    single<CoroutineDispatcher> { Dispatchers.Main }
}

val dataModule = module {
    factory { CurrencyRepository(get(), get()) }
}

private val scopesModule = module {
    scope(named<CurrencyFragment>()) {
        viewModel { CurrencyViewModel(get(), get(),get ()) }
        scoped { GetLatestCurrencies(get()) }
        scoped { SaveConvertingHistory(get()) }
    }
}