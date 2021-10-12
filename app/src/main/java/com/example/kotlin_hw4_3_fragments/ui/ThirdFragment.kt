package com.example.kotlin_hw4_3_fragments.ui

import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_hw4_3_fragments.adapters.ThirdFragmentAdapter
import com.example.kotlin_hw4_3_fragments.base.BaseFragment
import com.example.kotlin_hw4_3_fragments.databinding.FragmentThirdBinding
import com.example.kotlin_hw4_3_fragments.main.MainViewModel

class ThirdFragment:BaseFragment<FragmentThirdBinding> (){

   private lateinit var viewModel: MainViewModel
   private lateinit var adapter:ThirdFragmentAdapter

    override fun inflateViewBinding(): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel =ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        adapter = ThirdFragmentAdapter()
    }

    override fun observe() {
        viewModel.historyList.observe(this){
            adapter.setList(it)
        }
        binding.rvHistory.adapter =adapter
    }

    override fun initClickListener() {

    }
}