package com.example.sandy.miwoklanguage;

/**
 * Created by sandy on 14-02-2017.
 */
public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


    public boolean hasImage() {
        return imageResourceId != -1;
    }
}
