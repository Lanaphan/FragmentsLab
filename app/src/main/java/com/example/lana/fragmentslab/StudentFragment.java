package com.example.lana.fragmentslab;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class StudentFragment extends Fragment {
    public StudentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student, container, false);
        TextView id = (TextView)view.findViewById(R.id.stu_id);
        id.setText("1000");
        TextView name = (TextView)view.findViewById(R.id.stu_name);
        name.setText("Lana");
        TextView major = (TextView)view.findViewById(R.id.stu_major);
        major.setText("CS");
        return view;
    }

}
