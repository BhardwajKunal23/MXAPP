package com.example.mxapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button about = findViewById(R.id.button1);
        Button music = findViewById(R.id.button2);
        Button gallery = findViewById(R.id.button3);

        about.setOnClickListener(view -> {
            Intent i  = new Intent(getApplicationContext(), About.class);
            startActivity(i);
        });

        music.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Music.class);
            startActivity(i);
        });

        gallery.setOnClickListener(view -> {
            Intent i  = new Intent(getApplicationContext(), Gallery.class);
            startActivity(i);

        });
    }
}