package com.object_detection_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.object_detection_android.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {


    lateinit var binding: ActivityAboutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onBackPressed() {
        startActivity(Intent(this@AboutActivity, MainActivity::class.java))
    }


}