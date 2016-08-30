package com.bignerdranch.android.locatractivity;

import android.net.Uri;

/**
 * Created by TMiller on 8/29/2016.
 */
public class GalleryItem {
    private String title;
    private String id;
    private String url_s;
    private String owner;
    private Uri link;
    private double latitude;
    private double longitude;

    @Override
    public String toString() {
        return title;
    }


    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUrl_s() {
        if (url_s == null) { return ""; }
        return url_s;
    }
    public void setUrl_s(String url_s) {
        this.url_s = url_s;
    }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double lat) { latitude = lat; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double lon) { longitude = lon; }


    public Uri getPhotoPageUri() {
        link = Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(owner)
                .appendPath(id)
                .build();

        return link;
    }
}
