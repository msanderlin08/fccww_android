package org.fccww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class GivingActivity extends AppCompatActivity {



    // Find out Givelify information from Mom or Shar
    // Take information from Givelify Developer page
    // to better integrate this functionality
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giving);

        // Create a textview to embed the deep link
        TextView deepLink = (TextView) findViewById(R.id.givingWebView);
        String linkText = "Launch the Givelify app.";

        //Update the textview with your organization's deep link
        deepLink.setText(Html.fromHtml(linkText));

        //Allow for the link to be clicked
        deepLink.setMovementMethod(LinkMovementMethod.getInstance());

    }
}