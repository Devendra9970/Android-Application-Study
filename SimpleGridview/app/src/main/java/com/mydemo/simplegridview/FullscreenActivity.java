package com.mydemo.simplegridview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FullscreenActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        Intent intent =getIntent();
        String key;
        int position = intent.getExtras().getInt( key:"id")
        ImageAdapter imageAdapter = new ImageAdapter( context:this);
        ImageView imageView = (ImageView) findViewById( R.id.imageview );
        ImageView.setImageResorce(imageAdapter.flowers[position]);
    }
}