package com.example.myandroidhub.moviedetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.R;

import java.util.List;

public class MovieDetailsAdapter extends RecyclerView.Adapter<MovieDetailsViewHolder> {

    private List<MovieDetails> movieList;

    public MovieDetailsAdapter(List<MovieDetails> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_item_layout, parent, false);
        MovieDetailsViewHolder movieDetailsViewHolder = new MovieDetailsViewHolder(view);
        return movieDetailsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieDetailsViewHolder holder, int position) {
        holder.mImage.setBackgroundResource(movieList.get(position).getmMoviePoster());
        holder.mName.setText(movieList.get(position).getmMovieName());
        holder.mYear.setText(movieList.get(position).getmReleaseYear());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
