package com.example.myandroidhub.androidteamrecycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class AndroidTeamViewHolder extends RecyclerView.ViewHolder {
    ImageView mProfileImage;
    TextView mName;
    TextView mAge;
    TextView mHobby;
    LinearLayout mParentLayout;


    public AndroidTeamViewHolder(@NonNull View itemView) {
        super(itemView);
        mProfileImage = itemView.findViewById(R.id.profile_pic);
        mName = itemView.findViewById(R.id.name);
        mAge = itemView.findViewById(R.id.age);
        mHobby = itemView.findViewById(R.id.hobby);
        mParentLayout = itemView.findViewById(R.id.parent_layout);
    }
}
