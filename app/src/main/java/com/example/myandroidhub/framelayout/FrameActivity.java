package com.example.myandroidhub.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myandroidhub.R;

public class FrameActivity extends AppCompatActivity {

    private ImageView mEiffel;
    private ImageView mPie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        initView();
        setValues();
    }

    private void initView()
    {
        mEiffel=findViewById(R.id.image);
        mPie=findViewById(R.id.pie);
        mEiffel.setVisibility(View.INVISIBLE);
    }
    private void setValues()
    {
        mPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPie.setVisibility(View.GONE);
                mEiffel.setVisibility(View.VISIBLE);
            }
        });
        mEiffel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEiffel.setVisibility(View.GONE);
                mPie.setVisibility(View.VISIBLE);
            }
        });


    }
}
