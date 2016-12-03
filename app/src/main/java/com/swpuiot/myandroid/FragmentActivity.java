package com.swpuiot.myandroid;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Button button = (Button) findViewById(R.id.button);
   button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
//           Toast.makeText(FragmentActivity.this, "onClick", Toast.LENGTH_SHORT).show();
           Fragment fragment=new NewFragment();
           FragmentManager fragmentManager=getFragmentManager();
           FragmentTransaction transaction = fragmentManager.beginTransaction();
           transaction.replace(R.id.below, fragment);
           transaction.addToBackStack(null);
           transaction.commit();
//           findfragmentbyid去获得fragment，
           NewFragment fragment1= (NewFragment) getFragmentManager().findFragmentById(R.id.belowfragment);
       }
   });


    }
}