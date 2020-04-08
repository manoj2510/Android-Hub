package com.example.myandroidhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {

    private Button mButton;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        initView();
        setValues();
    }

    private void initView()
    {
        mButton=findViewById(R.id.bt_button);
        mButton1=findViewById(R.id.bt_button1);
        mButton2=findViewById(R.id.bt_button2);
        mButton3=findViewById(R.id.bt_button3);
        mButton4=findViewById(R.id.bt_button4);
    }

    private void setValues()
    {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this, "Hello!", Toast.LENGTH_SHORT).show();
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this, "Button-1", Toast.LENGTH_SHORT).show();
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this, "Button-2", Toast.LENGTH_SHORT).show();
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this, "Button-3", Toast.LENGTH_SHORT).show();
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this, "Button-4", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
