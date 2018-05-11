package com.example.spirit.opensource;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

public abstract class BaseActivity extends Activity {

//    public Button btn_1;
//    public Button btn_2;
//    public Button btn_3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_base);
//
//        btn_1 = findViewById(R.id.btn_1);
//        btn_2 = findViewById(R.id.btn_2);
//        btn_3 = findViewById(R.id.btn_3);

        init();
    }

    public abstract void init();
}
