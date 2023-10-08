package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.gridview.databinding.ImageLayoutBinding

class CustumAdapter(context: Context, val imagelist: ArrayList<Int>) :
    ArrayAdapter<Int>(context, R.layout.image_layout, imagelist) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: ImageLayoutBinding = if (convertView == null) {
            ImageLayoutBinding.inflate(LayoutInflater.from(context), parent, false)
        } else {
            ImageLayoutBinding.bind(convertView)
        }

        binding.imageView.setImageResource(imagelist[position])

        return binding.root
    }
}