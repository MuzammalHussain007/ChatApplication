package com.example.chatapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatapplication.R

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}