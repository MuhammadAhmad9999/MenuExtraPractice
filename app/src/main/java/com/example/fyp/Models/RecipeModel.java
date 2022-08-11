package com.example.fyp.Models;

public class RecipeModel {
    int foodimage;
    String foodname;
    String catname;
    String pricetag;
    String foodprice;
    String ratingtag;
    int starimage;

    public RecipeModel(int foodimage, String foodname, String catname, String pricetag, String foodprice, String ratingtag, int starimage) {
        this.foodimage = foodimage;
        this.foodname = foodname;
        this.catname = catname;
        this.pricetag = pricetag;
        this.foodprice = foodprice;
        this.ratingtag = ratingtag;
        this.starimage = starimage;
    }

    public int getFoodimage() {
        return foodimage;
    }

    public void setFoodimage(int foodimage) {
        this.foodimage = foodimage;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public String getPricetag() {
        return pricetag;
    }

    public void setPricetag(String pricetag) {
        this.pricetag = pricetag;
    }

    public String getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(String foodprice) {
        this.foodprice = foodprice;
    }

    public String getRatingtag() {
        return ratingtag;
    }

    public void setRatingtag(String ratingtag) {
        this.ratingtag = ratingtag;
    }

    public int getStarimage() {
        return starimage;
    }

    public void setStarimage(int starimage) {
        this.starimage = starimage;
    }
}



