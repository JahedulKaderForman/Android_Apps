package com.example.formankhan.banglanewspaper;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Forman khan on 9/2/2018.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    public MyViewHolder(View itemView) {
        super(itemView);

        imageView=(ImageView) itemView.findViewById(R.id.cardImageview);
        textView= (TextView) itemView.findViewById(R.id.cardtextview);

    }
}
