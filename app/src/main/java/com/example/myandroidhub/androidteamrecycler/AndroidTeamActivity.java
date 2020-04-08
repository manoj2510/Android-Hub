package com.example.myandroidhub.androidteamrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myandroidhub.R;

import java.util.ArrayList;
import java.util.List;

public class AndroidTeamActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_team);
        initView();
        setValues();
    }

    private void initView()
    {
        mRecyclerView = findViewById(R.id.team_recycler_view);
    }

    private List<TeamMemberDetails> loadData()
    {
        List<TeamMemberDetails> mTeamList = new ArrayList<>();

        mTeamList.add(new TeamMemberDetails(R.drawable.photograph,"Manoj","22","Travelling"));
        mTeamList.add(new TeamMemberDetails(R.mipmap.ic_launcher,"Shubham","22","Writing"));
        mTeamList.add(new TeamMemberDetails(R.mipmap.ic_launcher,"Niraj","22","Chess"));
        mTeamList.add(new TeamMemberDetails(R.mipmap.ic_launcher,"Archana","22","Curator"));
        mTeamList.add(new TeamMemberDetails(R.mipmap.ic_launcher,"Aishwarya","22","Music"));
        return mTeamList;
    }

    private void setValues()
    {
        AndroidTeamAdapter androidTeamAdapter = new AndroidTeamAdapter(loadData());
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(androidTeamAdapter);
    }
}
