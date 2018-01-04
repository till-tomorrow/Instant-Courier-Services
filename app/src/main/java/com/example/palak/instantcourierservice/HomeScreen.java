package com.example.palak.instantcourierservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);

        Thread thread = new Thread(){
            public void run(){
                try {
                    Thread.sleep(3 * 1000);
                    Intent i = new Intent(HomeScreen.this, MainActivity.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                }
            }
        };
        thread.start();
    }
}
