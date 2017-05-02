package com.example.licht.logactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Licht on 2017/4/15.
 */

public class Log2 extends Activity{
        private static final String LIFT_TAG="Activity";
        protected  void onCreate(Bundle savedInstanceState){
            Log.v(MainActivity.LIFT_TAG,"SecondActivity--->onCreate");
            super.onCreate(savedInstanceState);
        }
        protected void onDestroy() {
            // TODO Auto-generated method stub
            Log.v(MainActivity.LIFT_TAG,"SecondActivity --->onDestory");
            super.onDestroy();
        }

        @Override
        protected void onPause() {
            // TODO Auto-generated method stub
            Log.v(MainActivity.LIFT_TAG, "SecondActivity --->onPause");
            super.onPause();
        }

        @Override
        protected void onRestart() {
            // TODO Auto-generated method stub
            Log.v(MainActivity.LIFT_TAG, "SecondActivity --->onRestart");
            super.onRestart();
        }

        @Override
        protected void onResume() {
            // TODO Auto-generated method stub
            Log.v(MainActivity.LIFT_TAG, "SecondActivity --->onResume");
            super.onResume();
        }

        @Override
        protected void onStart() {
            // TODO Auto-generated method stub
            Log.v(MainActivity.LIFT_TAG, "SecondActivity --->onStart");
            super.onStart();
        }

        @Override
        protected void onStop() {
            // TODO Auto-generated method stub
            Log.v(MainActivity.LIFT_TAG, "SecondActivity --->onStop");
            super.onStop();
        }

}
