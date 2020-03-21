package com.example.rotg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class acc_activity extends AppCompatActivity {
    public static int rp;
    TextView accPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc_activity);

        accPoints=findViewById(R.id.accPoints);

        rp=getIntent().getIntExtra("points",rp);

        accPoints.setText("Reward points = "+rp);
    }
}
