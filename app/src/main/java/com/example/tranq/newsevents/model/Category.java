package com.example.tranq.newsevents.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HiepTQ on 11/8/2018.
 */
public class Category {
    @SerializedName("id")
    private int categoriesId;

    @SerializedName("name")
    private String categoriesName;

    @SerializedName("slug")
    private String categoriesSlug;

    public Category(int categoriesId, String categoriesName, String categoriesSlug) {
        this.categoriesId = categoriesId;
        this.categoriesName = categoriesName;
        this.categoriesSlug = categoriesSlug;
    }

    public int getCategoriesId() {
        return categoriesId;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public String getCategoriesSlug() {
        return categoriesSlug;
    }
}
