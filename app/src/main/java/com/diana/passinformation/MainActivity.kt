package com.diana.passinformation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.diana.passinformation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editTextName.addTextChangedListener {
            name = it.toString()
        }
        binding.fab.setOnClickListener {
            val test = name
            if (test.isNotEmpty()) {
                val intent = Intent(this, LetterActivity::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
            } else {
                Toast.makeText(this, "No hay nombre", Toast.LENGTH_SHORT).show()
            }

        }
    }
}