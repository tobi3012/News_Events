package com.example.tranq.newsevents.utils;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by HiepTQ on 11/7/2018.
 */
public class StringUtil {


    public static boolean isEmpty(String strName) {
        return TextUtils.isEmpty(strName) || TextUtils.isEmpty(strName.trim());
    }

    public static boolean isEmail(String email) {
        Pattern regex = Pattern.compile(Const.EMAIL_REGEX);
        Matcher matcher = regex.matcher(email);
        return matcher.matches();
    }
}
