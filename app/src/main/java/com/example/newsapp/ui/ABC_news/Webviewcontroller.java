package com.example.newsapp.ui.ABC_news;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webviewcontroller extends WebViewClient {
    public boolean shouldOverrideUrlLoading(WebView view, String Url) {
        view.loadUrl(Url);
        return true;
    }
}
