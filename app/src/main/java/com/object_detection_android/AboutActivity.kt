package com.object_detection_android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.object_detection_android.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {


    lateinit var binding: ActivityAboutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clicking()
    }


    fun clicking() {

        binding.github.setOnClickListener(View.OnClickListener {
            val url = "https://github.com/mehdisahraeei/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        binding.instagram.setOnClickListener(View.OnClickListener {
            val url = "https://www.instagram.com/_mehdi_sahraei/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

        binding.kaggle.setOnClickListener(View.OnClickListener {
            val url = "https://www.kaggle.com/datasets/mehdisahraei/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

    }

    override fun onBackPressed() {
        startActivity(Intent(this@AboutActivity, MainActivity::class.java))
    }


}