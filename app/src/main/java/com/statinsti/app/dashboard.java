package com.statinsti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class dashboard extends AppCompatActivity {
    private EditText course;
    private Button Ds,at;
    private String Ds_code,At_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_dashboard);
        Ds_code="AA9QIE";
        At_code="GTK1TL";
        Ds=findViewById(R.id.ds_b);
        at=findViewById(R.id.at_b);
        course=findViewById(R.id.cs_b);
        Ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec=course.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec, Ds_code)){
                    startActivity(new Intent(dashboard.this,Dashboard2.class));
                    finish();
                }
                else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec=course.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec, At_code)){
                    startActivity(new Intent(dashboard.this,algotrading_dash.class));
                    finish();
                }
                else {
                    showErrorDialog("You are not Authorized For this course");
                }

            }
        });
    }
    private void showErrorDialog(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Oops")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
