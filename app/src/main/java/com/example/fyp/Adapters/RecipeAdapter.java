package com.example.fyp.Adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fyp.MainActivity;
import com.example.fyp.Models.RecipeModel;
import com.example.fyp.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RecipeAdapter extends RecyclerView.Adapter <RecipeAdapter.viewHolder>{
    ArrayList<RecipeModel> list;
    Context context;
    ArrayList<String> Dialogelist;
    String[] Ingredients= {"Onion = Price","Cheese = Price","Olive = Price","Chilli = Price"};



    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview ,parent, false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        RecipeModel model= list.get(position);
        holder.foodimage.setImageResource(model.getFoodimage());
        holder.foodname.setText(model.getFoodname());
        holder.catname.setText(model.getCatname());
        holder.pricetag.setText(model.getPricetag());
        holder.foodprice.setText(model.getFoodprice());
        holder.ratingtag.setText(model.getRatingtag());
        holder.starimage.setImageResource(model.getStarimage());

        holder.addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = holder.displayoutput.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                holder.displayoutput.setText(String.valueOf(value));
            }
        });

        holder.removeimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String currentValue = holder.displayoutput.getText().toString();
                    int value = Integer.parseInt(currentValue);
                    value--;
                    holder.displayoutput.setText(String.valueOf(value));

                }
        });
        holder.Addextra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAlertDialoge();

            }
        });

    }
    private void CreateAlertDialoge() {
        Dialogelist=new ArrayList<>();
        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setTitle("Select Ingredients");
        builder.setMultiChoiceItems(Ingredients, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                String arr[]=Ingredients;
                if (isChecked){
                    Dialogelist.add(arr[which]);

                }else if (Dialogelist.contains(arr[which])){
                    Dialogelist.remove(arr[which]);

                }


            }
        });
        builder.setPositiveButton("show", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String data="";
                for (String item:Dialogelist){
                    data=data+" "+ item;

                }
                Toast.makeText(context,data, Toast.LENGTH_SHORT).show();

            }
        });

        builder.create();
        builder.show();
    }





    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setAdapter(CategoryAdapter adapter1) {
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView foodimage;
        TextView foodname;
        TextView catname;
        TextView pricetag;
        TextView foodprice;
        TextView ratingtag;
        ImageView starimage;
        ImageView addimage;
        ImageView removeimage;
        TextView displayoutput;
        Button Addextra;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            foodimage= itemView.findViewById(R.id.imageView);
            foodname= itemView.findViewById(R.id.foodname);
            catname=itemView.findViewById(R.id.catname);
            pricetag=itemView.findViewById(R.id.textprice);
            foodprice= itemView.findViewById(R.id.foodprice);
            ratingtag= itemView.findViewById(R.id.ratingtext);
            starimage=itemView.findViewById(R.id.starimage);
            addimage=itemView.findViewById(R.id.add_image);
            removeimage=itemView.findViewById(R.id.remove_image);
            displayoutput=itemView.findViewById(R.id.item_quantity_text);
            Addextra=itemView.findViewById(R.id.extra_btn);
        }
    }
}


