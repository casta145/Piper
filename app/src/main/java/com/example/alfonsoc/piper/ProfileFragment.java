package com.example.alfonsoc.piper;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setText();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    public void setText(){
        TextView name = getActivity().findViewById(R.id.name);
        TextView username = getActivity().findViewById(R.id.username);

        if(PiperLogin.profiles.get(0).getFirstname() != null) {
            String fullName = PiperLogin.profiles.get(0).getFirstname() + PiperLogin.profiles.get(0).getLastname();
            name.setText(fullName);
            username.setText(PiperLogin.profiles.get(0).getUsername());
        }
    }
}
