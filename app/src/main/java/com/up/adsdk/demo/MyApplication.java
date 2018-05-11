package com.up.adsdk.demo;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.multidex.MultiDex;

import com.up.ads.UPAdsSdk;

/**
 * Created by Holaverse on 2017/3/30.
 */

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            MultiDex.install(this);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        UPAdsSdk.setDebuggable(true);
    }
}
