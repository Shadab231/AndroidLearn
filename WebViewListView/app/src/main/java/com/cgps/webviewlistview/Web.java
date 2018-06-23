package com.cgps.webviewlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Web extends AppCompatActivity {
 private WebView wv;
 Button grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv = (WebView)findViewById(R.id.webView);
        WebSettings webSettings =wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        wv.loadUrl("http://customromq345.blogspot.in");

        wv.setWebViewClient(new WebViewClient());

        grid =(Button) findViewById(R.id.button);
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gr = new Intent(Web.this,Grid.class);
                startActivity(gr);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(wv.canGoBack()) {
            wv.goBack();
        }else{
            super.onBackPressed();
        }
    }


}
