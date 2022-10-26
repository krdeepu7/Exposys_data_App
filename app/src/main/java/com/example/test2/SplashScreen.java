package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static int timer=4000;

    ImageView imageView;
    TextView textView1,textview2;
    Animation anim_top,anim_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen1);

        imageView= findViewById(R.id.LogoHome);
        textView1=findViewById(R.id.Title);
        textview2=findViewById(R.id.Subtitle);

        anim_top= AnimationUtils.loadAnimation(this,R.anim.anim_top);
        anim_bottom=AnimationUtils.loadAnimation(this,R.anim.anim_bottom);

        imageView.setAnimation(anim_top);
        textView1.setAnimation(anim_bottom);
        textview2.setAnimation(anim_bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(SplashScreen.this, login.class);
                startActivity(intent);
                finish();

            }
        },timer);

    }
}