package com.example.alfonsoc.piper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class CreateAcc extends AppCompatActivity {
    EditText firstname;
    EditText lastname;
    EditText dob;
    EditText email;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_acc_layout);

        Button createAcc = findViewById(R.id.crtbutton);

        firstname = findViewById(R.id.fninput);
        lastname = findViewById(R.id.lninput);
        dob = findViewById(R.id.dobinput);
        email = findViewById(R.id.emailinput);
        username = findViewById(R.id.userinput);
        password = findViewById(R.id.passwordinput);


        createAcc.setOnClickListener(AccCreation);

    }

    private View.OnClickListener AccCreation = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (firstname.getText().toString() == null) {
                firstname.setText("*Required");
            } else if (lastname.getText().toString() == null) {
                lastname.setText("*Required");
            } else if (dob.getText().toString() == null) {
                dob.setText("*Required");
            } else if (email.getText().toString() == null) {
                email.setText("*Required");
            } else if (username.getText().toString() == null) {
                username.setText("*Required");
            } else if (password.getText().toString() == null) {
                password.setText("*Required");
            } else {
                Profile temp = new Profile(firstname.getText().toString(), lastname.getText().toString(), dob.getText().toString(), email.getText().toString(),
                        username.getText().toString(), password.getText().toString(), null);

                PiperLogin.profiles.add(temp);

                Intent back = new Intent(CreateAcc.this, PiperLogin.class);
                startActivity(back);
            }


        }
    };
}
