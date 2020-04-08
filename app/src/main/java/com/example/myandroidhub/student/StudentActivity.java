package com.example.myandroidhub.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myandroidhub.R;

public class StudentActivity extends AppCompatActivity {

    private Button mAddButton, mDisplayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        initView();
        setValues();
    }

    private void initView()
    {
        mAddButton = findViewById(R.id.bt_add_to_database);
        mDisplayButton=findViewById(R.id.bt_display_database);
    }

    private void setValues()
    {
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentActivity.this, AddToDatabaseActivity.class);
                startActivity(intent);
            }
        });

        mDisplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentActivity.this, DisplayActivity.class);
                startActivity(intent);
            }
        });

    }
}
