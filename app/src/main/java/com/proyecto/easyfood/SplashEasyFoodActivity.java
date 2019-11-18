package com.proyecto.easyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashEasyFoodActivity extends AppCompatActivity {

    private ImageView imgvwsplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imgvwsplash = (ImageView) findViewById(R.id.imgvwsplash);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        imgvwsplash.startAnimation(myanim);
        final Intent LoginEasyFoodActivity = new Intent(this,LoginEasyFoodActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2500);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(LoginEasyFoodActivity);
                    finish();
                }
            }
        };
        timer.start();
    }
}
