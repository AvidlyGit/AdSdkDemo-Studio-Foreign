package com.avidly.adsdk.demo;

import com.avidly.ads.AvidlyExitAd;
import com.avidly.ads.wrapper.exit.AvidlyExitAdListener;
import com.avidly.adsdk.demo.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Holaverse on 2017/4/25.
 */

public class ExitActivity extends Activity {
	private static final String TAG = "AdsSdk_demo";

	AvidlyExitAd mAvidlyExitAd;
	TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exit);
		mTextView = (TextView) findViewById(R.id.text);

		mAvidlyExitAd = AvidlyExitAd.getInstance(ExitActivity.this);
		mAvidlyExitAd.setAvidlyExitAdListener(new AvidlyExitAdListener() {
			@Override
			public void onClicked() {
				Log.i(TAG, "mAvidlyExitAd onClicked");
			}

			@Override
			public void onClickedMore() {
				Log.i(TAG, "mAvidlyExitAd onClickedMore");
			}

			@Override
			public void onDisplayed() {
				Log.i(TAG, "mAvidlyExitAd onDisplayed");
			}

			@Override
			public void onExit() {
				Log.i(TAG, "mAvidlyExitAd onExit");
				finish();
			}

			@Override
			public void onCancel() {
				Log.i(TAG, "mAvidlyExitAd onCancel");
				mTextView.setText("游戏中... ...");
			}
		});

	}

	@Override
	public void onResume() {
		super.onResume();

		mTextView.setText("游戏中... ...");
	}

	@Override
	public void onBackPressed() {
		if (mAvidlyExitAd != null && mAvidlyExitAd.isReady()) {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					mTextView.setText("游戏暂停");
				}
			});

			mAvidlyExitAd.show();
		} else {
			Log.i(TAG, "mAvidlyExitAd.isReady() not match");
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					Toast.makeText(ExitActivity.this, "mAvidlyExitAd.isReady() not match", Toast.LENGTH_LONG).show();
					ExitActivity.super.onBackPressed();
				}
			});
		}
	}
}
