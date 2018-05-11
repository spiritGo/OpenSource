package com.example.spirit.opensource.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TabHost;

import com.example.spirit.opensource.BlankFragment;
import com.example.spirit.opensource.R;

public class TabActivityDemo extends FragmentActivity {

    private FragmentTabHost tabhost;
    private FrameLayout tabcontent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_demo);

        //初始化TabHost
        tabhost = findViewById(android.R.id.tabhost);
        tabcontent = findViewById(android.R.id.tabcontent);

        //使tabHost和frameLayout关联
        tabhost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        //添加tab和器对应的fragment
        TabHost.TabSpec all = tabhost.newTabSpec("all");
        all.setIndicator("综合");
        Bundle bundle = new Bundle();
        bundle.putString("text", "综合界面");
        tabhost.addTab(all, BlankFragment.class, bundle);

        TabHost.TabSpec all2 = tabhost.newTabSpec("tweet");
        all2.setIndicator("动弹");
        Bundle bundle2 = new Bundle();
        bundle2.putString("text", "动弹界面");
        tabhost.addTab(all2, BlankFragment.class, bundle2);
        tabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if ("tweet".equals(tabId)){
                    //.....
                }
            }
        });

        TabHost.TabSpec all3 = tabhost.newTabSpec("news");
        all3.setIndicator("新闻");
        Bundle bundle3 = new Bundle();
        bundle3.putString("text", "新闻界面");
        tabhost.addTab(all3, BlankFragment.class, bundle3);
    }
}
