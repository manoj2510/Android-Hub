package com.example.myandroidhub.androidteamrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import java.util.ArrayList;
import java.util.List;

public class AndroidTeamAdapter extends RecyclerView.Adapter<AndroidTeamViewHolder> {

    private List<TeamMemberDetails> detailsList = new ArrayList<>();

    public AndroidTeamAdapter(List<TeamMemberDetails> detailsList) {
        this.detailsList = detailsList;
    }

    @NonNull
    @Override
    public AndroidTeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View memberlist = layoutInflater.inflate(R.layout.android_team_item, parent, false);
        AndroidTeamViewHolder androidTeamViewHolder = new AndroidTeamViewHolder(memberlist);
        return androidTeamViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidTeamViewHolder holder, int position) {
        holder.mProfileImage.setBackgroundResource(detailsList.get(position).getImageURL());
        holder.mName.setText(detailsList.get(position).getEmpName());
        holder.mAge.setText(detailsList.get(position).getEmpAge());
        holder.mHobby.setText(detailsList.get(position).getEmpHobby());

    }

    @Override
    public int getItemCount() {
        return detailsList.size();
    }
}
