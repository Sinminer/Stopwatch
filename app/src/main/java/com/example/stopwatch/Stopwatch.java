package com.example.stopwatch;

import android.widget.TextView;

public class Stopwatch{
        TextView textView;
        private int hours;
        private int minutes;
        private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void tick() {
            seconds++;
            if (seconds == 60){
                minutes++;
            }
            if (minutes == 60){
                hours++;
            }
            textView.setText("" + hours + minutes + seconds);
        }
}

