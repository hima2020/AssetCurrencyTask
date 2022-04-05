package com.asset.currency

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asset.currency.ui.view.CurrencyFragment
import com.asset.currency.ui.viewmodel.CurrencyViewModel
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }


    private fun initViews() {
        initCurrencyFragment()
    }

    private fun initCurrencyFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, CurrencyFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }





    companion object {
        private val CLASS_TAG = MainActivity::class.java.simpleName
    }
}