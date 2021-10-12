package com.example.kotlin_hw4_3_fragments.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {

    private var list = arrayListOf<Fragment>()

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list [position]
    }
 fun setList(list: ArrayList<Fragment>){
     this.list =list
     notifyDataSetChanged()

 }
}