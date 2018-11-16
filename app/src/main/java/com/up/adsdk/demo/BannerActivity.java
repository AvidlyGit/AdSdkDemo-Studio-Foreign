package com.up.adsdk.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.up.ads.UPBannerAd;
import com.up.ads.wrapper.banner.UPBannerAdListener;

public class BannerActivity extends Activity {
    private static final String TAG = "AdsSdk_demo";

    LinearLayout banner_container;
    UPBannerAd mBannerAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        mBannerAd = new UPBannerAd(BannerActivity.this, "sample_banner");
        mBannerAd.setUpBannerAdListener(new UPBannerAdListener() {
            @Override
            public void onClicked() {
                Log.i(TAG, "mBannerAd is clicked");
            }

            @Override
            public void onDisplayed() {
                Log.i(TAG, "mBannerAd is displayed");
            }
        });

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                banner_container = findViewById(R.id.banner_container);
                banner_container.addView(mBannerAd.getBannerView());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mBannerAd != null) {
            mBannerAd.destroy();
        }
    }

}
