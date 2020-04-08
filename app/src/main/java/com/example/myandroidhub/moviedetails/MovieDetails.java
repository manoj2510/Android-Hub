package com.example.myandroidhub.moviedetails;

public class MovieDetails
{
    private int mMoviePoster;
    private String mMovieName;
    private String mReleaseYear;

    public int getmMoviePoster() {
        return mMoviePoster;
    }

    public String getmMovieName() {
        return mMovieName;
    }

    public String getmReleaseYear() {
        return mReleaseYear;
    }

    public MovieDetails(int mMoviePoster, String mMovieName, String mReleaseYear) {
        this.mMoviePoster = mMoviePoster;
        this.mMovieName = mMovieName;
        this.mReleaseYear = mReleaseYear;
    }
}
