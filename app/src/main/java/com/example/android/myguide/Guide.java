package com.example.android.myguide;

public class Guide {


    private String mDescription;


    private String mPlace;


    private int mImageResourceId;

    /**
     * constructor
     * @param Place
     * @param Description
     * @param ImageResourceId
     */
    public Guide(String Place, String Description, int ImageResourceId) {
        mDescription = Description;
        mPlace = Place;
        mImageResourceId = ImageResourceId;
    }


    public String getDescrption() {
        return mDescription;
    }


    public String getPlace() {
        return mPlace;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

}