package com.example.tranq.newsevents.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterHome extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentHomeList = new ArrayList<>();
    private final List<String> mFragmentHomeTitleList = new ArrayList<>();

    public ViewPagerAdapterHome(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentHomeList.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentHomeList.size();
    }

    public void addFragmentHome(Fragment fragment, String title) {
        mFragmentHomeList.add(fragment);
        mFragmentHomeTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentHomeTitleList.get(position);
    }
}
