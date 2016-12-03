package com.swpuiot.myandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2016/12/1.
 */
public class NewsTitleFragment extends Fragment implements View.OnClickListener{
    private ListView newstitlelistview;
    private List<News> newsList;
    private MyAdapter adapter;
    private boolean Topane;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        newsList=getNews();
        adapter=new MyAdapter(activity,R.layout.news_item,newsList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.news_title_frag,container,false);
        newstitlelistview= (ListView) view.findViewById(R.id.news_title_list_view);
        newstitlelistview.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {


    }
    private List<News> getNews(){
        List<News> newslist=new ArrayList<News>();
        News news1=new News();
        News news2=new News();
        news1.setTitle("succeed in college as a disabled student");
        news1.setContent("college freshmen wil soon learn to live with a roommate adjust to a new social scene " +
                "and survive less than stellar dining hall food.students with learning disabilities " +
                "will face these transitions while also grepping whit a frw more hurdles");
        news2.setTitle("Google Android exec poached by china's HuaWei");
        news2.setContent("china's HuaWei has poached a key Google executive involved in the tech giant's " +
                "Android phones,in a move seen as a coup for the rapidly drowing chinese smartphone maker  ");
        newslist.add(news1);
        newsList.add(news2);
        return newslist;
    }
}
