package com.statinsti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class c2l2 extends AppCompatActivity {
    ImageButton ll7,ll8,ll9,ll10,ll11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2l2);
        ll7 = findViewById(R.id.l2p1);
        ll8 = findViewById(R.id.l2p2);
        ll9 = findViewById(R.id.l2p3);
        ll10 = findViewById(R.id.l2p4);
        ll11= findViewById(R.id.l2p5);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        ll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(c2l2.this,l2p6.class));
            }
        });

        ll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(c2l2.this,l2p7.class));
            }
        });
    }
}
