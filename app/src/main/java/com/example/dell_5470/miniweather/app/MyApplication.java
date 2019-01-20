package com.example.dell_5470.miniweather.app;


import android.app.Application;
import android.util.Log;
public class MyApplication extends Application{
    private static final String TAG="MyApp";
    private static MyApplication mApplication;
    @Override
    public void onCreate(){
super.onCreate();
Log.d(TAG,"MyApplication->Oncreate");
        mApplication = this;

    }
    public static MyApplication getInstance(){
        return mApplication;
    }

}
