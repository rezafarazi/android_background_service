package com.sorapp.background_test_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(getApplicationContext(),background_run_service.class));
    }


    public void Stop(View v)
    {
        stopService(new Intent(getApplicationContext(),background_run_service.class));
    }


}