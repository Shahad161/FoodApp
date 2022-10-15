package com.example.foodapp.home


import androidx.fragment.app.viewModels
import com.example.foodapp.R
import com.example.foodapp.base.BaseFragment
import com.example.foodapp.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutID(): Int = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

}