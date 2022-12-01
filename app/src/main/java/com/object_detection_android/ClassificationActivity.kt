package com.object_detection_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.object_detection_android.databinding.ActivityClassificationBinding


class ClassificationActivity : AppCompatActivity() {


    lateinit var binding: ActivityClassificationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClassificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onBackPressed() {
        startActivity(Intent(this@ClassificationActivity, MainActivity::class.java))
    }

}