package com.android.atiqorin.tourguide;

/**
 * Created by atiqorin on 7/4/16.
 */
public class Description {

    private String header;

    private String desc;

    private int mImageResourceId = NO_IMAGE;
    public static final int NO_IMAGE = -1;

    public Description(String header, String desc, int mImageResourceId) {
        this.header = header;
        this.desc = desc;
        this.mImageResourceId = mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
