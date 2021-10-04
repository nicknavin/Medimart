package com.app.medimart.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.medimart.R
import com.app.medimart.data.model.PharmacyCategory

import com.app.medimart.databinding.ActivityProductCategoryBinding
import com.app.medimart.ui.main.view.adapter.PharmacyCategoryAdapter
import com.app.medimart.utils.GridSpacingItemDecoration

class ProductCategoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductCategoryBinding


    //    private lateinit var pharmacyCategory:PharmacyCategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarDefault.textTitle.text = "Shop By Category"
        binding.toolbarDefault.imgback.setOnClickListener { finish() }
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
      //  binding.recyclerview.layoutManager = GridLayoutManager(this, 2)
        //GridLayoutManager gridLayoutManager = new GridLayoutManager()
//        val spanCount = 2 // 3 columns
//        val spacing = 40 // 50px
//
//        val includeEdge = false
//        binding.recyclerview.addItemDecoration(
//            GridSpacingItemDecoration(
//                spanCount,
//                spacing,
//                includeEdge
//            )
//        )
        var list: MutableList<PharmacyCategory> = mutableListOf()
        val adapter = PharmacyCategoryAdapter(this, list)
        binding.recyclerview.adapter = adapter


    }
}