package com.tweak.activitylifecycle;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast toast=Toast.makeText(this, "second activity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);

    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast toast=Toast.makeText(this,"Second onStart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast toast=Toast.makeText(this,"Second onResume", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast toast=Toast.makeText(this,"Second onPause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast toast=Toast.makeText(this,"Second onStop", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast=Toast.makeText(this,"Second onRestart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast=Toast.makeText(this,"Second onDestroy", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

}