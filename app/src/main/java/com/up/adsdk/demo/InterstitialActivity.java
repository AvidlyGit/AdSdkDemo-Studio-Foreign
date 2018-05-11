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

    UPInterstitialAd mInterstitialAdAAA;
    UPInterstitialAd mInterstitialAdBBB;

    Button mButtonAAA;
    Button mButtonBBB;
    Button mBtnDebugView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

        mInterstitialAdAAA = new UPInterstitialAd(InterstitialActivity.this, "inter_aaa");
        mInterstitialAdAAA.setUpInterstitialAdListener(new UPInterstitialAdListener() {
            @Override
            public void onClicked() {
                Log.i(TAG, "mInterstitialAdAAA is clicked");
            }

            @Override
            public void onClosed() {
                Log.i(TAG, "mInterstitialAdAAA is closed");
            }

            @Override
            public void onDisplayed() {
                Log.i(TAG, "mInterstitialAdAAA is displayed");
            }
        });

        mInterstitialAdBBB = new UPInterstitialAd(InterstitialActivity.this, "inter_bbb");
        mInterstitialAdBBB.setUpInterstitialAdListener(new UPInterstitialAdListener() {
            @Override
            public void onClicked() {
                Log.i(TAG, "mInterstitialAdBBB is clicked");
            }

            @Override
            public void onClosed() {
                Log.i(TAG, "mInterstitialAdBBB is closed");
            }

            @Override
            public void onDisplayed() {
                Log.i(TAG, "mInterstitialAdBBB is displayed");
            }
        });

        mButtonAAA = (Button) findViewById(R.id.buttonAAA);
        mButtonBBB = (Button) findViewById(R.id.buttonBBB);
        mBtnDebugView = (Button) findViewById(R.id.btnDebugView);

        mButtonAAA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAdAAA != null && mInterstitialAdAAA.isReady()) {
                    mInterstitialAdAAA.show();
                }
            }
        });

        mButtonBBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAdBBB != null && mInterstitialAdBBB.isReady()) {
                    mInterstitialAdBBB.show();
                }
            }
        });

        mBtnDebugView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAdAAA != null) {
                    mInterstitialAdAAA.showInterstitialDebugActivity(InterstitialActivity.this);
                }
            }
        });
    }

}
