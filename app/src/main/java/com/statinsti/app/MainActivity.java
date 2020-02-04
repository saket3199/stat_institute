package com.statinsti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Handler  handler;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth =FirebaseAuth.getInstance();
        handler=new Handler();
        handler.postDelayed(new  Runnable() {
            @Override
            public void run() {
                FirebaseUser user= mAuth.getCurrentUser();
                if (user!= null){
                startActivity(new Intent(MainActivity.this,dashboard.class));
                finish();
            }
                else {
                    startActivity(new Intent(MainActivity.this,Login.class));
                    finish();
                }
            }
        },2000);

    AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

    Intent notificationIntent = new Intent(this, notifications2.class);
    PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

    Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND, 5);
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), broadcast);
}
}
