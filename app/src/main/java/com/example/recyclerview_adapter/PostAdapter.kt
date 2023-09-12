package com.example.recyclerview_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_adapter.databinding.PostItemBinding

class InstagramPostAdapter : RecyclerView.Adapter<PostViewHolder>() {

    private val postList = arrayListOf<PostModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val context = parent.context
        val layoutInflater = LayoutInflater.from(context)
        val binding = PostItemBinding.inflate(layoutInflater)
        return PostViewHolder(binding)
    }


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentData = postList.get(position)
        holder.bind(currentData)
    }

    override fun getItemCount(): Int {
        return postList.count()
    }

    fun addNewItem(PostModel: PostModel){
        postList.add(PostModel)
        notifyDataSetChanged()
    }


}


class PostViewHolder(private val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(PostModel: PostModel){
        binding.onePieceImage.setImageResource(PostModel.image)
        binding.onePieceText.text = PostModel.description
    }
}
