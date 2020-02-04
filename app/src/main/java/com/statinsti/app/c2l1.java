package com.statinsti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class c2l1 extends AppCompatActivity {
    ImageButton ll2,ll3,ll4,ll5,ll6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2l1);
        ll2 = findViewById(R.id.l1p1);
        ll3 = findViewById(R.id.l1p2);
        ll4 = findViewById(R.id.l1p3);
        ll5 = findViewById(R.id.l1p4);
        ll6 = findViewById(R.id.l1p5);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(c2l1.this,l1p1.class));
            }
        });

        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(c2l1.this,l1p2.class));
            }
        });

        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(c2l1.this,l1p3.class));
            }
        });

        ll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(c2l1.this,l1p4.class));
            }
        });

        ll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(c2l1.this,l1p5.class));
            }
        });
    }
}
