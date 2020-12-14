package com.example.datlichkham.fragment.nguoidung;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datlichkham.R;
import com.example.datlichkham.adapter.UserChatAdapter;
import com.example.datlichkham.model.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NdChatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NdChatFragment extends Fragment {

    private RecyclerView rcUser;
    private List<Users> usersList;

    private String myId;

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
        View view = inflater.inflate(R.layout.fragment_nd_chat, container, false);
        rcUser = view.findViewById(R.id.rcUserChatActive);
        rcUser.setLayoutManager(new LinearLayoutManager(getContext()));
        usersList = new ArrayList<>();
        myId = getContext().getSharedPreferences("PREFS", Context.MODE_PRIVATE).getString("USERNAME", "");
        getUserFromDb();
        return view;
    }

    private void getUserFromDb() {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("users");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Users users = new Users();
                for(DataSnapshot ds: dataSnapshot.getChildren()){
                    users = ds.getValue(Users.class);
                    if(!users.getUserName().equalsIgnoreCase(myId)){
                        usersList.add(users);
                    }
                }
                UserChatAdapter userChatAdapter = new UserChatAdapter(getContext(), usersList);
                rcUser.setAdapter(userChatAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}