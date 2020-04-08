package com.example.myandroidhub.galleryimage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myandroidhub.R;

public class GalleryActivity extends AppCompatActivity {

    private ImageView mImageView;
    private Button mChooseButton;

    private static final int IMAGE_PICK_CODE=1000;
    private static final int PERMISSION_CODE=1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        initView();
        setValues();
    }

    private void initView() {
        mImageView = findViewById(R.id.image_view);
        mChooseButton = findViewById(R.id.choose_image_button);
    }

    private void setValues() {
        mChooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT > Build.VERSION_CODES.M)
                {
                    if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED)
                    {
                        //permission not granted
                        String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        //show popup for run-time permission
                        requestPermissions(permissions, PERMISSION_CODE);
                    }
                    else
                    {
                        pickImageFromGallery();
                    }
                }
                else
                {
                    pickImageFromGallery();
                }

            }
        });
    }
    private void pickImageFromGallery() {
        //intent to pick image
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,IMAGE_PICK_CODE);
    }

    //handle result of runtime permission
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode)
        {
            case PERMISSION_CODE:{
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED)
                {
                    //permission was granted
                    pickImageFromGallery();
                }
                else
                {
                    Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE) {
            //set image to image view
            mImageView.setImageURI(data.getData());

        }
    }
}
