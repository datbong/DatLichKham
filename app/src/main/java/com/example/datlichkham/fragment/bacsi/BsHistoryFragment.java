package com.example.datlichkham.fragment.bacsi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datlichkham.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BsHistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BsHistoryFragment extends Fragment {


    public BsHistoryFragment() {
        // Required empty public constructor
    }


    public static BsHistoryFragment newInstance() {
        BsHistoryFragment fragment = new BsHistoryFragment();
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
        return inflater.inflate(R.layout.fragment_bs_history, container, false);
    }
}