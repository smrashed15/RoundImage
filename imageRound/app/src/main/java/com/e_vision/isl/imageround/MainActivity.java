package com.e_vision.isl.imageround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Transformation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img= (ImageView) findViewById(R.id.img);
        img.setImageResource(R.mipmap.ic_launcher);


    }
}
