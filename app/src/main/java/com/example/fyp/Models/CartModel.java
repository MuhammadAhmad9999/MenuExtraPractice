package com.example.fyp.Models;

public class CartModel {
    int foodimage;
    String foodname;
    String foodprice;

    public CartModel(int foodimage, String foodname, String foodprice) {
        this.foodimage = foodimage;
        this.foodname = foodname;
        this.foodprice = foodprice;
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

    public String getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(String foodprice) {
        this.foodprice = foodprice;
    }
}
