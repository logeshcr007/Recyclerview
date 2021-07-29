package com.example.recyclerview6;

public class Model {
    private int imageview;
    private String extview;

    public Model(int imageview, String extview) {
        this.imageview = imageview;
        this.extview = extview;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public String getExtview() {
        return extview;
    }

    public void setExtview(String extview) {
        this.extview = extview;
    }
}
