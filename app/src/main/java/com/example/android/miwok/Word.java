package com.example.android.miwok;


public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int image_id;
    private int category = 0;
    private int audio_id;

    public Word(String english,String miwok,int aud_id)
    {
        this.defaultTranslation = english;
        this.miwokTranslation = miwok;
        this.audio_id = aud_id;
    }

    public Word(String english,String miwok,int img_id,int aud_id)
    {
        this.defaultTranslation = english;
        this.miwokTranslation = miwok;
        this.image_id = img_id;
        this.audio_id = aud_id;
        this.category = 1;
    }

    public String getDefaultTranslation ()
    {
        return defaultTranslation;
    }

    public String getMiwokTranslation() { return miwokTranslation; }

    public int getImage_id()
    {
        return image_id;
    }

    public int getCategory() {
        return category;
    }

    public int getAudio_id() { return audio_id; }
}
