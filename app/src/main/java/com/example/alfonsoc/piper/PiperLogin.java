package com.example.alfonsoc.piper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class PiperLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        Button createAcc = findViewById(R.id.cretAcc);
        Button loginAcc = findViewById(R.id.lgin);

        createAcc.setOnClickListener(acctCreation);
        loginAcc.setOnClickListener(acctLogin);
    }

    private View.OnClickListener acctCreation = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent create = new Intent(PiperLogin.this, CreateAcc.class);
            startActivity(create);
        }
    };

    private View.OnClickListener acctLogin = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent login = new Intent(PiperLogin.this, AccLogin.class);
            startActivity(login);
        }
    };
}
