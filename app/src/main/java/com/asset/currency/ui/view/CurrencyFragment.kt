package com.asset.currency.ui.view

import android.R
import android.app.Activity
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.asset.currency.data.model.CurrencyDataModel
import com.asset.currency.databinding.FragmentCurrencyBinding
import com.asset.currency.domain.model.RateDataModel
import com.asset.currency.ui.viewmodel.CurrencyViewModel
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel
import kotlin.reflect.full.memberProperties


class CurrencyFragment : Fragment() {

    private var binding: FragmentCurrencyBinding? = null
    private lateinit var amount: String
    private var currenciesList: MutableList<CurrencyDataModel> = mutableListOf()

    private  val  viewModel: CurrencyViewModel by currentScope.viewModel(this)

    lateinit var rateMAp : HashMap<String , Double>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCurrencyBinding.inflate(layoutInflater)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.model.observe(viewLifecycleOwner, Observer(::updateUi))
    }

    private fun updateUi(model: CurrencyViewModel.UiModel) {

        binding?.containerProgressIndicator?.visibility =
            if (model is CurrencyViewModel.UiModel.Loading) View.VISIBLE else View.GONE

        when (model) {

            is CurrencyViewModel.UiModel.Content -> {
                updateSpinners(model.currencies.rates)
            }
            CurrencyViewModel.UiModel.showUI -> {
                viewModel.showUi()
            }
        }
    }

    private fun updateSpinners(rates: RateDataModel?) {

        if (this::rateMAp.isInitialized)
            rateMAp.clear()

        rateMAp = rates?.asMap() as HashMap<String, Double>
        val list: MutableList<String> = ArrayList()
        for (rate in rateMAp){
           list.add(rate.key)
        }
        binding?.spFrom?.adapter = ArrayAdapter<String>(requireActivity(), R.layout.simple_list_item_1, list)
        binding?.spTo?.adapter = ArrayAdapter<String>(requireActivity(), R.layout.simple_list_item_1, list)
    }



    inline fun <reified T : Any> T.asMap() : Map<String, Any?> {
            val props = T::class.memberProperties.associateBy { it.name }
            return props.keys.associateWith { props[it]?.get(this) }
        }





    private fun hideKeyboard(activity: Activity) {
        val imm: InputMethodManager =
            requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view: View? = activity.currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }






    companion object {
        private val MAX_CHART_HORIZONTAL = 3
        private val MAX_RANGE = 100F
    }
}