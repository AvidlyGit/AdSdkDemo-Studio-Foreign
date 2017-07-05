package com.avidly.adsdk.demo;

import android.app.Application;

import com.avidly.ads.AvidlyAdsSdk;

/**
 * Created by Holaverse on 2017/3/30.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AvidlyAdsSdk.init(getApplicationContext());
        AvidlyAdsSdk.setDebuggable(true);
    }
}
