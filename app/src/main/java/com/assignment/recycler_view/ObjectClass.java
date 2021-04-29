package com.assignment.recycler_view;

public class ObjectClass {
    int mImageResource;
    String mTitle;
    String mSubtitle;

    public ObjectClass(int mImageResource, String mTitle, String mSubtitle) {
        this.mImageResource = mImageResource;
        this.mTitle = mTitle;
        this.mSubtitle = mSubtitle;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSubtitle() {
        return mSubtitle;
    }
}
