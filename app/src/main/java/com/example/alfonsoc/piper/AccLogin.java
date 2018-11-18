package com.example.alfonsoc.piper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AccLogin extends AppCompatActivity{

    public EditText username;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);

        Button login = findViewById(R.id.loginbutton);

        username = findViewById(R.id.userinput);
        password = findViewById(R.id.passinput);
        TextView userpass = findViewById(R.id.clicklink);

        login.setOnClickListener(logintoprofile);
        userpass.setOnClickListener(fixuserpass);

    }

    private View.OnClickListener logintoprofile = new View.OnClickListener() {
        @Override
        public void onClick (View view){
            if (Methods.check(username.getText().toString(), password.getText().toString())) {
                Intent homescrn = new Intent(AccLogin.this,HomeScreen.class);
                startActivity(homescrn);
            } else {
                Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_SHORT).show();
                username.setText("");
                password.setText("");
            }
        }
    };

    private View.OnClickListener fixuserpass = new View.OnClickListener() {
        @Override
        public void onClick (View view){
            Intent accfix = new Intent(AccLogin.this, AccFix.class);
            startActivity(accfix);
        }
    };

}
