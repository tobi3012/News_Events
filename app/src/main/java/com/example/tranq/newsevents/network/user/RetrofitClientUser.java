package com.example.tranq.newsevents.network.user;

import com.example.tranq.newsevents.network.RetrofitClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientUser {
    private RetrofitClientUser retrofitClientUser;
    private static RetrofitClientUser sInstance;

    private RetrofitClientUser() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.18.91/18175d1_mobile_100_fresher/public/api/v0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitClientUser = retrofit.create(RetrofitClientUser.class);
    }

    public static RetrofitClientUser getInstance() {
        if (null == sInstance) {
            sInstance = new RetrofitClientUser();
        }
        return sInstance;
    }

    public RetrofitClientUser getEventApi() {
        return sInstance.retrofitClientUser;
    }
}
