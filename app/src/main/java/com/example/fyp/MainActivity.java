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
    RecyclerView recommendationrecyclerview;
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
        list.add(new RecipeModel(R.drawable.food2 , "Spicy Beaf Burger 2", "Fastfood","Price:","900","4.3",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food3 , "Ice Cream", "Desert","Price:","900","4.3",R.drawable.ic_baseline_star_24));


        RecipeAdapter adapter = new RecipeAdapter(list,this);
        reciperecyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        reciperecyclerview.setLayoutManager(layoutManager);

//Category Recyclerview//
        recommendationrecyclerview = findViewById(R.id.recommendation_recyl);
        ArrayList<RecipeModel> list1 =new ArrayList<>();
        list1.add(new RecipeModel(R.drawable.food7 , "Zinger Burger","Fastfood", "Price:","250","4.2",R.drawable.ic_baseline_star_24));
        list1.add(new RecipeModel(R.drawable.food7 , "Zinger Burger","Fastfood", "Price:","250","4.2",R.drawable.ic_baseline_star_24));
        list1.add(new RecipeModel(R.drawable.food7 , "Zinger Burger","Fastfood", "Price:","250","4.2",R.drawable.ic_baseline_star_24));
        list1.add(new RecipeModel(R.drawable.food7 , "Zinger Burger","Fastfood", "Price:","250","4.2",R.drawable.ic_baseline_star_24));




        RecipeAdapter adapter1=new RecipeAdapter(list1,this);
        recommendationrecyclerview.setAdapter(adapter1);
        LinearLayoutManager layoutManager1= new LinearLayoutManager( this, LinearLayoutManager.HORIZONTAL,false);
        recommendationrecyclerview.setLayoutManager(layoutManager1);

        recommendationrecyclerview.setHasFixedSize(true);
       recommendationrecyclerview.setNestedScrollingEnabled(false);

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
