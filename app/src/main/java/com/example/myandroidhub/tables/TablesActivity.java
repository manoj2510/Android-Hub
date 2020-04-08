package com.example.myandroidhub.tables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myandroidhub.R;
import com.example.myandroidhub.calculator.OperationsActivity;

import java.util.ArrayList;
import java.util.List;

public class TablesActivity extends AppCompatActivity {

    RecyclerView mRecycler;
    private EditText mInput;
    private Button mSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        initView();
        setValues();
    }

    private void initView()
    {
        mRecycler=findViewById(R.id.table_recycler_view);
        mInput=findViewById(R.id.et_number);
        mSubmit=findViewById(R.id.bt_submit);

    }

    private List<String> loadData()
    {
        List<String> tables = new ArrayList<>();
        String number=mInput.getText().toString();
        if(number.equals(""))
        {
            return null;
        }
        String temp="";
        int num = Integer.parseInt(number);
        for(int i=1;i<=10;i++)
        {
            int res = i*num;
            temp= num+" x "+i+" = "+res;
            tables.add(temp);
        }
        return tables;
    }

    private void setValues()
    {
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRecycler.setVisibility(View.VISIBLE);
                List<String> data = loadData();
                if(data!=null  && data.size()>0) {
                    TablesAdapter tablesAdapter = new TablesAdapter(data);
                    mRecycler.setItemAnimator(new DefaultItemAnimator());
                    mRecycler.setLayoutManager(new LinearLayoutManager(TablesActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    mRecycler.setAdapter(tablesAdapter);
                }
                else
                    Toast.makeText(TablesActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
