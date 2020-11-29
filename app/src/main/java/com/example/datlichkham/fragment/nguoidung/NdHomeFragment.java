package com.example.datlichkham.fragment.nguoidung;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datlichkham.R;
import com.example.datlichkham.adapter.finiteAdapter;
import com.saeed.infiniteflow.lib.FinitePagerContainer;


public class NdHomeFragment extends Fragment {


    public NdHomeFragment() {
        // Required empty public constructor
    }

    public static NdHomeFragment newInstance() {
        NdHomeFragment fragment = new NdHomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nd_home, container, false);

        // Inflate the layout for this fragment
        return view;
    }
}