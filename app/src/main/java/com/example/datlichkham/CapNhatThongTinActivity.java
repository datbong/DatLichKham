package com.example.datlichkham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CapNhatThongTinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_nhat_thong_tin);
        getSupportActionBar().setTitle("Cập nhật thông tin");
    }
}