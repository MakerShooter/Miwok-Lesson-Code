package com.example.android.miwok;

/**
 * Created by User on 2017-06-07.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private boolean isImage;


    //contructor
    public Word(String MiwokTranslation, String DefaultTranslation, int imageResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = imageResourceId;
        isImage = true;
    }
    //contructor
    public Word(String MiwokTranslation, String DefaultTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        isImage = false;

    }



    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean isImage() {
        return isImage;
    }
}
