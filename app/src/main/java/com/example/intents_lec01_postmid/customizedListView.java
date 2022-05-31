package com.example.intents_lec01_postmid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class customizedListView extends ArrayAdapter<Student> {

    public customizedListView(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Student student = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_view,parent,
                false);
        TextView name = convertView.findViewById(R.id.textView);
        TextView id = convertView.findViewById(R.id.textView2);
        TextView section = convertView.findViewById(R.id.textView3);
        ImageView imgview = convertView.findViewById(R.id.imageView);
        name.setText(student.getName());
        id.setText(student.getId());
        section.setText(student.getSection());
        return convertView;
    }
}

//LayoutInflater inflater=context.getLayoutInflater();
//inflate means hawa bharna