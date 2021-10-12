package com.example.kotlin_hw4_3_fragments.ui

import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_hw4_3_fragments.base.BaseFragment
import com.example.kotlin_hw4_3_fragments.databinding.FragmentFirstBinding
import com.example.kotlin_hw4_3_fragments.main.MainViewModel

class FirstFragment:BaseFragment<FragmentFirstBinding> (){

    private lateinit var viewModel:  MainViewModel
    private var list = arrayListOf<String>()

    override fun inflateViewBinding(): FragmentFirstBinding {
       return FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

    }

    override fun observe() {


    }

    override fun initClickListener() {
        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementClick()
            list.add("+")
            viewModel.setHistory(list)
        }

        binding.btnMinus.setOnClickListener {
            viewModel.onPreIncrementClick()
            list.add("-")
            viewModel.setHistory(list)
        }

    }
}