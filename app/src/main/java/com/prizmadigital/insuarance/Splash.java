package com.prizmadigital.insuarance;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {


    Handler handler;
    int animationDuration = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler = new Handler();
        startRequiredActivity();
    }

    private void startRequiredActivity() {

        handler.postDelayed(startRunnableActivity, 3000);
    }

    Runnable startRunnableActivity = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(Splash.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    };
}
