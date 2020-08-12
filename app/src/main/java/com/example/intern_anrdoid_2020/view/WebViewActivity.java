package com.example.intern_anrdoid_2020.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intern_anrdoid_2020.R;

public class WebViewActivity extends AppCompatActivity {

    private static final String ARGS_QIITA_URL = "url";

    public static Intent createIntent(Context context, String url) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra(ARGS_QIITA_URL, url);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        showWebView();
    }

    private void showWebView() {
        String url = getIntent().getStringExtra(ARGS_QIITA_URL);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl(url);
    }
}
