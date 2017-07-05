package com.avidly.adsdk.demo;

import com.avidly.ads.AvidlyBannerAd;
import com.avidly.ads.AvidlyRectangleAd;
import com.avidly.ads.wrapper.banner.AvidlyBannerAdListener;
import com.avidly.adsdk.demo.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class BannerActivity extends Activity {
	private static final String TAG = "AdsSdk_demo";

	LinearLayout banner_container;
	LinearLayout rectangle_container;

	AvidlyBannerAd mBannerAd;
	AvidlyRectangleAd mRectangleAd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_banner);

		mBannerAd = new AvidlyBannerAd(BannerActivity.this, "banner_aaa");
		mBannerAd.setAvidlyBannerAdListener(new AvidlyBannerAdListener() {
			@Override
			public void onClicked() {
				// 此处为广告点击的回调
			}

			@Override
			public void onDisplayed() {
				// 此处为广告显示的回调
			}
		});

		mRectangleAd = new AvidlyRectangleAd(BannerActivity.this, "banner_bbb");
		mRectangleAd.setAvidlyBannerAdListener(new AvidlyBannerAdListener() {
			@Override
			public void onClicked() {

			}

			@Override
			public void onDisplayed() {

			}
		});

		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				banner_container = (LinearLayout) findViewById(R.id.banner_container);
				banner_container.addView(mBannerAd.getBannerView());
			}
		});
		
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				rectangle_container = (LinearLayout) findViewById(R.id.rectangle_container);
				rectangle_container.addView(mRectangleAd.getBannerView());
			}
		});
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (mBannerAd != null) {
			mBannerAd.destroy();
		}
		if (mRectangleAd != null) {
			mRectangleAd.destroy();
		}
	}

}
