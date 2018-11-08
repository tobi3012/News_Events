package com.example.tranq.newsevents.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HiepTQ on 11/8/2018.
 */
public class News {
    @SerializedName("id")
    private long newId;

    @SerializedName("feed")
    private String newFeed;

    @SerializedName("title")
    private String newTitle;

    @SerializedName("thumb_img")
    private String newThumb;

    @SerializedName("description")
    private String newDescription;

    @SerializedName("author")
    private String newAuthor;

    @SerializedName("publish_date")
    private long newPublishDate;

    @SerializedName("detail_url")
    private String newDetailUrl;

    @SerializedName("created_at")
    private long newCreate;

    @SerializedName("updated_at")
    private long newUpdated;

    public News(long newId, String newFeed, String newTitle, String newThumb, String newDescription, String newAuthor, long newPublishDate, String newDetailUrl, long newCreate, long newUpdated) {
        this.newId = newId;
        this.newFeed = newFeed;
        this.newTitle = newTitle;
        this.newThumb = newThumb;
        this.newDescription = newDescription;
        this.newAuthor = newAuthor;
        this.newPublishDate = newPublishDate;
        this.newDetailUrl = newDetailUrl;
        this.newCreate = newCreate;
        this.newUpdated = newUpdated;
    }

    public String getNewDetailUrl() {
        return newDetailUrl;
    }

    public long getNewCreate() {
        return newCreate;
    }

    public long getNewUpdated() {
        return newUpdated;
    }

    public long getNewId() {
        return newId;
    }

    public String getNewFeed() {
        return newFeed;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public String getNewThumb() {
        return newThumb;
    }

    public String getNewDescription() {
        return newDescription;
    }

    public String getNewAuthor() {
        return newAuthor;
    }

    public long getNewPublishDate() {
        return newPublishDate;
    }
}
