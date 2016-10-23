package com.example.frankie.frankietimer;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.Image;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton buttonStart;
    ImageButton buttonStop;
    ImageButton buttonReset;
    Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buttonStart = (ImageButton) findViewById((R.id.buttonStart));
        ImageButton buttonStop = (ImageButton) findViewById((R.id.buttonStop));
        ImageButton buttonReset = (ImageButton) findViewById((R.id.buttonReset));
        chronometer = (Chronometer) findViewById(R.id.chronometerDisplay);

        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                chronometer.start();

            }
        });
        buttonStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chronometer.stop();
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chronometer.setBase(SystemClock.elapsedRealtime());
            }
        });


    }






}
