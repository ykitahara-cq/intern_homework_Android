package com.example.intern_anrdoid_2020.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.example.intern_anrdoid_2020.R

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        showWebView()
    }

    private fun showWebView() {
        val url = intent.getStringExtra(ARGS_QIITA_URL)
        val webView = findViewById<View>(R.id.webview) as WebView
        webView.loadUrl(url)
    }

    companion object {
        private const val ARGS_QIITA_URL = "url"
        fun createIntent(context: Context?, url: String?): Intent {
            val intent = Intent(context, WebViewActivity::class.java)
            intent.putExtra(ARGS_QIITA_URL, url)
            return intent
        }
    }
}
