package com.example.myandroidhub.tables;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import java.util.List;

public class TablesAdapter extends RecyclerView.Adapter<TablesViewHolder> {

    private List<String> tables;

    public TablesAdapter(List<String> tables) {
        this.tables = tables;
    }

    @NonNull
    @Override
    public TablesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.tables_layout,parent,false);
        TablesViewHolder tablesViewHolder = new TablesViewHolder(view);
        return tablesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TablesViewHolder holder, int position) {
        holder.mTables.setText(tables.get(position));

    }

    @Override
    public int getItemCount() {
        return tables.size();
    }
}
