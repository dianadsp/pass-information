package com.diana.passinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diana.passinformation.databinding.ActivityLetterBinding
import com.diana.passinformation.databinding.ActivityMainBinding

class LetterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLetterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLetterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.name.text = name

    }
}