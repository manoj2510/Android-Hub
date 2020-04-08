package com.example.myandroidhub.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myandroidhub.R;
import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {

    private ImageView mImage;
    private final String url = "https://specials-images.forbesimg.com/imageserve/5d6a0922fead28000892b2b7/960x0.jpg?fit=scale";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso2);
        initView();
        setValues();
    }

    private void initView()
    {
        mImage = findViewById(R.id.img_image);
    }

    private void setValues()
    {
        Picasso.get().load(url).into(mImage);
        /*Picasso.get()
                .load(url)
                .resize(50, 50)
                .centerCrop()
                .into(mImage);*/
    }
}
