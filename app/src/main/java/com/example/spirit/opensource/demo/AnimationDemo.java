package com.example.spirit.opensource.demo;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import com.example.spirit.opensource.R;

import org.w3c.dom.Text;

public class AnimationDemo extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_demo);

        final TextView tv_demo1 = findViewById(R.id.tv_demo1);

        ObjectAnimator scaleX = ObjectAnimator.ofFloat(tv_demo1, "scaleX", 1.5f);
        scaleX.setDuration(1000);
        //scaleX.setInterpolator(new OvershootInterpolator());//超过一点再回来
        //scaleX.setInterpolator(new BounceInterpolator());//像球落地一样
        //scaleX.setInterpolator(new CycleInterpolator(3));//左右来回抖动
        //scaleX.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleX.setInterpolator(new LinearOutSlowInInterpolator());
        scaleX.setStartDelay(1000);
        scaleX.start();

        ObjectAnimator translationY = ObjectAnimator.ofFloat(tv_demo1, "translationY", 50);
        translationY.setDuration(1000);
        //scaleX.setInterpolator(new OvershootInterpolator());//超过一点再回来
        translationY.setInterpolator(new BounceInterpolator());//像球落地一样
        translationY.setStartDelay(1000);
        translationY.start();

        tv_demo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "click", Toast.LENGTH_SHORT).show();
                System.out.println(tv_demo1.getTop());
            }
        });
    }
}
