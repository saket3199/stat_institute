package com.statinsti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
TextView tx10,tx11,tx12,tx13,tx14;
Button sbmt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tx10=findViewById(R.id.textView10);
        tx11=findViewById(R.id.textView11);
        tx12=findViewById(R.id.textView12);
        tx13=findViewById(R.id.textView13);
        tx14=findViewById(R.id.textView14);
        Intent intent = getIntent();
        String buy = intent.getStringExtra("buy");
        String lot = intent.getStringExtra("lot");
        String sell = intent.getStringExtra("sell");
        String profit = intent.getStringExtra("profit");
        String tc = intent.getStringExtra("tc");
        tx10.setText(buy);
        tx11.setText(sell);
        tx12.setText(lot);
        tx13.setText(tc);
        tx14.setText(profit);
        sbmt=findViewById(R.id.courses);
        sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(result.this,algotrading_dash.class));
                finish();
            }
        });
    }

}
