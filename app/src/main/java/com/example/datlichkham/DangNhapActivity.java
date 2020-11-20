package com.example.datlichkham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DangNhapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        Boolean isFirstLogin = true;
        if(isFirstLogin)
        {
            startActivity(new Intent(DangNhapActivity.this, IntroActivity.class));
        }
    }
}