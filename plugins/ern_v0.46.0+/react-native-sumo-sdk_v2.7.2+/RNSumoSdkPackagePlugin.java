package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.facebook.react.ReactPackage;
import com.walmart.ssae.sms.sumo.sdk.reactnative.RNSumoSdkPackage;

public class RNSumoSdkPackagePlugin implements ReactPlugin {
    public ReactPackage hook(@NonNull Application application, @Nullable ReactPluginConfig config) {
        return new RNSumoSdkPackage();
    }
}
