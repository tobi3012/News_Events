package com.example.tranq.newsevents.view.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tranq.newsevents.R;
import com.example.tranq.newsevents.adapter.ViewPagerAdapter;
import com.example.tranq.newsevents.adapter.ViewPagerAdapterHome;
import com.example.tranq.newsevents.utils.Const;

/**
 * Created by HiepTQ on 11/7/2018.
 */

public class TabHomeFragment extends Fragment {

    private TabLayout tabLayoutHome;
    private ViewPager viewPagerHome;

    public TabHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_home, container, false);

        viewPagerHome = (ViewPager) view.findViewById(R.id.viewpagerHome);
        tabLayoutHome = (TabLayout) view.findViewById(R.id.tabLayoutHome);
        setupViewPager(viewPagerHome);
        tabLayoutHome.setupWithViewPager(viewPagerHome);

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapterHome adapter;
        adapter = new ViewPagerAdapterHome(getActivity().getSupportFragmentManager());
        adapter.addFragmentHome(new TabHomeNewsFragmnet(), Const.TAB_HOME_NEWS);
        adapter.addFragmentHome(new TabHomePopularFragment(),Const.TAB_HOME_POPULAR);
        viewPager.setAdapter(adapter);
    }

}
