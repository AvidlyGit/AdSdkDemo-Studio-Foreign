package com.up.adsdk.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.up.ads.UPInterstitialAd;
import com.up.ads.wrapper.interstitial.UPInterstitialAdListener;

public class InterstitialActivity extends Activity {
    private static final String TAG = "AdsSdk_demo";

    UPInterstitialAd mInterstitialAd;
    Button mBtnDebugView;
    Button mButtonShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

        mInterstitialAd = new UPInterstitialAd(InterstitialActivity.this, "sample_inter");
        mInterstitialAd.setUpInterstitialAdListener(new UPInterstitialAdListener() {
            @Override
            public void onClicked() {
                Log.i(TAG, "mInterstitialAd is clicked");
            }

            @Override
            public void onClosed() {
                Log.i(TAG, "mInterstitialAd is closed");
            }

            @Override
            public void onDisplayed() {
                Log.i(TAG, "mInterstitialAd is displayed");
            }
        });

        mButtonShow = findViewById(R.id.buttonShow);
        mBtnDebugView = findViewById(R.id.btnDebugView);

        mButtonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null && mInterstitialAd.isReady()) {
                    mInterstitialAd.show();
                }
            }
        });

        mBtnDebugView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UPInterstitialAd.showInterstitialDebugActivity(InterstitialActivity.this);
            }
        });
    }

}
