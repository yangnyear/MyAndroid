package com.swpuiot.myandroid;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;

public class NewsContentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_news_content);
        String newstitle=getIntent().getStringExtra("news_title");
        String newscontent=getIntent().getStringExtra("news_content");
        NewsContentFragment newsContentFragment=(NewsContentFragment)getFragmentManager().findFragmentById(R.id.news_content_fragment);
        newsContentFragment.refresh(newstitle,newscontent);
    }
    public static void actionstart(Context context,String newstitle,String newscontent){
        Intent intent=new Intent(context,NewsContentActivity.class);
        intent.putExtra("news_title",newstitle);
        intent.putExtra("news_content",newscontent);
        context.startActivity(intent);
    }
}
