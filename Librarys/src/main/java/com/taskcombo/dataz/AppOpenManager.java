package com.taskcombo.dataz;

import static androidx.lifecycle.Lifecycle.Event.ON_START;
import static  com.taskcombo.dataz.Main_IO_Units.AD_MOB_APP_ID_OpenAd1;
import static  com.taskcombo.dataz.Main_IO_Units.AD_MOB_OpenAd_STATUS;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

import java.util.Objects;

public class AppOpenManager implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    private static final String LOG_TAG = "AppOpenManager";
    private AppOpenAd appOpenAd = null;

    private AppOpenAd.AppOpenAdLoadCallback loadCallback;
    private Activity activity;
    private static boolean isShowingAd = false;

    private final Application myApplication;

    OnAppOpenClose onAppOpenClose;
    boolean adsLoadnow = false;
    int myids1;

    public interface OnAppOpenClose {
        void OnAppOpenFailToLoad();
        void OnAppOpenClose();

    }

    public AppOpenManager(Application myApplication, OnAppOpenClose onAppOpenClose) {
        adsLoadnow = true;
        this.myApplication = myApplication;
        this.onAppOpenClose = onAppOpenClose;
        this.myApplication.registerActivityLifecycleCallbacks(this);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        myids1 = 1;
    }

    public void DestroyAllAds() {
        adsLoadnow = false;
        myApplication.unregisterActivityLifecycleCallbacks(this);
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
        appOpenAd = null;
        isShowingAd = false;
        activity = null;
    }

    public void fetchAd() {
        // Have unused ad, no need to fetch another.
        if (isAdAvailable()) {
            return;
        }

        loadCallback = new AppOpenAd.AppOpenAdLoadCallback() {
            @Override
            public void onAdLoaded(AppOpenAd ad) {
                AppOpenManager.this.appOpenAd = ad;
                if (myids1 == 1) {
                    myids1 = 0;
                    showAdIfAvailable();
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                onAppOpenClose.OnAppOpenFailToLoad();

            }
        };
        AdRequest request = getAdRequest();

        if (adsLoadnow) {
                if (Objects.equals(AD_MOB_OpenAd_STATUS, "true")) {
                    if (!Objects.equals(AD_MOB_APP_ID_OpenAd1, "")) {
                        AppOpenAd.load(myApplication, String.valueOf(AD_MOB_APP_ID_OpenAd1), request,
                                AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT, loadCallback);
                    }
                } else {
                    AppOpenAd.load(myApplication, "1234885", request,
                            AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT, loadCallback);
                }

        }
    }

    public void showAdIfAvailable() {
        // Only show ad if there is not already an app open ad currently showing
        // and an ad is available.
        if (!isShowingAd && isAdAvailable()) {
            FullScreenContentCallback fullScreenContentCallback =
                    new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            // Set the reference to null so isAdAvailable() returns false.
                            AppOpenManager.this.appOpenAd = null;
                            isShowingAd = false;
                            fetchAd();
                            onAppOpenClose.OnAppOpenClose();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            isShowingAd = true;
                        }
                    };

            appOpenAd.setFullScreenContentCallback(fullScreenContentCallback);
            appOpenAd.show(activity);

        } else {
            fetchAd();
        }
    }


    private AdRequest getAdRequest() {
        return new AdRequest.Builder().build();
    }

    public boolean isAdAvailable() {
        return appOpenAd != null;
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        activity = activity;

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        activity = activity;
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        activity = null;
    }

    @OnLifecycleEvent(ON_START)
    public void onStart() {
        showAdIfAvailable();
        Log.e(LOG_TAG, "onStart");
    }
}