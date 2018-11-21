package com.example.alfonsoc.piper;

import java.util.ArrayList;

public class User {

        //placeholders for database
        public static ArrayList<User> users = new ArrayList<>();
        public static ArrayList<String> textPosts = new ArrayList<String>();

        public String username;
        public String dob;

        public User(String username)
        {
            this.username = username;
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
