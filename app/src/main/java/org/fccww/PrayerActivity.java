package org.fccww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrayerActivity extends AppCompatActivity {

    private EditText mEditTextSubject;
    private EditText mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

        // EditText messages to hold the subject and messages
        mEditTextSubject = findViewById(R.id.edit_subject);
        mEditTextMessage = findViewById(R.id.edit_message);

        // Send button functionality
        Button buttonSend = findViewById(R.id.sendButton);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();
            }
        });
    }

    // To Do: figure out a way to send these messages anonymously
    // without an email address
    private void sendMail() {

        // Church email to send to
        String[] recipient = {"shar@fccww.org"};

        // Turn EditText into a String
        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        // Set up email functionality
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipient);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        // Open email client
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}
