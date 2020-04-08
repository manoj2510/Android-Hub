package com.example.myandroidhub.multiplefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myandroidhub.R;

import java.util.ArrayList;
import java.util.List;

public class MultipleActivity extends AppCompatActivity {

    RecyclerView mRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);
        initView();
        setValues();
    }

    private void initView()
    {
        mRecycler=findViewById(R.id.recycler_view_names);
    }

    private ArrayList<String> loadData()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Manoj");
        names.add("Bharath");
        names.add("Akash");
        names.add("Charan");
        names.add("sharath");
        names.add("gokul");
        names.add("Arnab");
        names.add("Kushal");
        names.add("Ayush");
        return names;
    }
    private void setValues()
    {
        MultipleAdapter multipleAdapter = new MultipleAdapter(loadData(),MultipleActivity.this);
        mRecycler.setItemAnimator(new DefaultItemAnimator());
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapter(multipleAdapter);
    }
}
