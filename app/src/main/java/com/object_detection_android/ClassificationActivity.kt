package com.object_detection_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ClassificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classification)
    }

    override fun onBackPressed() {
        startActivity(Intent(this@ClassificationActivity, MainActivity::class.java))
    }

}