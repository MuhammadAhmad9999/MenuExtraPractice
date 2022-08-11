package com.example.fyp.Models;

public class CategoryModel {
    int catimage;
    String cattext;

    public CategoryModel(int catimage, String cattext) {
        this.catimage = catimage;
        this.cattext = cattext;
    }

    public int getCatimage() {
        return catimage;
    }

    public void setCatimage(int catimage) {
        this.catimage = catimage;
    }

    public String getCattext() {
        return cattext;
    }

    public void setCattext(String cattext) {
        this.cattext = cattext;
    }
}
