package com.example.intents_lec01_postmid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class myListView extends AppCompatActivity {

    ArrayList<String> studentList = new ArrayList<String> ();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        studentList.add("Saad");
        studentList.add("Zahid");
        studentList.add("Saeed");
        studentList.add("Zainab");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, studentList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
}