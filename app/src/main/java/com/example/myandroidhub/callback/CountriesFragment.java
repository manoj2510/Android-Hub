package com.example.myandroidhub.callback;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myandroidhub.R;

public class CountriesFragment extends Fragment {

    View rootView;
    Context context;

    String[] countries;
    ListView listViewCountries;
    ArrayAdapter<String> countriesAdapter;

    CallBackInterface callBackInterface;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_countries_fragment,container,false);
        initView();
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Select Country");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        callBackInterface = (CallBackInterface) getActivity();
    }

    public void setCallBackInterface(CallBackInterface callBackInterface)
    {
        this.callBackInterface = callBackInterface;
    }

    private void initView()
    {
        context = getContext();
        countries=getResources().getStringArray(R.array.countries);
        listViewCountries=rootView.findViewById(R.id.listViewCountries);
        countriesAdapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, countries);
        listViewCountries.setAdapter(countriesAdapter);

        listViewCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(callBackInterface != null) {
                    callBackInterface.callBackMethod(countries[position]);
                }
            }
        });
    }
}
