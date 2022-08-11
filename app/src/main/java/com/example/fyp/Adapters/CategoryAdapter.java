package com.example.fyp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.fyp.Models.CategoryModel;
import com.example.fyp.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewHolder>{
    ArrayList<CategoryModel> list;
    Context context;

    public CategoryAdapter(ArrayList<CategoryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_recyclerview ,parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        CategoryModel model= list.get(position);
        holder.catimage.setImageResource(model.getCatimage());
        holder.cattext.setText(model.getCattext());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView catimage;
        TextView cattext;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            catimage= itemView.findViewById(R.id.cat_image);
            cattext = itemView.findViewById(R.id.cat_text);

        }
    }
}
