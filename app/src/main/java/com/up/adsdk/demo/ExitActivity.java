package com.up.adsdk.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.up.ads.UPExitAd;
import com.up.ads.wrapper.exit.UPExitAdListener;

/**
 * Created by Holaverse on 2017/4/25.
 */

public class ExitActivity extends Activity {
	private static final String TAG = "AdsSdk_demo";

	UPExitAd mUpExitAd;
	TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exit);
		mTextView = (TextView) findViewById(R.id.text);

		mUpExitAd = UPExitAd.getInstance(ExitActivity.this);
		mUpExitAd.setUpExitAdListener(new UPExitAdListener() {
			@Override
			public void onClicked() {
				Log.i(TAG, "mUpExitAd onClicked");
			}

			@Override
			public void onClickedMore() {
				Log.i(TAG, "mUpExitAd onClickedMore");
			}

			@Override
			public void onDisplayed() {
				Log.i(TAG, "mUpExitAd onDisplayed");
			}

			@Override
			public void onExit() {
				Log.i(TAG, "mUpExitAd onExit");
				finish();
			}

			@Override
			public void onCancel() {
				Log.i(TAG, "mUpExitAd onCancel");
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
		if (mUpExitAd != null && mUpExitAd.isReady()) {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					mTextView.setText("游戏暂停");
				}
			});

			mUpExitAd.show();
		} else {
			Log.i(TAG, "mUpExitAd.isReady() not match");
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					Toast.makeText(ExitActivity.this, "mUpExitAd.isReady() not match", Toast.LENGTH_LONG).show();
					ExitActivity.super.onBackPressed();
				}
			});
		}
	}
}
