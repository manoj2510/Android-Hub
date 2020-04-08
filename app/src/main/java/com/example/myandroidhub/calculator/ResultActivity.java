package com.example.myandroidhub.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myandroidhub.R;

public class ResultActivity extends AppCompatActivity {

    private TextView mSum;
    private TextView mDiff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initView();
        setValues();
    }

    private void initView(){
        mSum=findViewById(R.id.sum);
        mDiff=findViewById(R.id.diff);
    }

    private void setValues() {
        Intent intent = getIntent();
        int sum=intent.getIntExtra("sumKey",0);
        int diff=intent.getIntExtra("diffKey",0);

        mSum.setText("Sum: "+sum);
        mDiff.setText("Difference: " +diff);

    }
}
