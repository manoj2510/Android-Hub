package com.example.myandroidhub.moviedetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MovieDetailsViewHolder extends RecyclerView.ViewHolder {

    CircleImageView mImage;
    TextView mName;
    TextView mYear;
    LinearLayout mParentLayout;

    public MovieDetailsViewHolder(@NonNull View itemView) {
        super(itemView);
        mImage=itemView.findViewById(R.id.movie_poster);
        mName=itemView.findViewById(R.id.tv_movie_name);
        mYear=itemView.findViewById(R.id.tv_release_date);
        mParentLayout=itemView.findViewById(R.id.parent_layout);
    }
}
