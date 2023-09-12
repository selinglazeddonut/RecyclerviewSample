package com.example.recyclerview_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_adapter.databinding.PostItemBinding


class TestAdapter(private val items: MutableList<PostModel>) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    class TestViewHolder(private val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: PostModel) {
            binding.onePieceImage.setImageResource(item.image)
            binding.onePieceText.text = item.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val binding = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TestViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun addItem(item: PostModel) {
        items.add(item)
        notifyItemInserted(items.size - 1)
    }
}



// veri istiyor
// ui istiyor
// etkileşim
// yönet