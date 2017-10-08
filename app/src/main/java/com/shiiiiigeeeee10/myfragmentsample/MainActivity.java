package com.shiiiiigeeeee10.myfragmentsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shiiiiigeeeee10.myfragmentsample.dummy.DummyContent;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ItemFragment.OnListFragmentInteractionListener mListener;

    private String[] myDataset = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        for (int i = 0; i < myDataset.length; i++) {
            myDataset[i] = "Data_0" + String.valueOf(i);
        }

        mAdapter = new MyItemRecyclerViewAdapter(DummyContent.ITEMS, mListener);
        mRecyclerView.setAdapter(mAdapter);
    }
}
