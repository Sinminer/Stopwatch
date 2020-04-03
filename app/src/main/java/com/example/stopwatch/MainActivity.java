package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    boolean isRunning;
    Stopwatch stopwatch;
    Button toggle;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle = findViewById(R.id.toggle);
        display = findViewById(R.id.display);
        isRunning = false;
        if (savedInstanceState == null){
            stopwatch = new Stopwatch();
        }else {
            stopwatch = new Stopwatch();
        }
    }
    private void buttonClicked(){
        if (isRunning = false){
            enableStopwatch();
        }
    }
    private void enableStopwatch(){
        isRunning = true;
        handler = new Handler();
        handler.post(new Runnable() {
        @Override
        public void run() {
            if (isRunning = true){
                stopwatch.tick();
            }
        }
    });
    }
}
