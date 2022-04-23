package com.sorapp.background_test_service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class background_run_service extends Service
{

    public background_run_service()
    {

    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Log.i("Errt","Salam");
        return startId;
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }

}