package com.example.intents_lec01_postmid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listview = findViewById(R.id.listView);
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student("mahnoor","1","se19",R.drawable.ic_launcher_background));
        arraylist.add(new Student("mahnoor","2","se19",R.drawable.ic_launcher_background));
        arraylist.add(new Student("mahnoor","3","se19",R.drawable.ic_launcher_background));
        arraylist.add(new Student("mahnoor","4","se19",R.drawable.ic_launcher_background));
        arraylist.add(new Student("mahnoor","5","se19",R.drawable.ic_launcher_background));
        customizedListView list = new customizedListView(this,0,arraylist);
    }
}