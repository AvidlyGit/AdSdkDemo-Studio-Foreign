package com.up.adsdk.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.up.ads.UPAdsSdk;
import com.up.ads.tool.AccessPrivacyInfoManager;

public class MainActivity extends Activity {
    private static final String TAG = "AdsSdk_demo";

    Button btnVideo;
    Button btnBanner;
    Button btnInterstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UPAdsSdk.isEuropeanUnionUser(this, new UPAdsSdk.UPEuropeanUnionUserCheckCallBack() {
            @Override
            public void isEuropeanUnionUser(boolean isEuropeanUnionUser) {
                if (isEuropeanUnionUser) {
                    //这是GDPR第一种授权方式
                    UPAdsSdk.updateAccessPrivacyInfoStatus(MainActivity.this, AccessPrivacyInfoManager.UPAccessPrivacyInfoStatusEnum.UPAccessPrivacyInfoStatusAccepted);
                    UPAdsSdk.init(MainActivity.this, UPAdsSdk.UPAdsGlobalZone.UPAdsGlobalZoneForeign);
                } else {
                    UPAdsSdk.init(MainActivity.this, UPAdsSdk.UPAdsGlobalZone.UPAdsGlobalZoneForeign);
                }
            }
        });

        btnBanner = (Button) findViewById(R.id.btnBanner);
        btnBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BannerActivity.class);
                startActivity(intent);
            }
        });

        btnInterstitial = (Button) findViewById(R.id.btnInterstitial);
        btnInterstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InterstitialActivity.class);
                startActivity(intent);
            }
        });

        btnVideo = (Button) findViewById(R.id.btnVideo);
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

    }
}
