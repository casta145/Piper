package com.example.alfonsoc.piper;

import android.media.Image;

import java.util.ArrayList;

public class Profile {

    public static ArrayList<String> titles = new ArrayList<String>();
    public static ArrayList<String> txtPosts = new ArrayList<String>();

    String firstname;
    String lastname;
    String dob;
    String email;
    String username;
    String password;
    Image profilepic;

    Profile (String firstname, String lastname, String dob, String email, String username, String password, Image profilepic){
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.email = email;
        this.username = username;
        this.password = password;
        this.profilepic = profilepic;
    }

    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname(String fname){
        this.firstname = fname;
    }

    public String getLastname() {
        return this.lastname;
    }
    public void setLastname(String lname){
        this.lastname = lname;
    }

    public String getDob(){
        return this.dob;
    }
    public void setDob(String dob1){
        this.dob = dob1;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email1){
        this.email = email1;
    }

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username1){
        this.username = username1;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password1){
        this.password = password1;
    }

    public Image getProfilepic(){
        return this.profilepic;
    }
    public void setProfilepic(Image profilepic1){
        this.profilepic = profilepic1;
    }
}
