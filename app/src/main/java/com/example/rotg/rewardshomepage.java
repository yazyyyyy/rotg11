package com.example.rotg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rewardshomepage extends AppCompatActivity {
    private Button rewards1;
    private Button rewards2;
    private Button rewards3;
    private Button rewards4;
    private Button rewards5;
    private Button rewards6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewardshomepage);
        rewards1=findViewById(R.id.rewards1);
        rewards1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbottles();
            }
        });
        rewards2=findViewById(R.id.rewards2);
        rewards2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencashback();
            }
        });
        rewards3=findViewById(R.id.rewards3);
        rewards3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openphone();
            }
        });
        rewards4=findViewById(R.id.rewards4);
        rewards4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmovie();
            }
        });
        rewards5=findViewById(R.id.rewards5);
        rewards5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwatch();
            }
        });
        rewards6=findViewById(R.id.rewards6);
        rewards6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openearp();
            }
        });
    }
    public void openbottles()
    {
        Intent bottle1intent=new Intent(this,reward_activity.class);
        startActivity(bottle1intent);

    }
    public void opencashback()
    {
        Intent cashintent=new Intent(this,cashback.class);
        startActivity(cashintent);
    }
    public void openphone()
    {
        Intent phoneintent=new Intent(this,smartphones.class);
        startActivity(phoneintent);
    }
    public void openmovie()
    {
        Intent movieintent=new Intent(this,movie.class);
        startActivity(movieintent);
    }
    public void openwatch()
    {
        Intent watchintent=new Intent(this,watches.class);
        startActivity(watchintent);
    }
    public void openearp()
    {
        Intent earintent=new Intent(this,earphones.class);
        startActivity(earintent);
    }




}
