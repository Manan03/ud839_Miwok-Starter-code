package com.example.android.miwok;

public class Word {
    private int mResourceId=NO_IMAGE_PROVIDED;
    private String mDefaultTranslataion;
    private String mMiwokTranslataion;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResource;

    public Word(String mDefaultTranslataion, String mMiwokTranslataion,int mAudioResource) {
        this.mDefaultTranslataion = mDefaultTranslataion;
        this.mMiwokTranslataion = mMiwokTranslataion;
        this.mAudioResource=mAudioResource;
    }


    public Word(String mDefaultTranslataion, String mMiwokTranslataion, int mResourceId, int mAudioResource) {
        this.mDefaultTranslataion = mDefaultTranslataion;
        this.mMiwokTranslataion = mMiwokTranslataion;
        this.mResourceId = mResourceId;
        this.mAudioResource = mAudioResource;
    }

    public int getAudioResource() {
        return mAudioResource;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public String getDefaultTranslataion() {
        return mDefaultTranslataion;
    }

    public String getMiwokTranslataion() {
        return mMiwokTranslataion;
    }

    public boolean hasImage() {
        return NO_IMAGE_PROVIDED != mResourceId;
    }

}
