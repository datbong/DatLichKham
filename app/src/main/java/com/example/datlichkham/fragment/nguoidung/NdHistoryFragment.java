package com.example.datlichkham.fragment.nguoidung;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.datlichkham.R;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NdHistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NdHistoryFragment extends Fragment {
    private EditText edFirstDate, edSecondDate;
    private DatePickerDialog.OnDateSetListener onDateSetListener;

    public NdHistoryFragment() {
        // Required empty public constructor
    }

    public static NdHistoryFragment newInstance() {
        NdHistoryFragment fragment = new NdHistoryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nd_history, container, false);
        edFirstDate = view.findViewById(R.id.edFirstDate);
        edSecondDate = view.findViewById(R.id.edSecondDate);
        edFirstDate.setOnClickListener(v -> {
            onDateSetListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    month = month+1;
                    String date = dayOfMonth + "/" + month + "/" + year;
                    edFirstDate.setText(date);
                }
            };
            chooseDate();
        });
        edSecondDate.setOnClickListener(v -> {
            onDateSetListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    month = month+1;
                    String date = dayOfMonth + "/" + month + "/" + year;
                    edSecondDate.setText(date);
                }
            };
            chooseDate();
        });
        return view;
    }

    private void chooseDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(
                getActivity(),
                android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                onDateSetListener,
                year, month, day);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }

}