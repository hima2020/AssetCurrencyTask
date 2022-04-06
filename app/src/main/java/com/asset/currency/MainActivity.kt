package com.asset.currency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asset.currency.ui.main.view.CurrencyFragment

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