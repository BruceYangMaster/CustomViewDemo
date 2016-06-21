package com.deepblue.customviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.deepblue.customviewdemo.Adapter.ListAdapter;
import com.deepblue.customviewdemo.Model.ListModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mListView = (ListView) findViewById(R.id.listview);
        ArrayList<ListModel> mArrayList = getListData();
        ListAdapter listAdapter = new ListAdapter(mArrayList, this);
        mListView.setAdapter(listAdapter);
    }

    private ArrayList<ListModel> getListData() {
        ArrayList<ListModel> mArrayList = new ArrayList<>();
        ListModel listModel = new ListModel();
        mArrayList.add(listModel);
        return mArrayList;
    }
}
