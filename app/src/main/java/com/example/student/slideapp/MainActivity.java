package com.example.student.slideapp;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(myPagerAdapter);
    }

    public void setPage(int page){
        viewPager.setCurrentItem(page); //해당 페이지 이동
    }

    public void btnClick(View view){
        switch (view.getId()){
            case R.id.bt_red:setPage(0);break;
            case R.id.bt_green:setPage(1);break;
            case R.id.bt_blue:setPage(2);break;
            case R.id.bt_yellow:setPage(3);break;
        }
    }

}
