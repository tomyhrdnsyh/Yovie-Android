package com.example.pritohelmet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        webView = findViewById(R.id.WebView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://pritohelmet.pythonanywhere.com/")

        // web settings
        val webSettings = webView.settings
        // enable javascript
        webSettings.javaScriptEnabled = true

        // enable other tools, such boostrap
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }
        else {
            super.onBackPressed()
        }

    }
}