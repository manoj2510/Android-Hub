package com.example.myandroidhub.moviedetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myandroidhub.R;

import java.util.ArrayList;
import java.util.List;

public class MovieDetailsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        initView();
        setValues();
    }

    private void initView()
    {
        recyclerView=findViewById(R.id.movie_recycler_view);
    }

    private List<MovieDetails> loadData()
    {
        List<MovieDetails> mMovieDetails = new ArrayList<>();

        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        mMovieDetails.add(new MovieDetails(R.mipmap.ic_launcher,"Joker","2019"));
        return mMovieDetails;
    }

    private void setValues()
    {
        MovieDetailsAdapter movieDetailsAdapter = new MovieDetailsAdapter(loadData());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(movieDetailsAdapter);
    }
}
