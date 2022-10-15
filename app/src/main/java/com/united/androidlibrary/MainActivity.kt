package com.united.androidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.united.image_preview.ImagePreview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preview = ImagePreview()
    }
}