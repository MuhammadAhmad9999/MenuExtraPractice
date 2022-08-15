package com.example.fyp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fyp.Models.CartModel;
import com.example.fyp.R;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    List<CartModel> list;


    public CartAdapter(List<CartModel> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_recyclerview,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CartModel model=list.get(position);
        holder.foodimage.setImageResource(model.getFoodimage());
        holder.foodname.setText(model.getFoodname());
        holder.foodprice.setText(model.getFoodprice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView foodimage;
        TextView foodname ,foodprice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage= itemView.findViewById(R.id.cart_imageView);
            foodname= itemView.findViewById(R.id.cart_foodname);
            foodprice= itemView.findViewById(R.id.cart_foodprice);
        }
    }
}
