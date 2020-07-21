package org.fccww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView fccwwBanner = findViewById(R.id.FCCWW_Banner);
        fccwwBanner.setText(R.string.fcc_waterway);

        Log.d(TAG, "onCreate: Started.");

        // =========================================
        // Button variables
        // =========================================
        Button connectButton  = findViewById(R.id.connectButton);
        Button givingButton   = findViewById(R.id.givingButton);
        Button outreachButton = findViewById(R.id.outreachButton);
        Button prayerButton   = findViewById(R.id.prayerButton);
        Button eventsButton   = findViewById(R.id.eventsButton);
        Button bibleButton    = findViewById(R.id.bibleButton);
        Button podcastButton  = findViewById(R.id.podcastButton);

        // =========================================
        // What to do with the Connect Button
        // =========================================
        connectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Connect Button");
                //toastMessage("Clicked Connect Button");
                openActivity(ConnectActivity.class);
            }
        });

        // =========================================
        // What to do with the Giving Button
        // =========================================
        givingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Giving Button");
                //toastMessage("Clicked Giving Button");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.givelify.com/givenow/1.0/MzA3ODI=/selection"));
                startActivity(intent);
            }
        });

        // =========================================
        // What to do with the Outreach Button
        // =========================================
        outreachButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Outreach Button");
                //toastMessage("Clicked Outreach Button");
                openActivity(OutreachActivity.class);
            }
        });

        // =========================================
        // What to do with the Prayer Requests Button
        // =========================================
        prayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Prayer Request Button");
                //toastMessage("Ain't nobody prayin' for me");
                openActivity(PrayerActivity.class);
            }
        });

        // =========================================
        // What to do with the Events Button
        // =========================================
        eventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Events Button");
                //toastMessage("Clicked Events Button");
                openActivity(ChurchEventActivity.class);
            }
        });

        // =========================================
        // What to do with the Bible Button
        // =========================================
        bibleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Bible Button");
                //toastMessage("Clicked Bible Button");
                openActivity(BibleActivity.class);
            }
        });

        // =========================================
        // What to do with the Podcast Button
        // =========================================
        podcastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked Podcast Button");
                //toastMessage("Clicked Podcast Button");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fccww.org/sermons"));
                startActivity(intent);
            }
        });

    }

    private void toastMessage(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    public void openActivity(Class class_){
        Intent intent = new Intent(this, class_);
        startActivity(intent);
    }
}
