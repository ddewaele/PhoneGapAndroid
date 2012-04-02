package com.ecs.room12.phonegap.android;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class Room12PhoneGapAndroidActivity extends DroidGap  {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}