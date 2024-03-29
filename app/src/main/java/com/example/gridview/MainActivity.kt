package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val imageList = arrayListOf<Int>(
        R.drawable.ed,
        R.drawable.alan,
        R.drawable.charlie,
        R.drawable.egor,
        R.drawable.eminem,
        R.drawable.enqirue,
        R.drawable.justin,
        R.drawable.ed,
        R.drawable.alan,
        R.drawable.charlie,
        R.drawable.egor,
        R.drawable.eminem,
        R.drawable.enqirue,
        R.drawable.justin,
        R.drawable.ed,
        R.drawable.alan,
        R.drawable.charlie,
        R.drawable.egor,
        R.drawable.eminem,
        R.drawable.enqirue,
        R.drawable.justin,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapter = CustumAdapter(context = this, imageList)

        binding.gridview.adapter = adapter

        binding.gridview.setOnItemClickListener { _, _, position, _ ->
            Intent(this, FruitInActivity::class.java).apply {
                this.putExtra("position", position)
                startActivity(this)
            }
        }
    }
}