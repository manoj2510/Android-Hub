package com.example.myandroidhub.screenrotate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myandroidhub.R;

public class RotateActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mButton;
    private final String TAG = "RotateActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        Log.d(TAG, "onCreate called");
        initView();
        setValues();
        
    }

    private void initView()
    {
        mEditText = findViewById(R.id.name);
        mButton = findViewById(R.id.bt_next);
    }

    private void setValues()
    {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(RotateActivity.this , SecondActivity.class);
                intent.putExtra("name", mEditText.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: called");
    }
}
