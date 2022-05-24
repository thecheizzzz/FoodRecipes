package com.example.quizapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.quizapp.adapter.FoodAdapter
import com.example.quizapp.data.Food
import com.example.quizapp.databinding.ActivityPostBinding
import com.google.firebase.firestore.FirebaseFirestore

class PostActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPostBinding
    private lateinit var recycle: RecyclerView
    private lateinit var postList: ArrayList<Food>
    private lateinit var postAdapter: FoodAdapter
 //   private lateinit var dbref: DatabaseReference

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recycle = binding.rvPost
            recycle.layoutManager = StaggeredGridLayoutManager(1, RecyclerView.VERTICAL)

        recycle.setHasFixedSize(true)

        postList = arrayListOf()


        getData()

        clickBack()

    }

    private fun getData() {

        FirebaseFirestore.getInstance().collection("food")
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents){

                        val foodrp = documents.toObjects(Food::class.java)
                    binding.rvPost.adapter = FoodAdapter(this, foodrp)

                }

            }.addOnFailureListener {
                Toast.makeText(this, " ${it.message}", Toast.LENGTH_SHORT).show()
            }

    }
    private fun clickBack(){
        binding.imgSignOut.setOnClickListener {
            finish()
        }
    }
}