package com.example.formankhan.banglanewspaper;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Forman khan on 9/2/2018.
 */
public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder>
{


    Context context;
    ArrayList<String> newspaperName;
    int[] newspaperLogo;
    public CustomAdapter(Context context, ArrayList<String> newspaperName, int[] newspaperLogo) {
        this.context=context;
        this.newspaperName=newspaperName;
        this.newspaperLogo=newspaperLogo;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_news,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {
        holder.imageView.setImageResource(newspaperLogo[position]);
        holder.textView.setText(newspaperName.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position){
                    case 0:
                        Intent intent = new Intent(v.getContext(), WebViewActivity.class);
                        intent.putExtra("url", "http://www.prothomalo.com/");
                        intent.putExtra("tag", "protomalo");
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent intentkalerkonto = new Intent(v.getContext(), WebViewActivity.class);
                        intentkalerkonto.putExtra("url", "http://www.kalerkantho.com/");
                        intentkalerkonto.putExtra("tag", "kalerkonto");
                        v.getContext().startActivity(intentkalerkonto);
                        break;
                    case 2:
                        break;
                    default:
                        Toast.makeText(context, newspaperName.get(position), Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return newspaperName.size();
    }
}
