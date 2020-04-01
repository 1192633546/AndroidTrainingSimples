package com.zhouwei.androidtrainingsimples.arc_header_view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zhouwei.androidtrainingsimples.R;
import com.zhouwei.androidtrainingsimples.utils.StatusBarUtils;

/**
 * Created by zhouwei on 17/10/15.
 * https://www.jianshu.com/p/db4b7290d98c
 */

public class ArcHeaderImageActivity extends AppCompatActivity {
    public static final String URL = "https://upload-images.jianshu.io/upload_images/3513995-2850130819971ec7.png?imageMogr2/auto-orient/strip|imageView2/2/format/webp";
    private PerfectArcView mArcHeaderView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arc_header_image_layout_activity);
        StatusBarUtils.setColor(this,getResources().getColor(R.color.start_color),0);

        initView();
    }

    private void initView() {
        mArcHeaderView = (PerfectArcView) findViewById(R.id.header_view);
        mArcHeaderView.setImageUrl(URL);
        //mArcHeaderView.setColor(getResources().getColor(R.color.start_color),getResources().getColor(R.color.end_color));
    }
}
