package com.liyuaninc.liyuantcapp.Main.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.widget.Toast;

import com.liyuaninc.liyuantcapp.R;
import com.liyuaninc.liyuantcapp.aboutus.aboutus;

public class setting extends Fragment {

  private TextView down;
    private  TextView about;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        // Inflate the layout for this fragment
        down = (TextView) view.findViewById(R.id.downland);
        about = (TextView)view.findViewById(R.id.aboutus);


        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"downland",Toast.LENGTH_LONG).show();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),aboutus.class);
                startActivity(intent);
            }
        });




        return view;
    }

}