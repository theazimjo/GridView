package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.gridview.databinding.ActivityFruitInBinding

class FruitInActivity : AppCompatActivity() {

    private val imageList = arrayListOf<Int>(
        R.drawable.ed,
        R.drawable.alan,
        R.drawable.charlie,
        R.drawable.egor,
        R.drawable.eminem,
        R.drawable.enqirue,
        R.drawable.justin,

        )

    private lateinit var binding: ActivityFruitInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val position = intent.getIntExtra("position", 0)

        when (position) {
            0 -> binding.imageView2.setImageResource(R.drawable.ed)
            1 -> binding.imageView2.setImageResource(R.drawable.alan)
            2 -> binding.imageView2.setImageResource(R.drawable.charlie)
            3 -> binding.imageView2.setImageResource(R.drawable.egor)
            4 -> binding.imageView2.setImageResource(R.drawable.eminem)
            5 -> binding.imageView2.setImageResource(R.drawable.enqirue)
            6 -> binding.imageView2.setImageResource(R.drawable.justin)
            0 -> binding.imageView2.setImageResource(R.drawable.ed)
            7 -> binding.imageView2.setImageResource(R.drawable.alan)
            8 -> binding.imageView2.setImageResource(R.drawable.charlie)
            9 -> binding.imageView2.setImageResource(R.drawable.egor)
            10 -> binding.imageView2.setImageResource(R.drawable.eminem)
            11 -> binding.imageView2.setImageResource(R.drawable.enqirue)
            12 -> binding.imageView2.setImageResource(R.drawable.justin)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}