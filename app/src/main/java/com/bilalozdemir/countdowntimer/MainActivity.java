package com.bilalozdemir.countdowntimer;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnChangeActivity;
    private TextView tvClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerStart(1000);
    }

    public void timerStart(long timeLengthMilli) {
        //timer.cancel();
        CountDownTimer timer = new CountDownTimer(timeLengthMilli, 1000) {

            @Override
            public void onTick(long milliTillFinish) {
                long milliLeft = milliTillFinish;
                long min = (milliTillFinish / (1000 * 60));
                long sec = ((milliTillFinish / 1000) - min * 60);
                tvClock.setText(Long.toString(min) + ":" + Long.toString(sec));
            }

            @Override
            public void onFinish() {

            }
        }.start();

        Button btnChangeActivity = findViewById(R.id.btnChangeActivity);
        btnChangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}