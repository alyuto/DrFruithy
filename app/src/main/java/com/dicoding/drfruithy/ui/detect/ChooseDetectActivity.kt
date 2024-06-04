package com.dicoding.drfruithy.ui.detect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.drfruithy.databinding.ActivityChooseDetectBinding

class ChooseDetectActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChooseDetectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseDetectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.title = "Choose Detection"

        binding.apply {
            apple.setOnClickListener{ intentApple()}
            manggo.setOnClickListener{ intentManggo()}
            tomato.setOnClickListener{ intentTomato()}
            backButton.setOnClickListener { onBackPressedDispatcher.onBackPressed()}
        }
    }

    private fun intentTomato() {
        val intentTomato = Intent(this, DetectActivity::class.java)
        startActivity(intentTomato)

    }

    private fun intentManggo() {
        val intentManggo = Intent(this, DetectActivity::class.java)
        startActivity(intentManggo)
    }

    private fun intentApple() {
        val intentApple = Intent(this, DetectActivity::class.java)
        startActivity(intentApple)
    }
}