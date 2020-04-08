package com.example.myandroidhub;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mMainRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initView();
        setValues();
    }

    private void initView() {
        mMainRecycler = findViewById(R.id.recycler);
    }

    private List<String> loadData() {
        List<String> buttons = new ArrayList<>();
        buttons.add("Intent");
        buttons.add("Calculator");
        buttons.add("relative layout");
        buttons.add("frame layout");
        buttons.add("recycler view");
        buttons.add("android team");
        buttons.add("movie details");
        buttons.add("tables");
        buttons.add("Rotate");
        buttons.add("Shared Preferences");
        buttons.add("Picasso");
        buttons.add("Fragment");
        buttons.add("Backstack");
        buttons.add("Callbacks");
        buttons.add("Student");
//        buttons.add("Multiple");
        buttons.add("permission");
        buttons.add("Camera");
        buttons.add("Gallery");
        buttons.add("Location");
        buttons.add("Share Intent");
        buttons.add("Snackbar");
        buttons.add("Webview");
        return buttons;
    }

    private void setValues() {
        MainAdapter mainAdapter = new MainAdapter(loadData(), MainActivity.this);
        mMainRecycler.setItemAnimator(new DefaultItemAnimator());
        mMainRecycler.setLayoutManager(new LinearLayoutManager(this));
        mMainRecycler.setAdapter(mainAdapter);
    }
}
