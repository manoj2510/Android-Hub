package com.example.myandroidhub.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myandroidhub.R;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {

    private RecyclerView mRecycler;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initView();
        setValues();
    }

    private ArrayList<Student> loadData()
    {
        ArrayList<Student> studentDetails = myDb.displayAll();
        return  studentDetails;

    }

    private void initView()
    {
        mRecycler = findViewById(R.id.student_recycler);
        myDb = new DatabaseHelper(this);
    }

    private void setValues()
    {
        StudentAdapter studentAdapter = new StudentAdapter(loadData());
        mRecycler.setItemAnimator(new DefaultItemAnimator());
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapter(studentAdapter);
    }
}
