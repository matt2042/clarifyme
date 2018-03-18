package io.clarifyme.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    protected WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (WebView) findViewById(R.id.clarifyMeWebView);
        view.getSettings().setJavaScriptEnabled(true);

        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://clarifyme-s01.herokuapp.com");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        if (intent != null)
            setIntent(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        boolean active = intent.getBooleanExtra("active", false);

        if (active) {
            view.loadUrl("https://clarifyme-s01.herokuapp.com/index-active.html#no-benefits");
        } else {
            view.loadUrl("https://clarifyme-s01.herokuapp.com/index.html");
        }
    }

    public void openFactsheet(View v) {
        Intent intent = new Intent(this, FactsheetActivity.class);
        startActivity(intent);
    }
}
