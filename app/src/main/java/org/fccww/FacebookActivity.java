package org.fccww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookActivity extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        // Open FCC/WaterWay Facebook page
        // Find out how to open in app
        // If no app is present then open in browser
        webView = findViewById(R.id.facebookWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/FccBentonvilleWaterWay/");
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
