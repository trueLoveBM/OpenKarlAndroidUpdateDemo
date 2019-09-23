package com.karl.openkarlandroidupdatedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.karl.openkarlandroid_update.FUpdateModule;
import com.karl.openkarlandroid_update.FUpdateUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FUpdateModule.initModule(this);
        FUpdateModule.setServerAddress("http://39.104.162.168:8080/appmanager");
        FUpdateModule.setApkKey("85068642-fa90-4ce8-bfa9-67a284914807");
        new Thread(){
            @Override
            public void run() {
                FUpdateUtils.TestMethod();
            }
        }.start();

    }
}
