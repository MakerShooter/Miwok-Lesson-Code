package com.example.android.miwok;

/**
 * Created by User on 2017-06-07.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    //contructor
    public Word(String MiwokTranslation, String DefaultTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;

    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
