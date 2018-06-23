package com.cgps.webviewlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class BtnWeb extends AppCompatActivity {
   private WebView web;
    Button start;
    Button sea;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn_web);
        web =(WebView)findViewById(R.id.WebView);
        web.setWebViewClient(new WebViewClient());
        WebSettings webSettings =web.getSettings();
        webSettings.setJavaScriptEnabled(true);
      start =(Button)findViewById(R.id.button4);
      start.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              edit =(EditText)findViewById(R.id.editText);
              String message = edit.getText().toString();
              web.loadUrl("http://"+message);

          }
      });
      sea =(Button)findViewById(R.id.button6);
      sea.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View view){
              Intent go=new Intent(BtnWeb.this, Search.class);
               startActivity(go);
          }
      });

    }
}
