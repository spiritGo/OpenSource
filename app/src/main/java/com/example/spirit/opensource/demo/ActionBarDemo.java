package com.example.spirit.opensource.demo;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.spirit.opensource.R;

public class ActionBarDemo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            TextView textView = new TextView(this);
            textView.setText("test");
            textView.setTextColor(0xffffffff);
            textView.setTextSize(25);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setCustomView(textView);
            //设置背景图
            //actionBar.setBackgroundDrawable(getResources().getDrawable(R.mipmap.ic_launcher));
            //actionBar.setDisplayHomeAsUpEnabled(true);//设置左边的箭头显示
            //actionBar.setDisplayShowHomeEnabled(true);
            //actionBar.setDisplayUseLogoEnabled(true);
        }
    }
}
