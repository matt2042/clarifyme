package io.clarifyme.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FactsheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factsheet);
    }

    public void goToMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);

        Bundle b = new Bundle();
        b.putBoolean("active", true);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

}
