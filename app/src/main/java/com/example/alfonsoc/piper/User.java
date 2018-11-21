package com.example.alfonsoc.piper;

import java.util.ArrayList;

public class User {

        public static ArrayList<String> textPosts = new ArrayList<String>();

        public String username;
        public String dob;

        public User(String username, String dob)
        {
            this.username = username;
            this.dob = dob;
        }

        public String getName()
        {
            return this.username;
        }

        public String getDate()
        {
            return this.dob;
        }
}
