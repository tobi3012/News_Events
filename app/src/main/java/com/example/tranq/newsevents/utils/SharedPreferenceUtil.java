package com.example.tranq.newsevents.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by HiepTQ on 11/7/2018.
 */
public class SharedPreferenceUtil {
    private static SharedPreferenceUtil mSharedPreferenceUtils;
    private Context mContext;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mSharedPreferencesEditor;

    private SharedPreferenceUtil(Context context) {
        mContext = context;
        mSharedPreferences = context.getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        mSharedPreferencesEditor = mSharedPreferences.edit();
    }

    public static SharedPreferenceUtil getInstance(Context context) {

        if (null == mSharedPreferenceUtils) {
            mSharedPreferenceUtils = new SharedPreferenceUtil(context.getApplicationContext());
        }
        return mSharedPreferenceUtils;
    }

    public void setStringValue(String key, String value) {
        mSharedPreferencesEditor.putString(key, value);
        mSharedPreferencesEditor.commit();
    }

    public String getStringValue(String key, String defaultValue) {
        return mSharedPreferences.getString(key, defaultValue);
    }

    public void removeKey(String key) {
        if (mSharedPreferencesEditor != null) {
            mSharedPreferencesEditor.remove(key);
            mSharedPreferencesEditor.commit();
        }
    }

    public void clear() {
        mSharedPreferencesEditor.clear().commit();
    }
}
