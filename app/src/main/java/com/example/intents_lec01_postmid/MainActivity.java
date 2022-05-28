package com.example.intents_lec01_postmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//intent is sort of event handling
//not event but help to trigger events

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button btn1;
    Button b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("acl1","oncreate");
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button4);
        b3 = findViewById(R.id.button5);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:+923001234567");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("txt","txt from 1st screen");
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action send is to send data from one activity to other
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                //tell that only email apps will open it
                intent.setData(Uri.parse("mailto:"));
                //add email of receiver
                intent.putExtra(Intent.EXTRA_EMAIL, "bsef19m012@pucit.edu.pk");
                //add subject of email
                intent.putExtra(Intent.EXTRA_SUBJECT, "test");
                //skiping this step will crash the app if no one is present to handle your intent
                //if an app exist to handle email intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "No app to handle email intent!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }

    @Override
    protected  void onStart()
    {
        super.onStart();
        Log.d("acl1","onstart");
    }

    @Override
    protected  void onResume()
    {
        super.onResume();
        Log.d("acl1","onresume");
    }


    @Override
    protected  void onPause()
    {
        super.onPause();
        Log.d("acl1","onpause");
    }
    @Override
    protected  void onStop()
    {
        super.onStop();
        Log.d("acl1","onSTOP");
    }
    @Override
    protected  void onRestart()
    {
        super.onRestart();
        Log.d("acl1","onrestart");
    }
}