package com.example.jacka.bizzconnect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.widget.ListView;

/**
 * Created by Jacka on 11/5/2016.
 */
public class CardViewer extends AppCompatActivity{
    private SearchView mSearchbar;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
//        mSearchbar= (SearchView) findViewById(R.id.searchView);
        mListView=(ListView) findViewById(R.id.listView);

    }
}
