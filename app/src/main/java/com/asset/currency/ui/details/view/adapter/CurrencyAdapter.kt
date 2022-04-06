package com.asset.currency.ui.details.view.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.asset.currency.R
import com.asset.currency.data.model.ConvertingDataModel
import com.asset.currency.extensions.basicDiffUtil
import com.asset.currency.extensions.inflate


class CurrencyAdapter : RecyclerView.Adapter<CurrencyAdapter.ViewHolder>() {

    private lateinit var mholder: ViewHolder
    private lateinit var currency: ConvertingDataModel

    var currencies: MutableList<ConvertingDataModel> by basicDiffUtil(
        mutableListOf(),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.item_convert_history, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = currencies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        mholder = holder
        currency = currencies[position]
        holder.bind(currency)
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var tvAmount: TextView
        private var tvResult: TextView
        private var tvDate: TextView

        init {
            super.itemView
            tvAmount = itemView.findViewById(R.id.tv_amount)
            tvResult = itemView.findViewById(R.id.tv_result)
            tvDate = itemView.findViewById(R.id.tvDate)
        }


        fun bind(currency: ConvertingDataModel) {
            tvAmount.text = "${currency.amount}  ${currency.from}"
            tvResult.text = "${currency.result}  ${currency.to}"
            tvDate.text = "${currency.formatedDate}"
        }


    }
}