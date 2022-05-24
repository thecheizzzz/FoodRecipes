package com.example.quizapp.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.quizapp.R
import com.example.quizapp.data.Food


class FoodAdapter(private val context: Context,
                  private val foods:  List<Food>,
            //      val listener: (Food) -> Unit
): RecyclerView.Adapter<FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {

        return FoodViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_secret, parent, false )
        )
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {

        val food = foods[position]
       // holder.binView(foods[position])
     //   holder.url.setImageResource(food.url!!)
        holder.foodName.text = food.foodName

        Glide.with(context)
            .load(food.url)
            .into(holder.url)

    }

    override fun getItemCount() = foods.size

}

class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val url: ImageView = itemView.findViewById(R.id.imgPostImage)
    val foodName : TextView = itemView.findViewById(R.id.tvFoodName)

//    fun binView(img: Food, listener: (Food) -> Unit){
//        url.setImageResource(img.url!!)
//        foodName.text = img.foodName
//        itemView.setOnClickListener { listener(img) }
//    }


}
