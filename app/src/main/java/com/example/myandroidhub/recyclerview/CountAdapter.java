package com.example.myandroidhub.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import java.util.List;

public class CountAdapter extends RecyclerView.Adapter<CountViewHolder>
{
    private List<String> mCountList;

    public CountAdapter(List<String> mCountList) {
        this.mCountList = mCountList;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listitem = layoutInflater.inflate(R.layout.count_list_item,parent,false);
        CountViewHolder countViewHolder = new CountViewHolder(listitem);
        return countViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.mCountTextView.setText(mCountList.get(position));
    }

    @Override
    public int getItemCount() {
        return mCountList.size();
    }
}
