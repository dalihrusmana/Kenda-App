package com.example.kendaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class launch_screen extends AppCompatActivity {
    private int waktu_loading=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_launch_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke onboarding atau screen home
                Intent onboarding=new Intent(launch_screen.this, WelcomeActivity.class);
                startActivity(onboarding);
                finish();
            }
        }, waktu_loading);
    }
}
