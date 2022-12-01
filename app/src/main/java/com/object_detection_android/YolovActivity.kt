package com.object_detection_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.object_detection_android.databinding.ActivityYolovBinding


class YolovActivity : AppCompatActivity() {

    lateinit var binding: ActivityYolovBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYolovBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onBackPressed() {
        startActivity(Intent(this@YolovActivity, MainActivity::class.java))
    }


}