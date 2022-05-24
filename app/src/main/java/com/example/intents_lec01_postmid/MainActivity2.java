package com.example.intents_lec01_postmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("acl1","oncreate2");
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.button3);
        t = findViewById(R.id.txt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                Intent i = new Intent();
                t.setText(i.getStringExtra("txt"));
                startActivity(intent);
            }
        });
    }

    @Override
    protected  void onStart()
    {
        super.onStart();
        Log.d("acl1","onstart2");
    }

    @Override
    protected  void onResume()
    {
        super.onResume();
        Log.d("acl1","onresume2");
    }


    @Override
    protected  void onPause()
    {
        super.onPause();
        Log.d("acl1","onpause2");
    }
    @Override
    protected  void onStop()
    {
        super.onStop();
        Log.d("acl1","onSTOP2");
    }

    @Override
    protected  void onRestart()
    {
        super.onRestart();
        Log.d("acl1","onrestart2");
    }
}


//acitivity life cycle
//onCreate
//onStart
//onResume
//onPause
//onStop
//onDestroy
//onRestart
//each new activity wil be created started and resumed.
//at resume it will be displayed to the user
//when user move to new activity it will go to pause
//new will sart from create.
//and when second will be visible first will go to stop state