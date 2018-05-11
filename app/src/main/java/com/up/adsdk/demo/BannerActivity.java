package com.up.adsdk.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.up.ads.UPBannerAd;
import com.up.ads.UPRectangleAd;
import com.up.ads.wrapper.banner.UPBannerAdListener;

public class BannerActivity extends Activity {
	private static final String TAG = "AdsSdk_demo";

	LinearLayout banner_container;
	LinearLayout rectangle_container;

	UPBannerAd mBannerAd;
	UPRectangleAd mRectangleAd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_banner);

		mBannerAd = new UPBannerAd(BannerActivity.this, "banner_aaa");
		mBannerAd.setUpBannerAdListener(new UPBannerAdListener() {
			@Override
			public void onClicked() {
				// 此处为广告点击的回调
			}

			@Override
			public void onDisplayed() {
				// 此处为广告显示的回调
			}
		});

		mRectangleAd = new UPRectangleAd(BannerActivity.this, "banner_bbb");
		mRectangleAd.setUpBannerAdListener(new UPBannerAdListener() {
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
