package org.fccww;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BibleActivity extends AppCompatActivity {

    // WebView variables
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);

        // Open Bible.com
        webView = findViewById(R.id.bibleWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://biblewebapp.com/study/?w1=bible&t1=local%3AENGESV&v1=GN1_3");
    }

    @Override
    public void onBackPressed(){
        // If still on the app back
        if(webView.canGoBack()){
            webView.goBack();
        }
        // if not leave website
        else{
            super.onBackPressed();
        }
    }
}
