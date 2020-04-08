package com.example.myandroidhub.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myandroidhub.R;

public class SharedActivity extends AppCompatActivity {

    private EditText mUserNameEditText, mEmailEditText, mPhoneNumberEditText;
    private Button mSaveButton, mRetrieveButton;
    public static final String MY_PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        initView();
        setValues();
    }

    private void initView() {

        mUserNameEditText = findViewById(R.id.et_user_name);
        mEmailEditText = findViewById(R.id.et_email);
        mPhoneNumberEditText = findViewById(R.id.et_phone_number);
        mSaveButton = findViewById(R.id.bt_save_data);
        mRetrieveButton = findViewById(R.id.bt_retrieve_data);
    }

    private void setValues() {

        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = mUserNameEditText.getText().toString();
                String email = mEmailEditText.getText().toString();
                String num = mPhoneNumberEditText.getText().toString();
                long number = Long.parseLong(num);
                saveData(username, email, number);
                Toast.makeText(SharedActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();
                mUserNameEditText.setText("");
                mEmailEditText.setText("");
                mPhoneNumberEditText.setText("");

            }
        });


        mRetrieveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retrieveData();
            }
        });
    }

    private void saveData(String username, String email, long number) {
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putString("user_name", username);
        editor.putString("email_id", email);
        editor.putLong("phone_number", number);
        editor.apply();
    }

    private void retrieveData() {
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String name = prefs.getString("user_name", "No name!");
        String email = prefs.getString("email_id", "No email");
        String number = String.valueOf(prefs.getLong("phone_number", -1));
        Toast.makeText(SharedActivity.this, name+" "+email+" "+number, Toast.LENGTH_SHORT).show();
    }
}
