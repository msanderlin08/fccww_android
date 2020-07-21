package org.fccww;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


public class PodcastActivity extends AppCompatActivity{

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

        // Open FCC/WaterWay Events page
        webView = findViewById(R.id.podcastWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://fccww.org/sermons");
    }

    // If still on the app back
    // if not leave website
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}

