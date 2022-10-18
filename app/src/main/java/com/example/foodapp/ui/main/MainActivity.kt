package com.example.foodapp.ui.main

import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.foodapp.R
import com.example.foodapp.ui.base.BaseActivity
import com.example.foodapp.databinding.ActivityMainBinding
import com.example.foodapp.util.bindingAdapter.setVisibility
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutID(): Int = R.layout.activity_main
    override val viewModel: MainActivityViewModel by viewModels()

    override fun onResume() {
        super.onResume()
        binding.navigation.setupWithNavController(findNavController(R.id.fragment_host))
    }

    override fun onSupportNavigateUp(): Boolean {
        findNavController(R.id.fragment_host).navigateUp()
        return true
    }

    fun setDefaultAppBarVisibility(visible: Boolean){
        setVisibility(binding.appbar, visible)
    }

}