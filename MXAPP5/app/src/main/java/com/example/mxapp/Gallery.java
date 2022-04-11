package com.example.mxapp;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Gallery extends AppCompatActivity {

    MediaPlayer Player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        new MediaPlayer();
        Player = MediaPlayer.create(Gallery.this, R.raw.song3);

        Player.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Player.stop();
    }
}