package com.example.sandipghosh.geolocation;

/**
 * Created by sandipghosh on 09/03/17.
 */

public class DataObject {
    private String mText1;
    private String mText2;

    DataObject(String txt1, String txt2) {
        mText1 = txt1;
        mText2 = txt2;
    }
    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {

        this.mText1 = mText1;

    }

    public String getmText2() {

        return mText2;
    }
    public void setmText2(String mText2) {

        this.mText2 = mText2;
    }
}
