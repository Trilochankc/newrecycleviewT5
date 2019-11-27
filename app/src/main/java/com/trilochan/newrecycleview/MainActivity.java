package com.trilochan.newrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        List<Students>studentsList = new ArrayList<>();
        studentsList.add(new Students("Trilochan", "bkt", 12, R.drawable.male));

        StudentsAdapter studentsAdapter = new StudentsAdapter(this, studentsList);
        recyclerView.setAdapter(studentsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
