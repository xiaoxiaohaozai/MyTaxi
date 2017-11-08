package com.chenhao.taxidemo;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * @Description: app启动页
 * @Author: chenhao
 * @Time: 2017/11/6 17:16
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ImageView imageView = (ImageView) findViewById(R.id.logo);
            AnimatedVectorDrawable vectorDrawable = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim);
            imageView.setImageDrawable(vectorDrawable);
            vectorDrawable.start();
       }
    }
}
