package com.example.datlichkham.fragment.nguoidung;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datlichkham.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NdChatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NdChatFragment extends Fragment {


    public NdChatFragment() {
        // Required empty public constructor
    }

    public static NdChatFragment newInstance() {
        NdChatFragment fragment = new NdChatFragment();
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
        return inflater.inflate(R.layout.fragment_nd_chat, container, false);
    }
}