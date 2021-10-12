package com.example.kotlin_hw4_3_fragments.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlin_hw4_3_fragments.databinding.ItemBinding

class ThirdFragmentAdapter : RecyclerView.Adapter<ThirdFragmentAdapter.ViewHolder> () {

private var list = arrayListOf<String>()

    fun setList(list:ArrayList<String>){
        this.list =list
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ThirdFragmentAdapter.ViewHolder {
     return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ThirdFragmentAdapter.ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
       return list.size
    }

    class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(symbol: String) {
            binding.tvResult.text =symbol

        }


    }
}