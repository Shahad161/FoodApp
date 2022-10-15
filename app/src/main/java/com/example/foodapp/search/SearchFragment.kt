package com.example.foodapp.search

import androidx.fragment.app.viewModels
import com.example.foodapp.R
import com.example.foodapp.base.BaseFragment
import com.example.foodapp.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    override fun getLayoutID(): Int = R.layout.fragment_search
    override val viewModel: SearchViewModel by viewModels()

}