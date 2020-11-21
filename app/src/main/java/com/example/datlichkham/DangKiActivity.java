package com.example.datlichkham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DangKiActivity extends AppCompatActivity {
    Button btnDangKi, btnHuyBo;
    EditText etID, etPassword, etRePassword, etEmail;
    Spinner spinnerLever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);
        btnDangKi = findViewById(R.id.dangKi_btnDangKi);
        btnHuyBo = findViewById(R.id.dangKi_btnHuyBo);
        etID = findViewById(R.id.dangKi_etID);
        etPassword = findViewById(R.id.dangKi_etPassword);
        etRePassword = findViewById(R.id.dangKi_etRePassword);
        etEmail = findViewById(R.id.dangKi_etEmail);
        spinnerLever = findViewById(R.id.dangKi_spinnerLever);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bệnh Nhân");
        arrayList.add("Bác Sĩ");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,                         android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLever.setAdapter(arrayAdapter);
        spinnerLever.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tutorialsName = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Đã Chọn: " + tutorialsName,          Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
    }
}