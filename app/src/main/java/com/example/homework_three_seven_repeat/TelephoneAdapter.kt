package com.example.homework_three_seven_repeat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework_three_seven_repeat.databinding.ItemMacBinding

class TelephoneAdapter(
    val telephoneList: ArrayList<Telephone>
) : RecyclerView.Adapter<TelephoneAdapter.TelephoneViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelephoneViewHolder {
        return TelephoneViewHolder(
            ItemMacBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: TelephoneViewHolder, position: Int) {
        holder.onBund(telephoneList[position])
    }

    override fun getItemCount(): Int {
        return telephoneList.size
    }

    inner class TelephoneViewHolder(private val binding: ItemMacBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBund(telephone: Telephone) {
            binding.TextViewModel.text = telephone.model
            binding.TextViewOptions.text = telephone.optoins
            binding.TextViewDescription.text = telephone.description
            Glide.with(binding.ImageViewIcon).load(telephone.imageIcon).into(binding.ImageViewIcon)
        }
    }
}
