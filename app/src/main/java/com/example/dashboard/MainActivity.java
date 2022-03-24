package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaticRVAdapter staticRVAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<StaticRVModel> item = new ArrayList<>();
        item.add(new StaticRVModel(R.drawable.pakistan, "Pakistan"));
        item.add(new StaticRVModel(R.drawable.afghanistan, "Afghanistan"));
        item.add(new StaticRVModel(R.drawable.bangladesh, "Bangladesh"));
        item.add(new StaticRVModel(R.drawable.canada, "Canada"));
        item.add(new StaticRVModel(R.drawable.china, "China"));
        item.add(new StaticRVModel(R.drawable.iran, "Iran"));
        item.add(new StaticRVModel(R.drawable.spain, "Spain"));
        item.add(new StaticRVModel(R.drawable.switzerland, "Switzerland"));
        item.add(new StaticRVModel(R.drawable.turkey, "Turkey"));

        recyclerView = findViewById(R.id.recycler_1);
        staticRVAdapter = new StaticRVAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(staticRVAdapter);
    }
}