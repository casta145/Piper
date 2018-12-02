package com.example.alfonsoc.piper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UploadText extends AppCompatActivity {

    EditText titlePost;
    EditText textPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_text);

        Button cancel = findViewById(R.id.cancel);
        Button post = findViewById(R.id.post);

        titlePost = findViewById(R.id.titlePost);
        textPost = findViewById(R.id.txtPost);

        cancel.setOnClickListener(backHome);
        post.setOnClickListener(postText);
    }

    private View.OnClickListener backHome = new View.OnClickListener() {
    @Override
        public void onClick(View view) {
            Intent backHome = new Intent(UploadText.this, Homepage.class);
            startActivity(backHome);
        }
    };

    private View.OnClickListener postText = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String title = titlePost.getText().toString();
            String story = textPost.getText().toString();
            Profile.titles.add(title);
            Profile.txtPosts.add(story);
            Intent backHome = new Intent(UploadText.this, Homepage.class);
            startActivity(backHome);
        }
    };
}
