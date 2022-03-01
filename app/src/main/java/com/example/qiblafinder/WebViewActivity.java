package com.example.qiblafinder;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    WebView myWebView = (WebView) findViewById(R.id.webview);
    WebSettings webSettings = myWebView.getSettings();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://qiblafinder.withgoogle.com/");

    }
}