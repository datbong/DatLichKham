package com.example.datlichkham.fragment.nguoidung;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datlichkham.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NdDatLichFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NdDatLichFragment extends Fragment {


    public NdDatLichFragment() {
        // Required empty public constructor
    }


    public static NdDatLichFragment newInstance() {
        NdDatLichFragment fragment = new NdDatLichFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nd_dat_lich, container, false);
    }
}