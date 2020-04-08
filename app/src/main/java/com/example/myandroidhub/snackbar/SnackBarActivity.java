package com.example.myandroidhub.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myandroidhub.R;
import com.google.android.material.snackbar.Snackbar;

public class SnackBarActivity extends AppCompatActivity {

    private Button mSnackBarButton;
    private CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        initView();
        setValues();
    }

    private void initView() {
        mSnackBarButton = findViewById(R.id.bt_show_snackbar);
        mCoordinatorLayout = findViewById(R.id.coordinatorLayout);
    }

    private void setValues() {
        mSnackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
            }
        });
    }

    private void showSnackBar()
    {
        Snackbar snackbar = Snackbar.make(mCoordinatorLayout,"This is a snackbar",Snackbar.LENGTH_INDEFINITE);
        snackbar.show();
    }

}
