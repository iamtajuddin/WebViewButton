package com.salim.webviewwithbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ResourceBundle;

public class Browse extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://google.com/");

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String value = bundle.getString("social");
            socialData(value);
        }

    }

    void socialData(String value){

        if (value.equals("google")){
            webView.loadUrl("https://google.com/");
        }
        else if (value.equals("facebook")){
            webView.loadUrl("https://facebook.com/");
        }
        else if (value.equals("twitter")){
            webView.loadUrl("https://twitter.com/");
        }

    }
}
