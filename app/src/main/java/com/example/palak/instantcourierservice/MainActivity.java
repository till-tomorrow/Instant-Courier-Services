package com.example.palak.instantcourierservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){
            public void run(){
                try {
                    Thread.sleep(3 * 1000);
                    Intent i = new Intent(MainActivity.this, HomeScreen.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                }
            }
        };
        thread.start();

    }
}
