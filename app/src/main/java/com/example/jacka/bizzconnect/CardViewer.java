package com.example.jacka.bizzconnect;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Jacka on 11/5/2016.
 */
public class CardViewer extends AppCompatActivity{
    @Override
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        
    }

    private SearchView mSearchbar;
    private ListView mListView;
    private Uri test;
    private String name= "Justin";
    private String mobile= "Justin";
//    private String home= "Justin";
//    private String work= "Justin";
//    private String email= "Justin";
//    private String company= "Justin";
//    private String industry= "Justin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
//        mSearchbar= (SearchView) findViewById(R.id.searchView);
        mListView=(ListView) findViewById(R.id.listView);
        Button badgeMedium = (Button) findViewById(R.id.contact1);
        badgeMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateNewContact newContact= new CreateNewContact();
                newContact.createContact(name, mobile, getApplicationContext());
                Toast.makeText(CardViewer.this, "Contact Added", Toast.LENGTH_LONG).show();
            }
        });

        }



    }

