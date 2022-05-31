package com.example.intents_lec01_postmid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class myListView extends AppCompatActivity {

    ArrayList<String> studentList = new ArrayList<String> ();
    ListView listView;
    Button buttonTaskAdd;
    EditText editTextTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        buttonTaskAdd = findViewById(R.id.button7);
        editTextTask = findViewById(R.id.editText);
        studentList.add("Saad");
        studentList.add("Zahid");
        studentList.add("Saeed");
        studentList.add("Zainab");
        //sorting list view
        Collections.sort(studentList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, studentList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
        buttonTaskAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentList.add(editTextTask.getText().toString());

                //to notify chnge to the list to re render
                arrayAdapter.notifyDataSetChanged();
                Collections.sort(studentList);
            }
        });
        //deleteing the items from listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editTextTask.setText("You selected " + studentList.get(i));
                new AlertDialog.Builder(myListView.this)
                        .setTitle("Delete Recod")
                        .setMessage("Do you really want to deete this task!")
                        .setIcon(R.drawable.ic_launcher_background)
                        .setCancelable(false)
                        .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                studentList.remove(i);
                                arrayAdapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();
            }
        });
    }
}