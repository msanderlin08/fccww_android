package org.fccww;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OutreachActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outreach);

        // Open FCC and WaterWay Outreach page
        webView = (WebView) findViewById(R.id.outreachWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://fccww.org/outreach");
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
