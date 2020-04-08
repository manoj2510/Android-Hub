package com.example.myandroidhub.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

public class CountViewHolder extends RecyclerView.ViewHolder
{
    TextView mCountTextView;

    public CountViewHolder(@NonNull View itemView) {
        super(itemView);
        mCountTextView=itemView.findViewById(R.id.tv_count);
    }
}
