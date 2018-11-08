package com.example.tranq.newsevents.utils;

import android.util.Log;

/**
 * Created by HiepTQ on 11/7/2018.
 */
public class LogUtil {

    public static boolean DEBUG = true;
    public static final String TAG = "LogUtil";

    private LogUtil() {
    }

    public static void setDebug(boolean debug) {
        LogUtil.DEBUG = debug;
    }

    public static void d(String msg) {
        if (DEBUG) {
            Log.d(TAG, msg);
        }
    }

    public static void i(String msg) {
        if (DEBUG) {
            Log.w(TAG, msg);
        }
    }

    public static void w(String msg) {
        if (DEBUG) {
            Log.w(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (DEBUG) {
            Log.e(TAG, msg);
        }
    }
}
