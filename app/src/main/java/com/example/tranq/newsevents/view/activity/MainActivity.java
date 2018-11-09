package com.example.tranq.newsevents.view.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.tranq.newsevents.R;
import com.example.tranq.newsevents.adapter.ViewPagerAdapter;
import com.example.tranq.newsevents.utils.Const;
import com.example.tranq.newsevents.view.fragment.TabBrowseFragment;
import com.example.tranq.newsevents.view.fragment.TabHomeFragment;
import com.example.tranq.newsevents.view.fragment.TabMyPageSignupFragment;
import com.example.tranq.newsevents.view.fragment.TabNearFragment;

/**
 * Created by HiepTQ on 11/7/2018.
 */

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEventListener();

    }

    private void initEventListener() {
        setSupportActionBar(toolbar);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabs);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter;
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabHomeFragment(), Const.TAB_HOME);
        adapter.addFragment(new TabNearFragment(), Const.TAB_NEAR);
        adapter.addFragment(new TabBrowseFragment(), Const.TAB_BROWSE);
        adapter.addFragment(new TabMyPageSignupFragment(), Const.TAB_MY_PAGE);
        viewPager.setAdapter(adapter);
    }
}
