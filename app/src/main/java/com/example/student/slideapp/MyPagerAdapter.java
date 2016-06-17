package com.example.student.slideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by student on 2016-06-17.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter{
    Fragment[] fragments = new Fragment[4];

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments[0] = new RedFragment();
        fragments[1] = new GreenFragment();
        fragments[2] = new BlueFragment();
        fragments[3] = new YellowFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
