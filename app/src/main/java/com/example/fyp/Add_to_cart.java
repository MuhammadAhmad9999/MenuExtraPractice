package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fyp.Adapters.CartAdapter;
import com.example.fyp.Models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class Add_to_cart extends AppCompatActivity {
    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);

        recyclerView= findViewById(R.id.mycart_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list=new ArrayList<>();
        list.add(new CartModel(R.drawable.food2,"ZingerBurger","430"));
        list.add(new CartModel(R.drawable.food2,"ZingerBurger","430"));
        list.add(new CartModel(R.drawable.food2,"ZingerBurger","430"));
        list.add(new CartModel(R.drawable.food2,"ZingerBurger","430"));
        cartAdapter=new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

    }
}