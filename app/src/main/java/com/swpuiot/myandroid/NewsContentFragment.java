package com.swpuiot.myandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NewsContentFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_news_content, container, false);
        return view;
    }
    public void refresh(String newstitle,String newscontent){
        View visibilitylayout=view.findViewById(R.id.visibility_layout);
        //noinspection ResourceType
        visibilitylayout.setVisibility(View.VISIBLE);
        TextView newstitletext= (TextView) view.findViewById(R.id.news_title);
        TextView newscontenttext= (TextView) view.findViewById(R.id.news_contenr);
        newstitletext.setText(newstitle);
        newscontenttext.setText(newscontent);
    }

}
