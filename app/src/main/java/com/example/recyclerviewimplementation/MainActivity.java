// MainActivity.java
package com.example.myrecyclerviewapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewimplementation.R;

public class MainActivity extends AppCompatActivity {

    String[] myDataset = {"Apple", "Banana", "Orange", "Grape", "Strawberry", "Mango",
            "Pineapple", "Kiwi", "Blueberry", "Raspberry", "Lemon",
            "Lime", "Cherry", "Peach", "Plum"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get RecyclerView reference
        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);

        // Set LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Set Adapter
        MyAdapter adapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(adapter);
    }
}
