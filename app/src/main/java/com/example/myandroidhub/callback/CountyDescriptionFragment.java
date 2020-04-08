package com.example.myandroidhub.callback;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myandroidhub.R;

public class CountyDescriptionFragment extends Fragment {

    View rootView;
    TextView mTextView;

    String countryName;
    String countryDescription;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_county_description_fragment,container,false);
        initView();
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState!=null)
        {
            countryName=savedInstanceState.getString("selectedCountry",countryName);
            countryDescription=getString(getStringID(countryName));
        }
        else {
            Bundle bundle = getArguments();
            countryName = bundle.getString(CallBackInterface.KEY_SELECTED_COUNTRY, "India");
            countryDescription = getString(getStringID(countryName));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(countryName);
        mTextView.setText(countryDescription);
    }

    private void initView()
    {
        mTextView = rootView.findViewById(R.id.tv_coutry_desc);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("selectedCountry",countryName);
    }

    private int getStringID(String countryName)
    {
        if(countryName.equals("India")) {
            return R.string.India;
        }else if(countryName.equals("USA")) {
            return R.string.USA;
        }else if(countryName.equals("China")) {
            return R.string.China;
        }else if(countryName.equals("Australia")) {
            return R.string.Australia;
        }else if(countryName.equals("Brazil")) {
            return R.string.Brazil;
        }else if(countryName.equals("Bangladesh")) {
            return R.string.Bangladesh;
        }else if(countryName.equals("Canada")) {
            return R.string.Canada;
        }else if(countryName.equals("Malaysia")) {
            return R.string.Malaysia;
        }else
        {
            return R.string.India;
        }
    }
}
