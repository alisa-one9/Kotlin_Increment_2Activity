package com.example.kotlin_hw4_3_fragments.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.fragment.app.Fragment
import com.example.kotlin_hw4_3_fragments.R
import com.example.kotlin_hw4_3_fragments.adapters.ViewPagerAdapter
import com.example.kotlin_hw4_3_fragments.databinding.ActivityMainBinding
import com.example.kotlin_hw4_3_fragments.ui.FirstFragment
import com.example.kotlin_hw4_3_fragments.ui.SecondFragment
import com.example.kotlin_hw4_3_fragments.ui.ThirdFragment
import com.google.android.material.tabs.TabLayoutMediator
import java.util.*
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter
    private var tabTitle = mutableListOf("Operations","Results","History")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewPager()
        initTabLayout()
    }

    private fun initTabLayout() {
        TabLayoutMediator(binding.tab, binding.viewPager) {
            tab,position ->
            tab.text = tabTitle[position]
        }.attach()
    }

    private fun initViewPager() {
        adapter = ViewPagerAdapter(this)
        adapter.setList(createList())
        binding.viewPager.adapter =adapter

    }

    private fun createList(): ArrayList<Fragment> {
         return arrayListOf(FirstFragment(), SecondFragment(), ThirdFragment())
    }


}

