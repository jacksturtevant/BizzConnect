package com.example.jacka.bizzconnect;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Jacka on 11/5/2016.
 */
public class CreateAccount extends AppCompatActivity{
    private EditText mEmailView;
    private EditText mPasswordView;
    private EditText mNumberView;
    private EditText mNameView;
    private EditText mUserName;
    private Button mRegister;
    public static ArrayList<UserInfo> userList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        mUserName = (EditText) findViewById(R.id.username);
        mNameView = (EditText) findViewById(R.id.name);
        mPasswordView = (EditText) findViewById(R.id.password);
        mNumberView = (EditText) findViewById(R.id.number);
        mEmailView = (EditText) findViewById(R.id.email);


        Button mRegister = (Button) findViewById(R.id.register_account);
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mNameView.equals(null) || mEmailView.equals(null) || mPasswordView.equals(null)){

                }
                else if(mPasswordView.getText().toString().length()<8){

                }
                else{
                createAccount();
                    startActivity(new Intent(CreateAccount.this, CreateAccount.class));
                }
            }
        });

    }
    private ArrayList<UserInfo> createAccount(){

        if(mNumberView.toString().equals("")){
            UserInfo newUser = new UserInfo(mUserName.getText().toString(), mNameView.getText().toString(), mPasswordView.getText().toString(), mEmailView.getText().toString());
            userList.add(newUser);

        }
        else {
            UserInfo newUser = new UserInfo(mUserName.getText().toString(), mNameView.getText().toString(), mPasswordView.getText().toString(), mNumberView.getText().toString(), mEmailView.getText().toString());
            userList.add(newUser);
        }
        return null;
    }
    public ArrayList<UserInfo> getUserList(){
        return userList;
    }

}