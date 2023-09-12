package com.example.recyclerview_adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_adapter.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(LayoutInflater.from(this)) }
    private val adapter = TestAdapter(mutableListOf()) // Boş bir MutableList ile başlatıldı.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        addData()  // Veri eklemek için çağrı
    }

    private fun addData() {
        val onePiece = PostModel(image = R.drawable.one_piece, description = "One Piece")
        adapter.addItem(onePiece)
        binding.addPostbutton.setOnClickListener {
            addData()
        }
    }
}




// her bir item view xml çiz (view holder class)
// her bir item için veri classı
// liste için container (RecyclerView)
// managment için bir adapter class : --> view için bir class ve diğer fonksiyonlar
// recyclerview genel özelliklerin set edilmesi
//______________________________________
// Resim
// Açıklama
// Dikey
// *** Yenileme