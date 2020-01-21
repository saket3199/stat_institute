package com.statinsti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

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
    }
}
