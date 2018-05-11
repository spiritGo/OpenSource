package com.example.spirit.opensource;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.spirit.opensource.demo.ActionBarDemo;
import com.example.spirit.opensource.demo.AnimationDemo;
import com.example.spirit.opensource.demo.ButterKnifeDemo;
import com.example.spirit.opensource.demo.TabActivityDemo;

public class MainActivity extends ListActivity {

    private ClassName[] strArr = {
            new ClassName(ButterKnifeDemo.class, "butterKnife"),
            new ClassName(ActionBarDemo.class, "actionBar"),
            new ClassName(TabActivityDemo.class, "tabHost"),
            new ClassName(AnimationDemo.class, "animation"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<ClassName> adapter = new ArrayAdapter<>(this, android.R.layout
                .simple_list_item_1, strArr);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, strArr[position].aClass);
        startActivity(intent);
    }

    class ClassName {
        private Class<?> aClass;
        private String name;

        ClassName(Class<?> aClass, String name) {
            this.aClass = aClass;
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
