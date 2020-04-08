package com.example.myandroidhub.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myandroidhub.R;

public class OperationsActivity extends AppCompatActivity {

    private EditText mNumber1;
    private EditText mNumber2;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations);
        initView();
        setValues();
    }

    private void initView() {
        mNumber1=findViewById(R.id.num1);
        mNumber2=findViewById(R.id.num2);
        mButton=findViewById(R.id.calculate);
    }

    private void setValues() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = mNumber1.getText().toString();
                String n2 = mNumber2.getText().toString();
                if(n1.equals(""))
                {
                    Toast.makeText(OperationsActivity.this, "Enter Number 1", Toast.LENGTH_SHORT).show();
                    return;
                }
                int num1 =Integer.parseInt(n1);
                if(n2.equals(""))
                {
                    Toast.makeText(OperationsActivity.this, "Enter Number 2", Toast.LENGTH_SHORT).show();
                    return;
                }
                int num2 = Integer.parseInt(n2);
                int sum = num1+num2;
                int diff=num1-num2;


                Intent intent = new Intent(OperationsActivity.this, ResultActivity.class);
                intent.putExtra("sumKey",sum);
                intent.putExtra("diffKey",diff);
                startActivity(intent);
            }
        });
    }
}
