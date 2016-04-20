package com.weidongjian.meitu.wheelviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.weidongjian.meitu.wheelviewdemo.view.OnItemSelectedListener;
import com.weidongjian.meitu.wheelviewdemo.view.LoopView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private RelativeLayout rootview;
//    private RelativeLayout.LayoutParams layoutParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);

//        rootview = (L) findViewById(R.id.rootview);

        LoopView loopView = (LoopView) findViewById(R.id.LoopView);
        LoopView loopView2 = (LoopView) findViewById(R.id.LoopView2);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            list.add("" + i);
        }
        //设置是否循环播放
        //loopView.setNotLoop();
        //滚动监听
        loopView.setListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Log.d("debug", "Item " + index);
            }
        });
        //设置原始数据
        loopView.setItems(list);
        loopView2.setItems(list);
        //设置初始位置
        loopView.setInitPosition(22);
        loopView2.setInitPosition(8);
        //设置字体大小
        loopView.setTextSize(24);
        loopView2.setTextSize(24);
//        rootview.addView(loopView, layoutParams);

    }

}
