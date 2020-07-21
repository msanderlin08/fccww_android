package org.fccww;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ChurchEventActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church_event);

        // Open FCC/WaterWay Events page
        webView = (WebView) findViewById(R.id.eventsWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://fccww.org/new-events");
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
