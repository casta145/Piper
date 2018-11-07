package com.example.alfonsoc.piper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AccLogin extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);

        Button login = findViewById(R.id.loginbutton);

        EditText username = findViewById(R.id.userinput);
        EditText password = findViewById(R.id.passinput);
        TextView userpass = findViewById(R.id.clicklink);

        login.setOnClickListener(logintoprofile);
        userpass.setOnClickListener(fixuserpass);
    }

    private View.OnClickListener logintoprofile = new View.OnClickListener() {
        @Override
        public void onClick (View view){

        }
    };

    private View.OnClickListener fixuserpass = new View.OnClickListener() {
        @Override
        public void onClick (View view){
            Intent test = new Intent(AccLogin.this, AccFix.class);
            startActivity(test);
        }
    };
}
