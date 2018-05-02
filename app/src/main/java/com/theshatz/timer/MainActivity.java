package com.theshatz.timer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //could also use countdown timer
        //10 seconds to ping every second
        /*
        new CountDownTimer(10000,1000){
            public void onTick(long, millisecondUntilDone){
            //every second
            }
            public void onFinish(){
            after 10 seconds
            }.start()

        */
        //final must be used since it is used inside class.
        final Handler handler= new Handler();
        //Allows chunks of code to be handled in a delayed way.
        Runnable run=new Runnable() {
            @Override
            public void run() {
                //insert code to be run every second

                //Handler tells what to do every second
                handler.postDelayed(this,1000);
            }
        };
        //execute runnable at start
        handler.post(run);
    }
}
