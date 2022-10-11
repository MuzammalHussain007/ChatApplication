package com.example.chatapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatapplication.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}