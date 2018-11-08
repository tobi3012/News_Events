package com.example.tranq.newsevents.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HiepTQ on 11/7/2018.
 */
public class RetrofitClient {
    private RetrofitClient retrofitClient;
    private static RetrofitClient sInstance;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.18.91/18175d1_mobile_100_fresher/public/api/v0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitClient = retrofit.create(RetrofitClient.class);
    }

    public static RetrofitClient getInstance() {
        if (null == sInstance) {
            sInstance = new RetrofitClient();
        }
        return sInstance;
    }

    public RetrofitClient getEventApi() {
        return sInstance.retrofitClient;
    }
}
