package com.example.rotg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class qr_activity extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    int MY_PERMISSIONS_REQUEST_CAMERA=0;

    ZXingScannerView Scannerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Scannerview= new ZXingScannerView(this);
        setContentView(Scannerview);
    }

    @Override
    public void handleResult(Result result) {
        String qrtext=result.getText();//string to accept qr code
        if(qrtext.equals("rctPqlm1x7GamWGhRAg+QrnfmuPVa5Jnqyh3G2b3XOc="))
        {
            acc_activity.rp=acc_activity.rp+50;
            Toast.makeText(qr_activity.this,"50 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("pULFw7o4/pW3aIjE/3KOR/d8bpVzFWelxrH7oT9lYO8="))
        {
            acc_activity.rp=acc_activity.rp+100;
            Toast.makeText(qr_activity.this,"100 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("+Fz7aM9M2u9xqIENqyBH8uHEuF3hB73fZs8EltPbnUI="))
        {
            acc_activity.rp=acc_activity.rp+150;
            Toast.makeText(qr_activity.this,"150 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("ieWyA6ND5Vs9q1koUuRDmum0NM+SxdV4ozUTvkzA3WE="))
        {
            acc_activity.rp=acc_activity.rp+200;
            Toast.makeText(qr_activity.this,"200 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("Ga/8mzhJnNA4ONk/j225Ksii2w8lrxXroW0u5lxYt7w="))
        {
            acc_activity.rp=acc_activity.rp+250;
            Toast.makeText(qr_activity.this,"250 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("qvQmeM026ReEHtC3Ckj1/Mi+jn4lVvazkxZVoaH8YMM="))
        {
            acc_activity.rp=acc_activity.rp+300;
            Toast.makeText(qr_activity.this,"300 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("y+FL6DdRfSlslZlGqzVb7Qe/Lkib241l7+Qa5PCtRAs="))
        {
            acc_activity.rp=acc_activity.rp+350;
            Toast.makeText(qr_activity.this,"350 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("+p15WUwFmvSYQFNum8r0a32gu/GP9psWjByWoZNcM5U="))
        {
            acc_activity.rp=acc_activity.rp+400;
            Toast.makeText(qr_activity.this,"400 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("PUHwXt6bdAmkMrGnbPHrWDQQsgfualous6kYsN382CQ="))
        {
            acc_activity.rp=acc_activity.rp+450;
            Toast.makeText(qr_activity.this,"450 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else if(qrtext.equals("Fq6MtMvgtroOP4COS1q4k6byJGz7xD253AWZZvWxUtM="))
        {
            acc_activity.rp=acc_activity.rp+500;
            Toast.makeText(qr_activity.this,"500 reward points added",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        else
        {
            Toast.makeText(qr_activity.this,"INVALID_ERROR",Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
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

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, MY_PERMISSIONS_REQUEST_CAMERA);
        }
        Scannerview.setResultHandler(this);
        Scannerview.startCamera();
    }

}
