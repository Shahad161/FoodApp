package com.example.foodapp.ui.home


import androidx.fragment.app.viewModels
import com.example.foodapp.R
import com.example.foodapp.ui.base.BaseFragment
import com.example.foodapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutID(): Int = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

}