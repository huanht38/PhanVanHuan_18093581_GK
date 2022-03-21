package com.example.phanvanhuan_18093581_gk;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private List<Cycle> cycleList;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=(ListView) findViewById(R.id.listView);
        cycleList= new ArrayList<>();
        cycleList.add(new Cycle(1,"Red Bull One","Free Ship",449));
        cycleList.add(new Cycle(2,"Pink Donut","Spicy tasty donut family",840));
        CycleAdapter adapter = new CycleAdapter(this,R.layout.item, cycleList);
        listView.setAdapter(adapter);

    }

}
