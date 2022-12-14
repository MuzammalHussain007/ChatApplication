package com.example.chatapplication.util

import android.app.Activity
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Build
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

fun Activity.snackbar(message: String) =
    Snackbar.make(this.window.decorView.findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG).show()



fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.INVISIBLE
}

fun Activity.isConnected(): Boolean {
    var status = false
    val conManager = getSystemService(AppCompatActivity.CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        if (conManager?.activeNetwork != null && conManager.getNetworkCapabilities(
                conManager.activeNetwork
            ) != null
        ) {
            status = true
        }
    } else {
        if (conManager.activeNetwork != null) {
            status = true
        }
    }
    return status
}

