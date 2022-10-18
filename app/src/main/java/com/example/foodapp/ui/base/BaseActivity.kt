package com.example.foodapp.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.*
import com.example.foodapp.BR
import com.example.foodapp.ui.main.MainActivityViewModel

abstract class BaseActivity<VDB : ViewDataBinding>: AppCompatActivity(){

    protected abstract fun getLayoutID(): Int

    private lateinit var _binding: VDB
    protected val binding get() = _binding

    protected abstract val viewModel: MainActivityViewModel
    protected open val viewModelBindingVariable get() = BR.viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView<VDB>(this, getLayoutID()).apply {
            setVariable(viewModelBindingVariable, viewModel)
            lifecycleOwner = this@BaseActivity
        }
    }

}