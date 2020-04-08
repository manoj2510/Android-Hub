package com.example.myandroidhub.backstack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myandroidhub.R;

public class BackstackActivity extends AppCompatActivity {

    private static final String TAG = BackstackActivity.class.getSimpleName();

    private Button buttonAddFragment;
    private TextView textViewFragmentCount;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backstack);
        initView();
        setValues();
    }

    private void initView()
    {
        buttonAddFragment = findViewById(R.id.buttonAddFragment);
        textViewFragmentCount = findViewById(R.id.textViewFragmentCount);

        fragmentManager=getSupportFragmentManager();
    }

    private void setValues()
    {
        textViewFragmentCount.setText("Fragment count in back stack: "+fragmentManager.getBackStackEntryCount());

        fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                textViewFragmentCount.setText("Fragment count in back stack: "+fragmentManager.getBackStackEntryCount());
            }
        });

        buttonAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment();
            }
        });
    }

    private void addFragment(){
        Fragment fragment;
        /*switch (fragmentManager.getBackStackEntryCount()){
            case 0: fragment = new SampleFragment(); break;
            case 1: fragment = new SecondFragment();break;
            case 2: fragment = new ThirdFragment(); break;
            default: fragment = new SampleFragment(); break;
        }*/
        fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        if(fragment instanceof SampleFragment)
            fragment = new SecondFragment();
        else if(fragment instanceof SecondFragment)
            fragment = new ThirdFragment();
        else if(fragment instanceof  ThirdFragment)
            fragment = new SampleFragment();
        else
            fragment = new SampleFragment();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer,fragment,"demofragment");
//        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        if(fragment!=null)
        {
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragment);
            fragmentTransaction.commit();
        }
        else {
            super.onBackPressed();
        }
    }
}
