package com.statinsti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Objects;

public class algotrading_dash extends AppCompatActivity {
    private ImageButton ig1, ig2, ig3, ig4, ig5, ig6, ig7, ig8, ig9, ig10, ig11, ig12, ig13, ig14, ig15, ig16, ig17, ig18,livet;
    private EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10, ed11, ed12, ed13, ed14, ed15, ed16, ed17, ed18;
    private String e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algotrading_dash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        e1="WTAWDJ";
        e2="AFWLQI";
        e3="4LIMS1";
        e4="I3NYCL";
        e5="CDB6GM";
        e6="W0F1RL";
        e7="ZJO1NK";
        e8="D6LGQV";
        e9="3STP61";
        e10="SOF4CU";
        e11="L0FLVN";
        e12="DV4LAE";
        e13="GBEW2C";
        e14="7KOOWZ";
        e15="8NKVKG";
        e16="4JFOWF";
        e17="X9OG69";
        e18="KX9TU1";
        ig1 = findViewById(R.id.ig1);
        ig2 = findViewById(R.id.ig2);
        ig3 = findViewById(R.id.ig3);
        ig4 = findViewById(R.id.ig4);
        ig5 = findViewById(R.id.ig5);
        ig6 = findViewById(R.id.ig6);
        ig7 = findViewById(R.id.ig7);
        ig8 = findViewById(R.id.ig8);
        ig9 = findViewById(R.id.ig9);
        ig10 = findViewById(R.id.ig10);
        ig11 = findViewById(R.id.ig11);
        ig12 = findViewById(R.id.ig12);
        ig13 = findViewById(R.id.ig13);
        ig14 = findViewById(R.id.ig14);
        ig15 = findViewById(R.id.ig15);
        ig16 = findViewById(R.id.ig16);
        ig17 = findViewById(R.id.ig17);
        ig18 = findViewById(R.id.ig18);
        livet = findViewById(R.id.lt);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        ed6 = findViewById(R.id.ed6);
        ed7 = findViewById(R.id.ed7);
        ed8 = findViewById(R.id.ed8);
        ed9 = findViewById(R.id.ed9);
        ed10 = findViewById(R.id.ed10);
        ed11 = findViewById(R.id.ed11);
        ed12 = findViewById(R.id.ed12);
        ed13 = findViewById(R.id.ed13);
        ed14 = findViewById(R.id.ed14);
        ed15 = findViewById(R.id.ed15);
        ed16 = findViewById(R.id.ed16);
        ed17 = findViewById(R.id.ed17);
        ed18 = findViewById(R.id.ed18);
        ig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed1.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec,e1 )) {
                    startActivity(new Intent(algotrading_dash.this, ac1.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed2.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e2)) {
                    startActivity(new Intent(algotrading_dash.this, ac2.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed3.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e3)) {
                    startActivity(new Intent(algotrading_dash.this, ac3.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed4.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e4)) {
                    startActivity(new Intent(algotrading_dash.this, ac4.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed5.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e5)) {
                    startActivity(new Intent(algotrading_dash.this, ac5.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed6.getText().toString().trim();

                if (Objects.equals(Ec, e6)) {
                    startActivity(new Intent(algotrading_dash.this, ac6.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed7.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e7)) {
                    startActivity(new Intent(algotrading_dash.this, ac7.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed8.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e8)) {
                    startActivity(new Intent(algotrading_dash.this, ac8.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed9.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e9)) {
                    startActivity(new Intent(algotrading_dash.this, ac9.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed10.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e10)) {
                    startActivity(new Intent(algotrading_dash.this, ac10.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed11.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e11)) {
                    startActivity(new Intent(algotrading_dash.this, ac11.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed12.getText().toString().toUpperCase().trim();

                if (Objects.equals(Ec, e12)) {
                    startActivity(new Intent(algotrading_dash.this, ac12.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed13.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec,e13)) {
                    startActivity(new Intent(algotrading_dash.this, ac13.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed14.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec, e14)) {
                    startActivity(new Intent(algotrading_dash.this, ac14.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed15.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec, e15)) {
                    startActivity(new Intent(algotrading_dash.this, ac15.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed16.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec,e16)) {
                    startActivity(new Intent(algotrading_dash.this, ac16.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed17.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec, e17)) {
                    startActivity(new Intent(algotrading_dash.this, ac17.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }
            }
        });
        ig18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ec = ed18.getText().toString().toUpperCase().trim();
                if (Objects.equals(Ec, e18)) {
                    startActivity(new Intent(algotrading_dash.this, ac18.class));
                    finish();
                } else {
                    showErrorDialog("You are not Authorized For this course");
                }

            }
        });
        livet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.statinsti.com/ ")));
                startActivity(new Intent(algotrading_dash.this, testpage.class));
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

