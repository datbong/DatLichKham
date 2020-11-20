package com.example.datlichkham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhapActivity extends AppCompatActivity {
    Button btnDangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnDangky = findViewById(R.id.dangNhap_btnDangky);
        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhapActivity.this, DangKiActivity.class);
                startActivity(intent);
            }
        });
        SharedPreferences prefs = getSharedPreferences("PREFS", MODE_PRIVATE);
        Boolean isFirstLogin = prefs.getBoolean("ISFIRST", true);

        if(isFirstLogin)
        {
            prefs.edit().putBoolean("ISFIRST", false).apply();
            startActivity(new Intent(DangNhapActivity.this, IntroActivity.class));
        }
    }
}