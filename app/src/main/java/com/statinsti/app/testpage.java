package com.statinsti.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.lang.ref.Reference;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class testpage extends AppCompatActivity {
    private EditText cn, mn, sc, lt, br, sr, st, cv;
    private FirebaseFirestore db;
    private FirebaseAuth firebaseAuth;
    String uemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testpage);
        cn = findViewById(R.id.x1e);
        mn = findViewById(R.id.x2e);
        sc = findViewById(R.id.x3e);
        lt = findViewById(R.id.x4e);
        br = findViewById(R.id.x5e);
        sr = findViewById(R.id.x6e);
        st = findViewById(R.id.x7e);
        cv = findViewById(R.id.x8e);
        db = FirebaseFirestore.getInstance();
        Button sbt = findViewById(R.id.submit);
        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    showErrorDialog("Trade Details Submiited");
                    Toast.makeText(getApplicationContext(), "Trade Details Submitted!",
                            Toast.LENGTH_LONG).show();

                }
            }
        });

    }

    private void showErrorDialog(String message) {
        new AlertDialog.Builder(testpage.this)
                .setTitle("Successful")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String srr = sr.getText().toString().trim();
                        String stt = st.getText().toString().trim();

                        if (srr.isEmpty()){login();}
                        else {
                            calculate();
                        }

                    }
                })
                .setNegativeButton("Trade More", null)
                .create()
                .show();
    }

    private  void login(){
        String cnn = cn.getText().toString().trim();
        String mnn = mn.getText().toString().trim();
        String scc = sc.getText().toString().trim();
        String ltt = lt.getText().toString().trim();
        String brrr = br.getText().toString().trim();
        String srr = sr.getText().toString().trim();
        String stt = st.getText().toString().trim();
        String cvv = cv.getText().toString().trim();
        String tc=null;
        String pl=null;
        Map<String,Object> user = new HashMap<>();
        user.put("Chapter Name",cnn);
        user.put("Module Name",mnn);
        user.put("Script Name",scc);
        user.put("Buy Rate",brrr);
        user.put("Sell Rate",srr);
        user.put("Lot",ltt);
        user.put("Turnover Charges",tc);
        user.put("Profit/Loss",pl);
        user.put("Short",stt);
        user.put("Cover",cvv);
        String currentTime = String.valueOf(Calendar.getInstance().getTime());
        uemail = firebaseAuth.getInstance().getCurrentUser().getEmail();

        db.collection("Live Trading").document(uemail).collection(currentTime).document(uemail).set(user)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(testpage.this, "trade added",Toast.LENGTH_LONG).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(testpage.this, e.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
startActivity(new Intent(testpage.this,algotrading_dash.class));
finish();
    }

    private void calculate() {
        String cnn = cn.getText().toString().trim();
        String mnn = mn.getText().toString().trim();
        String scc = sc.getText().toString().trim();
        String ltt = lt.getText().toString().trim();
        String brr = br.getText().toString().trim();
        String srr = sr.getText().toString().trim();
        String stt = st.getText().toString().trim();
        String cvv = cv.getText().toString().trim();
        Double lot = Double.parseDouble(ltt);
        Double buy = Double.parseDouble(brr);
        Double sell = Double.parseDouble(srr);
        Double tccc=((buy+sell)*lot)*0.0002;
        Double pl_ls=((sell-buy)*lot)-tccc;
        String tc= String.valueOf(tccc);
        String pl= String.valueOf(pl_ls);
        Intent i = new Intent(testpage.this, result.class);
        i.putExtra("lot",ltt);
        i.putExtra("buy",brr);
        i.putExtra("sell",srr);
        i.putExtra("tc",tc);
        if (pl_ls>0){
//            String profit= pl_ls.toString();
            i.putExtra("profit",pl);}
        else {i.putExtra("profit",pl);}
        startActivity(i);
        finish();
        String currentTime = String.valueOf(Calendar.getInstance().getTime());
        uemail = firebaseAuth.getInstance().getCurrentUser().getEmail();

//        CollectionReference dbTrade = db.collection("Live Trading").document(uemail).collection(currentTime);
        Map<String,Object> user = new HashMap<>();
        user.put("Chapter Name",cnn);
        user.put("Module Name",mnn);
        user.put("Script Name",scc);
        user.put("Buy Rate",brr);
        user.put("Sell Rate",srr);
        user.put("Lot",ltt);
        user.put("Turnover Charges",tc);
        user.put("Profit/Loss",pl);
        user.put("Short",stt);
        user.put("Cover",cvv);

        db.collection("Live Trading").document(uemail).collection(currentTime).document(uemail).set(user)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(testpage.this, "trade added",Toast.LENGTH_LONG).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(testpage.this, e.getMessage(),Toast.LENGTH_LONG).show();

            }
        });

    }

    private boolean validate() {
        boolean valid = true;
        String cnn = cn.getText().toString().trim();
        String mnn = mn.getText().toString().trim();
        String scc = sc.getText().toString().trim();
        String ltt = lt.getText().toString().trim();
        String brr = br.getText().toString().trim();
        String srr = sr.getText().toString().trim();
        String stt = st.getText().toString().trim();
        String cvv = cv.getText().toString().trim();
        if (cnn.isEmpty()) {
            cn.setError("Chapter Name cant be empty");
            valid = false;
        }
        if (mnn.isEmpty()) {
            mn.setError("Not a Valid Module Name");
            valid = false;
        }
        if (scc.isEmpty()) {
            sc.setError("Script Name cant be empty");
            valid = false;
        }
        if (ltt.isEmpty()) {
            lt.setError("Lot cant be empty");
            valid = false;
        }
////        brr.isEmpty()||stt.isEmpty())
//        if (!(br.equals(""))){Toast.makeText(testpage.this, "All Values cant be Empty",Toast.LENGTH_LONG).show();
//        br.setError("Cant Be Empty");
//            sr.setError("Cant Be Empty");
//            st.setError("Cant Be Empty");
//            cv.setError("Cant Be Empty");
//
//            valid=false;}
//        if (brr!=null){
//            if (srr.isEmpty()){sr.setError("Rate cant be Empty"); valid=false;}else valid=true;
//        }
            return valid;
    }

}

    /*public void onClick(View String) {
        String ltt = lt.getText().toString().trim();
        String brr = br.getText().toString().trim();
        String srr = sr.getText().toString().trim();
        String tc= String.valueOf(tccc);
        String pl= String.valueOf(pl_ls);


    }*/
//        db.collection("Users").document(uemail).update(user);


//        db.collection(user).add()

//        db.collection(currentTime).
//
//        dbTrade.add(user).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//            @Override
//            public void onSuccess(DocumentReference documentReference) {
//            }
//        });
//        dbTrade.add(user).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//            }
//        });
//        dbTrade.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
//            @Override
//            public void onSuccess(Void aVoid) {
//
//            }
//        });
//        dbTrade.set(user).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//
//            }
//        });


//String email=uemail;

        /*Livetrade livetrade = new Livetrade(
                brr,
                srr,
                ltt,
                tc,
                pl,email);*/
        /*dbTrade.set(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(testpage.this, "trade added",Toast.LENGTH_LONG).show();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(testpage.this, e.getMessage(),Toast.LENGTH_LONG).show();

                    }
                });*/