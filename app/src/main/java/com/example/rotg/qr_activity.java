package com.example.rotg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class qr_activity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    ZXingScannerView Scannerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Scannerview= new ZXingScannerView(this);
        setContentView(Scannerview);
    }

    @Override
    public void handleResult(Result result) {
        reward_activity.resultTextView.setText(result.getText());
        Intent rewardintent=new Intent(this,reward_activity.class);
        startActivity(rewardintent);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Scannerview.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Scannerview.setResultHandler(this);
        Scannerview.startCamera();
    }
}
