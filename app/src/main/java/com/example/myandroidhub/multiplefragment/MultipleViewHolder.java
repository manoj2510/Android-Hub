package com.example.myandroidhub.multiplefragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

public class MultipleViewHolder extends RecyclerView.ViewHolder {

    TextView mName;
    LinearLayout mParentLayout;

    public MultipleViewHolder(@NonNull View itemView) {
        super(itemView);
        mName=itemView.findViewById(R.id.tv_name);
        mParentLayout=itemView.findViewById(R.id.name_recycler);
    }
}
