package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.fyp.Adapters.CategoryAdapter;
import com.example.fyp.Adapters.RecipeAdapter;
import com.example.fyp.Adapters.SliderAdapter;
import com.example.fyp.Models.CategoryModel;
import com.example.fyp.Models.RecipeModel;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView reciperecyclerview;
    RecyclerView categoryrecyclerview;
    SliderView sliderView;
    int[] images={R.drawable.food2,R.drawable.food3,R.drawable.food4};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        reciperecyclerview=findViewById(R.id.recyclerView);
        ArrayList<RecipeModel> list= new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food7 , "Zinger Burger","Fastfood", "Price:","250","4.2",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food5 , "Pizza", "Fastfood","Price:","900","4.3",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food4 , "Fries", "Fastfood","Price:","900","4.3",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food6 , "Malai Boti", "Fastfood","Price:","900","4.3",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food2 , "Beaf Burger", "Fastfood","Price:","900","4.3",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food3 , "Ice Cream", "Desert","Price:","900","4.3",R.drawable.ic_baseline_star_24));


        RecipeAdapter adapter = new RecipeAdapter(list,this);
        reciperecyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        reciperecyclerview.setLayoutManager(layoutManager);

//Category Recyclerview//
        categoryrecyclerview = findViewById(R.id.catrecyclervivew);
        ArrayList<CategoryModel> list1 =new ArrayList<>();
        list1.add(new CategoryModel(R.drawable.food7,"Fast Food"));
        list1.add(new CategoryModel(R.drawable.food2,"Desert"));
        list1.add(new CategoryModel(R.drawable.food3,"Salad"));
        list1.add(new CategoryModel(R.drawable.food4,"Handi"));
        list1.add(new CategoryModel(R.drawable.food5,"Beverage"));



        CategoryAdapter adapter1=new CategoryAdapter(list1,this);
        categoryrecyclerview.setAdapter(adapter1);
        LinearLayoutManager layoutManager1= new LinearLayoutManager( this, LinearLayoutManager.HORIZONTAL,false);
        categoryrecyclerview.setLayoutManager(layoutManager1);

        categoryrecyclerview.setHasFixedSize(true);
        categoryrecyclerview.setNestedScrollingEnabled(false);

         //////////Slider//////////

        sliderView=findViewById(R.id.sliderview);
        SliderAdapter sliderAdapter=new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        /////Increment Decrement button///////
















    }
}
