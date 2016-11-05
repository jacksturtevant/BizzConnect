package com.example.jacka.bizzconnect;

/**
 * Created by Jacka on 11/5/2016.
 */
public class UserInfo {
    private String name;
    private String password;
    private String number = "No Number on Record";
    private String email;
    private String username;

    public UserInfo (String usernameIn, String nameIn, String passIn, String numIn, String emIn){
        this.username= usernameIn;
        this.name= nameIn;
        this.password = passIn;
        this.number= numIn;
        this.email= emIn;
    }

    public UserInfo (String usernameIn, String nameIn, String passIn, String emIn){
        this.username= usernameIn;
        this.name= nameIn;
        this.password = passIn;
        this.email= emIn;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }

}
