package com.example.myandroidhub.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myandroidhub.R;

public class AddToDatabaseActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    private EditText mStudentName, mStudentSurname, mStudentMarks;
    private Button mAddStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_database);
        myDb = new DatabaseHelper(this);
        initView();
        setValues();
    }

    private void initView()
    {
        mStudentName=findViewById(R.id.et_student_name);
        mStudentSurname=findViewById(R.id.et_student_surname);
        mStudentMarks=findViewById(R.id.et_student_marks);
        mAddStudent = findViewById(R.id.bt_student_activity_add);
    }

    private void setValues()
    {
        mAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(mStudentName.getText().toString(),mStudentSurname.getText().toString(),mStudentMarks.getText().toString());
                if(isInserted) {
                    Toast.makeText(AddToDatabaseActivity.this, "Data inserted", Toast.LENGTH_SHORT).show();
                    finish();
                }

                else {
                    Toast.makeText(AddToDatabaseActivity.this, "Data insertion unsuccessful", Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        });


    }
}
