package com.example.jacka.bizzconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jacka on 11/5/2016.
 */
public class UserHome extends AppCompatActivity {
    private TextView mUsername;
    private TextView mName;
    private TextView mEmail;
    private TextView mNumber;
    private Button mFindUsers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mUsername= (TextView) findViewById(R.id.current_user_username);
        mName= (TextView) findViewById(R.id.current_user_name);
        mEmail= (TextView) findViewById(R.id.current_user_email);
        mNumber= (TextView) findViewById(R.id.current_user_number);
        mFindUsers= (Button) findViewById(R.id.find_users);
        mFindUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserHome.this, CardViewer.class));
            }
        });




    }
}
