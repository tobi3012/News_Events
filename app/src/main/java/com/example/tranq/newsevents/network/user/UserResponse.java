package com.example.tranq.newsevents.network.user;

import com.example.tranq.newsevents.model.User;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserResponse {
    @SerializedName("results")
    public String users;

    public String getUsers() {
        return users;
    }
}
