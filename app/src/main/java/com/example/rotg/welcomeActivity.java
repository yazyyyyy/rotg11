package com.example.rotg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class welcomeActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openqr();
            }
        });

        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openreward();
            }
        });

        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openloc();
            }
        });

        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openacc();
            }
        });

        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfb();
            }
        });

        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openabt();
            }
        });


    }
    public void openqr(){
        Intent qrintent=new Intent(getApplicationContext(),qr_activity.class);
        startActivity(qrintent);
    }

    public void openreward(){
        Intent rewardintent=new Intent(this,rewardshomepage.class);
        startActivity(rewardintent);
    }

    public void openloc(){
        Intent locintent=new Intent(this,loc_activity.class);
        startActivity(locintent);
    }

    public void openacc(){
        Intent accintent=new Intent(this,acc_activity.class);
        startActivity(accintent);
    }

    public void openfb(){
        Intent fbintent=new Intent(this,fb_activity.class);
        startActivity(fbintent);
    }

    public void openabt(){
        Intent abtintent=new Intent(this,abt_activity.class);
        startActivity(abtintent);
    }

}
