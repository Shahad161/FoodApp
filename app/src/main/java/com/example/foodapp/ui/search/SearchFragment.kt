package com.example.foodapp.ui.search

import androidx.fragment.app.viewModels
import com.example.foodapp.R
import com.example.foodapp.ui.base.BaseFragment
import com.example.foodapp.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    override fun getLayoutID(): Int = R.layout.fragment_search
    override val viewModel: SearchViewModel by viewModels()

}