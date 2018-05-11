package com.example.spirit.opensource.demo;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Toast;

import com.example.spirit.opensource.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ButterKnifeDemo extends Activity {

    @InjectView(R.id.btn_1)
    Button button1;

    private String helloStr = "hello";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        ButterKnife.inject(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "按钮被激活", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.btn_2)
    public void myOnClick(final View view) {
        ((Button) view).setText(helloStr);
        ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                view.setAlpha(animation.getAnimatedFraction());
                System.out.println(animation.getAnimatedFraction());
            }
        });

        animator.setDuration(5000);
        animator.setInterpolator(new BounceInterpolator());
        animator.start();
    }
}
