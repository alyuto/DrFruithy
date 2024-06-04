package com.dicoding.drfruithy.ui.detect

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dicoding.drfruithy.R
import com.dicoding.drfruithy.databinding.ActivityDetectBinding

class DetectActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetectBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setSupportActionBar(binding.toolbar)

        supportActionBar?.title = "Detect Plaint"
    }
}