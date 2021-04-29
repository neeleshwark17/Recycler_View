package com.assignment.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ObjectClass> objectClasses = new ArrayList<>();
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));
        objectClasses.add(new ObjectClass(R.drawable.ic_baseline_adb_24, "Harry Potter", "Nice Book"));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new Adapter(objectClasses);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}