package com.example.formankhan.banglanewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplaceScreen extends AppCompatActivity {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace_screen);
        progressBar= (ProgressBar) findViewById(R.id.progressBar);

        //hide title and actionbar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        try{
            this.getSupportActionBar().hide();
        }
        catch (Exception e){}
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                splash();
                StartActitvity();
            }
        });

        thread.start();
        //start splash

    }
    public void splash(){
                for(int progress=1;progress<=100;progress=progress+1) {
                    try {
                        Thread.sleep(35);
                        progressBar.setProgress(progress);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
    }

    public void StartActitvity(){
        Intent intent = new Intent(SplaceScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
