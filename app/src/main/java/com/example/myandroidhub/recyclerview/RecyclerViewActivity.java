package com.example.myandroidhub.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myandroidhub.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initView();
        setValues();

    }

    private void initView()
    {
        mRecyclerView = findViewById(R.id.recycler_view);
    }

    private List<String> loaddata()
    {
        List<String> mDataList = new ArrayList<>();
        mDataList.add("One");
        mDataList.add("Two");
        mDataList.add("Three");
        mDataList.add("Four");
        mDataList.add("Five");
        mDataList.add("Six");
        mDataList.add("Seven");
        mDataList.add("Eight");
        mDataList.add("Nine");
        mDataList.add("Ten");
        mDataList.add("One");
        mDataList.add("Two");
        mDataList.add("Three");
        mDataList.add("Four");
        mDataList.add("Five");
        mDataList.add("Six");
        mDataList.add("Seven");
        mDataList.add("Eight");
        mDataList.add("Nine");
        mDataList.add("Ten");
        mDataList.add("One");
        mDataList.add("Two");
        mDataList.add("Three");
        mDataList.add("Four");
        mDataList.add("Five");
        mDataList.add("Six");
        mDataList.add("Seven");
        mDataList.add("Eight");
        mDataList.add("Nine");
        mDataList.add("Ten");
        return mDataList;
    }

    private void setValues()
    {
        CountAdapter countAdapter = new CountAdapter(loaddata());
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
//        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mRecyclerView.setAdapter(countAdapter);
    }
}
