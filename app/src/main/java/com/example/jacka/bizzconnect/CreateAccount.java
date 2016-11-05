package com.example.jacka.bizzconnect;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

                createAccount();
                    startActivity(new Intent(CreateAccount.this, UserHome.class));
            }
        });

    }
    private void createAccount(){
        UserInfo newUser;

        if(mNumberView.toString().equals("")){
            newUser = new UserInfo(mUserName.getText().toString(), mNameView.getText().toString(), mPasswordView.getText().toString(), mEmailView.getText().toString());

        }
        else {
            newUser = new UserInfo(mUserName.getText().toString(), mNameView.getText().toString(), mPasswordView.getText().toString(), mNumberView.getText().toString(), mEmailView.getText().toString());
        }
        AllUsers.getIns().getMap().put(mUserName.getText().toString(), newUser);
        AllUsers.getIns().saveUser();
    }

}
