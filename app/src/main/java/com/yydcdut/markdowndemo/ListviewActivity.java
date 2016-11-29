package com.yydcdut.markdowndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class ListviewActivity extends AppCompatActivity {
    private ListView mLvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("RxMarkdown-listview");
        mLvContent = (ListView) findViewById(R.id.lv_content);
        initData();
    }

    private void initData() {

    }

}
