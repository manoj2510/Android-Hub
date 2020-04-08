package com.example.myandroidhub.CameraApp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myandroidhub.R;

public class CameraActivity extends AppCompatActivity {

    private Button mClickButton;
    private ImageView mImage;
    private static final int REQUEST_IMAGE_CAPTURE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        initView();
        setValues();
    }

    private void initView() {
        mClickButton = findViewById(R.id.bt_click_picture);
        mImage=findViewById(R.id.camera_image);
    }

    private void setValues() {
        mClickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if(intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = data.getExtras();
        Bitmap imageBitmap = (Bitmap) bundle.get("data");
        mImage.setImageBitmap(imageBitmap);

    }
}
