package com.example.alfonsoc.piper;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class UploadFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AlertDialog.Builder alertTwoButtons = new AlertDialog.Builder(this.getActivity());
        alertTwoButtons.setTitle("Uploading Content")
                .setMessage("What do you want to upload?")
                .setPositiveButton("Photo",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent photoUpload = new Intent(getActivity(), UploadPhoto.class);
                                startActivity(photoUpload);
                            }
                        })
                .setNegativeButton("Text", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent textUpload = new Intent(getActivity(), UploadText.class);
                        startActivity(textUpload);
                    }
                });
        AlertDialog alertDialog = alertTwoButtons.create();
        alertDialog.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upload, container, false);
    }
}
