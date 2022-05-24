package com.example.quizapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quizapp.activities.MainActivity
import com.example.quizapp.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = FragmentSettingsBinding.inflate(layoutInflater)

        bind.tvQuiz.setOnClickListener {
            val intent = Intent(this@SettingsFragment.requireContext(), MainActivity::class.java)

            startActivity(intent)
        }

        return bind.root
    }

}