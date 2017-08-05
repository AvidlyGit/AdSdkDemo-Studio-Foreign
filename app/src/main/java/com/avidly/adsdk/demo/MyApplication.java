package com.avidly.adsdk.demo;

import android.support.multidex.MultiDexApplication;

import com.avidly.ads.AvidlyAdsSdk;

/**
 * Created by Holaverse on 2017/3/30.
 */

public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        AvidlyAdsSdk.init(getApplicationContext());
        AvidlyAdsSdk.setDebuggable(true);
    }
}
