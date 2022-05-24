package com.example.quizapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.quizapp.R
import com.example.quizapp.data.Food
import com.example.quizapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickBack()

     //   val food = intent.getParcelableExtra<Food>(PostActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id.imgDetail)
        val imgTitle = findViewById<TextView>(R.id.tvInstagramDetail)
        val imgDesc = findViewById<TextView>(R.id.tvTwitterDetail)

       // imgSrc.setImageResource(food?.url!!)
//        imgTitle.text = food.foodName
//        imgDesc.text = food.Description

    }
    private fun clickBack(){
        binding.imgBack.setOnClickListener {
            finish()
        }

    }
}