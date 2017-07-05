package com.avidly.adsdk.demo;

import com.avidly.ads.AvidlyInterstitialAd;
import com.avidly.ads.wrapper.interstitial.AvidlyInterstitialAdListener;
import com.avidly.adsdk.demo.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class InterstitialActivity extends Activity {
	private static final String TAG = "AdsSdk_demo";

	AvidlyInterstitialAd mInterstitialAdAAA;
	AvidlyInterstitialAd mInterstitialAdBBB;
	AvidlyInterstitialAd mInterstitialAdCCC;

	Button mButtonAAA;
	Button mButtonBBB;
	Button mBtnDebugView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interstitial);

		mInterstitialAdAAA = new AvidlyInterstitialAd(InterstitialActivity.this, "inter_aaa");
		mInterstitialAdAAA.setAvidlyInterstitialAdListener(new AvidlyInterstitialAdListener() {
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

		mInterstitialAdBBB = new AvidlyInterstitialAd(InterstitialActivity.this, "inter_bbb");
		mInterstitialAdBBB.setAvidlyInterstitialAdListener(new AvidlyInterstitialAdListener() {
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
