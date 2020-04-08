package com.example.myandroidhub.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myandroidhub.R;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        setValues();
    }

    private void initView()
    {
        mTextView=findViewById(R.id.textView);
        mButton=findViewById(R.id.nextButton);
    }

    private void setValues()
    {
        Intent intent = getIntent();
        String name = intent.getStringExtra("nameKey");
        mTextView.setText("Welcome, "+name+" !");

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SecondActivity.this, "Hello :)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
