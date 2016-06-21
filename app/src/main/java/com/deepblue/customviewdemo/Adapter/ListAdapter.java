package com.deepblue.customviewdemo.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.deepblue.customviewdemo.Model.ListModel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/6/21 0021.
 */
public class ListAdapter extends BaseAdapter {
    private ArrayList<ListModel> mArrayList;
    private Context context;

    public ListAdapter(ArrayList<ListModel> mArrayList, Context context) {
        this.mArrayList = mArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }
}
