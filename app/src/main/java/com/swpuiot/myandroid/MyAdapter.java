package com.swpuiot.myandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2016/11/29.
 */
public class MyAdapter extends ArrayAdapter<News> {
    private int respurceid;

    public MyAdapter(Context context, int textviewresourceid, List<News> objects) {
        super(context, textviewresourceid, objects);
        respurceid=textviewresourceid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        News news=getItem(position);
        if (convertView==null){
            view= LayoutInflater.from(getContext()).inflate(respurceid,null);
        }else {
            view=convertView;
        }
        TextView newstitletext= (TextView) view.findViewById(R.id.news_title);
        newstitletext.setText(news.getTitle());
        return view;
    }
}

