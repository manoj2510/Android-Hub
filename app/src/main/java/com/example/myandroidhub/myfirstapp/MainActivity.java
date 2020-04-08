package com.example.myandroidhub.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myandroidhub.R;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        setValues();
    }
    private void initView(){
        mButton=findViewById(R.id.next);
        mEditText=findViewById(R.id.input);
    }

    private void setValues(){
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("nameKey", name);
                startActivity(intent);
            }
        });
    }
}
