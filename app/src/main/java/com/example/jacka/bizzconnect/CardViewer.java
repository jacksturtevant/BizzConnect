package com.example.jacka.bizzconnect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
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
    private String name;
    private String mobile;
    private String email;
    private String company;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
//        mSearchbar= (SearchView) findViewById(R.id.searchView);
        mListView=(ListView) findViewById(R.id.listView);
        final TextView mUserName1=(TextView)findViewById(R.id.contact_name1);
        final TextView mUserNumber1=(TextView)findViewById(R.id.contact_number1);
        final TextView mUserEmail1=(TextView)findViewById(R.id.contact_email1);
        final TextView mUserCompany1=(TextView)findViewById(R.id.contact_company1);
        Button badgeMedium = (Button) findViewById(R.id.bconnect);
        badgeMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateNewContact newContact= new CreateNewContact();
                newContact.createContact(mUserName1.getText().toString(), mUserNumber1.getText().toString(),
                        mUserEmail1.getText().toString(), mUserCompany1.getText().toString(), getApplicationContext());
                Toast.makeText(CardViewer.this, "Contact Added", Toast.LENGTH_LONG).show();
            }
        });
        Button link= (Button) findViewById(R.id.blink);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/jack-sturtevant-1161a0128?authType=NAME_SEARCH&authToken=ObRG&locale=en_US&trk=tyah&trkInfo=clickedVertical%3Amynetwork%2CclickedEntityId%3A525989538%2CauthType%3ANAME_SEARCH%2Cidx%3A2-1-2%2CtarId%3A1478408016680%2Ctas%3AJack"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        }



    }

