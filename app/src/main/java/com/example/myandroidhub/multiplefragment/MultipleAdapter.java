package com.example.myandroidhub.multiplefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import java.util.ArrayList;

public class MultipleAdapter extends RecyclerView.Adapter<MultipleViewHolder> {

    private ArrayList<String> names;
    private Context context;

    public MultipleAdapter(ArrayList<String> names, Context context) {
        this.names = names;
        this.context = context;
    }

    @NonNull
    @Override
    public MultipleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.name_recycler,parent,false);
        MultipleViewHolder multipleViewHolder = new MultipleViewHolder(view);
        return multipleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MultipleViewHolder holder, final int position) {
        holder.mName.setText(names.get(position));
        /*holder.mName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int index = position;
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
