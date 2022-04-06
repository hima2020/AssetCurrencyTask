package com.asset.currency.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.asset.currency.R
import com.asset.currency.databinding.ActivityDetailsBinding
import com.asset.currency.ui.details.view.adapter.CommonCurrencyAdapter
import com.asset.currency.ui.details.view.adapter.CurrencyAdapter
import com.asset.currency.ui.details.viewmodel.DetailsViewModel
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel
import java.util.*


class DetailsActivity : AppCompatActivity() {


    private val viewModel: DetailsViewModel by currentScope.viewModel(this)

    private lateinit var adapter: CurrencyAdapter
    private lateinit var commonAdapter: CommonCurrencyAdapter


    private var binding: ActivityDetailsBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)
        initViews()
    }

    private fun initViews() {


        viewModel.model.observe(this, Observer(::updateUi))
        binding?.rvConvrtingHistory?.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding?.rvConvrtingHistory?.setHasFixedSize(true)

        binding?.rvCommonCurrencies?.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding?.rvCommonCurrencies?.setHasFixedSize(true)

        adapter = CurrencyAdapter()
        commonAdapter = CommonCurrencyAdapter()
        binding?.rvConvrtingHistory?.adapter = adapter
        binding?.rvCommonCurrencies?.adapter = commonAdapter


    }


    private fun updateUi(model: DetailsViewModel.UiModel) {


        when (model) {

            is DetailsViewModel.UiModel.Content -> {

                adapter.currencies = model.history.toMutableList()
                adapter.notifyDataSetChanged()
                commonAdapter.commonCurrencies = model.commonCurrencies.toMutableList()
                commonAdapter.notifyDataSetChanged()

            }
            DetailsViewModel.UiModel.showUI -> {
                viewModel.showUi()
            }
        }
    }


    companion object {
        private val CLASS_TAG = DetailsActivity::class.java.simpleName

    }


}