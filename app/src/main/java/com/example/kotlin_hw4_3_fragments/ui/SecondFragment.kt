package com.example.kotlin_hw4_3_fragments.ui

import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_hw4_3_fragments.base.BaseFragment
import com.example.kotlin_hw4_3_fragments.databinding.FragmentSecondBinding
import com.example.kotlin_hw4_3_fragments.main.MainViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun inflateViewBinding(): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

    }

    override fun observe() {
        viewModel.counter.observe(this) {
          binding.tvCounter.text = it.toString()
        }

    }

    override fun initClickListener() { }


}