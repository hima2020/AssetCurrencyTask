package com.asset.currency

import android.app.Application
import com.asset.currency.di.initDI
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()



        initDI()
    }
}
