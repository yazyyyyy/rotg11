package com.example.rotg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class reward_activity extends AppCompatActivity {
    public static TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_activity);

        resultTextView=(TextView)findViewById(R.id.result_text);
    }
}
