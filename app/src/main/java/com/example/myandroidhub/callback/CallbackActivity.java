package com.example.myandroidhub.callback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import com.example.myandroidhub.R;

public class CallbackActivity extends AppCompatActivity implements CallBackInterface{

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    String selectedCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callback);
        fragmentManager = getSupportFragmentManager();
        if(findViewById(R.id.portrait)!=null){
            if(savedInstanceState==null){
                addCountriesFragment();
            } else{
                addCountryDescriptionFragment(savedInstanceState.getString("selectedCountry",null));
            }
        }else if(findViewById(R.id.landscape)!=null){
            addCountriesFragment();
            if(savedInstanceState==null){
                addCountryDescriptionFragment(R.id.fragmentContainer2,"India");
            } else{
                addCountryDescriptionFragment(R.id.fragmentContainer2,savedInstanceState.getString("selectedCountry",null));
            }
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("selectedCountry",selectedCountry);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        selectedCountry=savedInstanceState.getString("selectedCountry","India");
    }

    private void addCountriesFragment()
    {
        fragmentTransaction = fragmentManager.beginTransaction();

        CountriesFragment countriesFragment = new CountriesFragment();
        countriesFragment.setCallBackInterface(this);

        fragmentTransaction.add(R.id.fragmentContainer,countriesFragment);
        fragmentTransaction.commit();
    }

    private void addCountryDescriptionFragment(String countryName)
    {
        fragmentTransaction= fragmentManager.beginTransaction();

        CountyDescriptionFragment countyDescriptionFragment = new CountyDescriptionFragment();

        Bundle bundle=new Bundle();
        bundle.putString(CallBackInterface.KEY_SELECTED_COUNTRY,countryName);
        countyDescriptionFragment.setArguments(bundle);

        fragmentTransaction.replace(R.id.fragmentContainer,countyDescriptionFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void addCountryDescriptionFragment(int fragmentContainerId, String countryName)
    {
        fragmentTransaction= fragmentManager.beginTransaction();

        CountyDescriptionFragment countyDescriptionFragment = new CountyDescriptionFragment();

        Bundle bundle=new Bundle();
        bundle.putString(CallBackInterface.KEY_SELECTED_COUNTRY,countryName);
        countyDescriptionFragment.setArguments(bundle);

        fragmentTransaction.replace(fragmentContainerId,countyDescriptionFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void callBackMethod(String country) {
        selectedCountry = country;
        if(findViewById(R.id.landscape)==null)
        {
            addCountryDescriptionFragment(country);
        }
        else
        {
            addCountryDescriptionFragment(R.id.fragmentContainer2,country);
        }

    }
}
