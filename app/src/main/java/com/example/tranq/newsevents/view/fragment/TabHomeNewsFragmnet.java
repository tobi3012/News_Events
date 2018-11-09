package com.example.tranq.newsevents.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tranq.newsevents.R;
import com.example.tranq.newsevents.adapter.ViewPagerAdapter;

public class TabHomeNewsFragmnet extends Fragment {

    private ListView lvNews;
    public TabHomeNewsFragmnet() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_home_news,container,false);

        lvNews = (ListView) view.findViewById(R.id.lvNews);
        return view;
    }
}
