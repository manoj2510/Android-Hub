package com.example.myandroidhub.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myandroidhub.R;

public class IntentActivity extends AppCompatActivity {

    private EditText mText;
    private Button mShareButton;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        initView();
        setValues();
    }

    private void initView() {
        mText = findViewById(R.id.et_intent_message);
        mShareButton = findViewById(R.id.bt_share);
    }

    private void setValues() {

        mShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = mText.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        str);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }
}
