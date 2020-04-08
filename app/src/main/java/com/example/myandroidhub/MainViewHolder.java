package com.example.myandroidhub;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    Button mButton;
    LinearLayout mLayout;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        mButton=itemView.findViewById(R.id.bt_main_button);
        mLayout=itemView.findViewById(R.id.button_layout);
    }
}
