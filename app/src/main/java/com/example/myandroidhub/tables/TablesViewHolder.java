package com.example.myandroidhub.tables;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

public class TablesViewHolder extends RecyclerView.ViewHolder {

    TextView mTables;
    LinearLayout mTableLayout;

    public TablesViewHolder(@NonNull View itemView) {
        super(itemView);
        mTables=itemView.findViewById(R.id.tv_tables);
        mTableLayout=itemView.findViewById(R.id.table_layout);
    }
}
