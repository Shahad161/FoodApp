package com.example.foodapp.ui.base

import android.os.Bundle
import android.view.*
import androidx.databinding.*
import androidx.fragment.app.Fragment
import com.example.foodapp.BR
import com.example.foodapp.ui.main.MainActivity

abstract class BaseFragment<VDB : ViewDataBinding> : Fragment() {

    protected abstract fun getLayoutID(): Int

    protected open val useDefaultAppBar: Boolean = true

    private lateinit var _binding: VDB
    protected val binding get() = _binding

    protected abstract val viewModel: BaseViewModel
    protected open val viewModelBindingVariable get() = BR.viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate<VDB>(inflater, getLayoutID(), container, false).apply {
            setVariable(viewModelBindingVariable, viewModel)
            lifecycleOwner = viewLifecycleOwner
        }
        (activity as MainActivity).setDefaultAppBarVisibility(useDefaultAppBar)
        return _binding.root
    }
}