package com.example.datlichkham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DangNhapActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private EditText edDangNhap, edPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        prefs = getSharedPreferences("PREFS", MODE_PRIVATE);
        //isFirstLogin = true thì show màn hình giới thiệu
        Boolean isFirstLogin = prefs.getBoolean("ISFIRST", true);
        if(isFirstLogin) {
            prefs.edit().putBoolean("ISFIRST", false).apply();
            startActivity(new Intent(DangNhapActivity.this, IntroActivity.class));
        }
        setupListener();
    }

    private void setupListener(){
        findViewById(R.id.dangNhap_ivPhone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhapActivity.this, DangKiActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.dangNhap_btnDangnhap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //whoIsLogin = true --> bac si dang nhap
                //whoIsLogin = false --> nguoi dung dang nhap
//                Boolean whoIsLogin = prefs.getBoolean("WHO", true);
//                if(whoIsLogin){}
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}