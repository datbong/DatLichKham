package com.example.datlichkham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.datlichkham.model.Doctor;
import com.example.datlichkham.model.Users;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class DangKiActivity extends AppCompatActivity {
    private FirebaseDatabase database;
    DatabaseReference ref;
    Button btnDangKi, btnHuyBo;
    EditText etUserName, etPassword, etRePassword, etEmail;
    Spinner spinnerLever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);

        mappingView();
        setupSpinner();
        dangKi();
    }

    private void dangKi() {
        btnDangKi.setOnClickListener(v -> {
            String userName = etUserName.getText().toString().trim();
            String pass = etUserName.getText().toString().trim();
            String rePass = etUserName.getText().toString().trim();
            String email = etUserName.getText().toString().trim();
            String level = spinnerLever.getSelectedItem().toString();

            Users user = new Users();
            user.setUserName(userName);
            user.setPassword(pass);
            user.setEmail(email);
            user.setLevel(level);
            user.setAge("");
            user.setBirthday("");
            user.setPhone("");
            user.setFullName("");

            database = FirebaseDatabase.getInstance();
            ref = database.getReference("users");
            ref.child(userName).setValue(user);

//            if(level.equals("Bệnh Nhân")){
//
//            } else {
//                Doctor doctor = new Doctor();
//                doctor.setUserName(userName);
//                doctor.setPassword(pass);
//                doctor.setEmail(email);
//                doctor.setFullName("");
//
//                database = FirebaseDatabase.getInstance();
//                ref = database.getReference("doctors");
//                ref.child(userName).setValue(doctor);
//            }
        });
    }

    private void setupSpinner() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bệnh Nhân");
        arrayList.add("Bác Sĩ");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLever.setAdapter(arrayAdapter);
    }

    private void mappingView() {
        btnDangKi = findViewById(R.id.dangKi_btnDangKi);
        btnHuyBo = findViewById(R.id.dangKi_btnHuyBo);
        etUserName = findViewById(R.id.dangKi_edUserName);
        etPassword = findViewById(R.id.dangKi_etPassword);
        etRePassword = findViewById(R.id.dangKi_etRePassword);
        etEmail = findViewById(R.id.dangKi_etEmail);
        spinnerLever = findViewById(R.id.dangKi_spinnerLever);
    }
}