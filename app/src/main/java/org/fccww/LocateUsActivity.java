package org.fccww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class LocateUsActivity extends AppCompatActivity {

    private static final String TAG = "LocateUsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_us);

        Button wwButton = findViewById(R.id.wwButton);
        Button fccButton = findViewById(R.id.fccButton);

        wwButton.setBackgroundResource(R.drawable.waterway);
        fccButton.setBackgroundResource(R.drawable.fcc);

        wwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked WaterWay Button");
                //toastMessage("Take Me to Church");
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=4074+AR-112, Bentonville, AR(Google+WaterWay");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        fccButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked FCC Button");
                //toastMessage("Take Me to Church");
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=807+SE+14th+St, Bentonville, AR(Google+First+Christian+Church");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }

    private void toastMessage(String message){
        Toast.makeText(LocateUsActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
