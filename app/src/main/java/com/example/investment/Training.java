package com.example.investment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Training extends AppCompatActivity {

    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        webView = findViewById(R.id.webViewTraning);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);  // Разрешить использование хранилища DOM
        webSettings.setLoadWithOverviewMode(true);  // Загружать с обзорной шириной
        webSettings.setUseWideViewPort(true);  // Использовать широкий видовой порт
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.loadUrl("https://journal.tinkoff.ru/pro/invest/");
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed()
    {
        if(webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed();
    }
}