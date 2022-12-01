package com.object_detection_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YolovActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yolov)
    }


    override fun onBackPressed() {
        startActivity(Intent(this@YolovActivity, MainActivity::class.java))
    }


}