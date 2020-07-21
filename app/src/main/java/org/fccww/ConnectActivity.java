package org.fccww;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConnectActivity extends AppCompatActivity {

    private static final String TAG = "ConnectActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        Log.d(TAG, "onCreate: Started.");

        // =========================================
        // Button variables
        // =========================================
        Button facebookButton  = findViewById(R.id.facebookButton);
        Button instagramButton   = findViewById(R.id.instagramButton);
        Button contactUsButton = findViewById(R.id.contactUsButton);
        Button locateUsButton = findViewById(R.id.locateUsButton);

        // =========================================
        // Facebook Button Functionality
        // =========================================
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toastMessage("Clicked Facebook Button");
                //openActivity(FacebookActivity.class);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/FccBentonvilleWaterWay/"));
                startActivity(intent);
            }
        });

        // =========================================
        // Instagram Button Functionality
        // =========================================
        instagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toastMessage("Clicked Twitter Button");
                //openActivity(TwitterActivity.class);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fccbentonville_waterway/"));
                startActivity(intent);
            }
        });

        // =========================================
        // Contact Us Button Functionality
        // =========================================
        contactUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toastMessage("Clicked Contact Us Button");
                openActivity(ContactUsActivity.class);
            }
        });

        // =========================================
        // Locate Us Button Functionality
        // =========================================
        locateUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toastMessage("Clicked Locate Us Button");
                openActivity(LocateUsActivity.class);
            }
        });
    }

    private void toastMessage(String message){
        Toast.makeText(ConnectActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    public void openActivity(Class class_){
        Intent intent = new Intent(this, class_);
        startActivity(intent);
    }
}
