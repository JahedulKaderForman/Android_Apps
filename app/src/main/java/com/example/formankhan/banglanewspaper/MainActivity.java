package com.example.formankhan.banglanewspaper;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ActionBar actionbar;
    Window window;
    private RecyclerView recyclerView;

    int[] newspaperLogo={R.drawable.protomalo,R.drawable.kalerkantho,R.drawable.manobzamin,R.drawable.inkilab,
    R.drawable.nayadigonto,R.drawable.ittefaq,R.drawable.vhorerpatha,R.drawable.purbokone
    };

    ArrayList<String>newspaperName=new ArrayList<String>(Arrays.asList("Protom Alo","Kaler Kantho","Manab Zamin","Inqilab","Naya Diganta","Ittefaq","Bhorer Pata","purbokone"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerViewId);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        //design Action bar
        actionbar=getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2AADD8")));
        actionbar.setTitle("Bangla Newspaper");

        //design status bar
        if(Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.statusBarColor));
        }


        CustomAdapter adapter=new CustomAdapter(this,newspaperName,newspaperLogo);
        recyclerView.setAdapter(adapter);

    }

}
