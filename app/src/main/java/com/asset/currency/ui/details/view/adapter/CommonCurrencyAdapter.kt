package com.asset.currency.ui.details.view.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.asset.currency.R
import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.domain.model.CommonCurrency
import com.asset.currency.extensions.basicDiffUtil
import com.asset.currency.extensions.inflate


class CommonCurrencyAdapter : RecyclerView.Adapter<CommonCurrencyAdapter.ViewHolder>() {

    private lateinit var mholder: ViewHolder
    private lateinit var currency: CommonCurrency

    var commonCurrencies: MutableList<CommonCurrency> by basicDiffUtil(
        mutableListOf(),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.item_common_currencies, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = commonCurrencies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        mholder = holder
        currency = commonCurrencies[position]
        holder.bind(currency)
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var tvkey: TextView
        private var tvValue: TextView

        init {
            super.itemView
            tvkey = itemView.findViewById(R.id.tv_currency_key)
            tvValue = itemView.findViewById(R.id.tv_currency_rate)
        }


        fun bind(currency: CommonCurrency) {
            tvkey.text = "${currency.key}"
            tvValue.text = "${currency.value}"

        }


    }
}