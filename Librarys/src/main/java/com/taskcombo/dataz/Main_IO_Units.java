package com.taskcombo.dataz;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent;

import com.bumptech.glide.Glide;
import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main_IO_Units {

    private static final String TAG = "ZOne";
    public static int app_AllAdShowStatus = 0;

    public static String Dialog_Show = "";

    public static int app_redirectOtherAppStatus = 0;
    public static String app_newPackageName = "";

    public static int app_updateAppDialogStatus = 0;
    public static String app_versionCode = "";
    public static String app_UpdatePackageName = "";

    public static String app_DeveloperOption_Check_Mode = "";

    public static String Privacy_Policy = "";
    public static String app_onesingle_appid = "";

    public static String app_AdsPriority = "";
    public static String app_NativeAdCodeType = "";
    public static String app_BannerPeriority = "";

    public static String AD_MOB_STATUS = "";
    public static String AD_MOB_APP_ID_Banner1 = "";
    public static String AD_MOB_APP_ID_Banner2 = "";
    public static String AD_MOB_APP_ID_Banner3 = "";

    public static String AD_MOB_APP_ID_NativeBanner1 = "";
    public static String AD_MOB_APP_ID_NativeBanner2 = "";
    public static String AD_MOB_APP_ID_NativeBanner3 = "";

    public static String AD_MOB_APP_ID_Inter1 = "";
    public static String AD_MOB_APP_ID_Inter2 = "";
    public static String AD_MOB_APP_ID_Inter3 = "";

    public static String AD_MOB_APP_ID_Native1 = "";
    public static String AD_MOB_APP_ID_Native2 = "";
    public static String AD_MOB_APP_ID_Native3 = "";
    public static String AD_MOB_APP_ID_Native4 = "";

    public static String AD_MOB_OpenAd_STATUS = "";
    public static String AD_MOB_APP_ID_OpenAd1 = "";
    public static String AD_MOB_APP_ID_OpenAd2 = "";
    public static String AD_MOB_APP_ID_OpenAd3 = "";

    public static String FACEBOOK_AD_STATUS = "";
    public static String FB_Banner_ID1 = "";
    public static String FB_Banner_ID2 = "";
    public static String FB_Banner_ID3 = "";

    public static String FB_BannerNative_ID1 = "";
    public static String FB_BannerNative_ID2 = "";
    public static String FB_BannerNative_ID3 = "";

    public static String FB_Inter_ID1 = "";
    public static String FB_Inter_ID2 = "";
    public static String FB_Inter_ID3 = "";

    public static String FB_Native_ID1 = "";
    public static String FB_Native_ID2 = "";
    public static String FB_Native_ID3 = "";
    public static String FB_Native_ID4 = "";

    public static String Native_Btn_Color = "";
    public static String Native_Btn_text = "";
    public static String Native_Btn_Text_Size = "";
    public static String Native_Btn_Text_Color = "";

    public static String Native_Ad_Shape_Square_Corner = "";
    public static String Native_Ad_Small_Size_normal = "";
    public static String Native_Ad_Small_Size_Edited = "";
    public static String Native_Ad_Shape_Normal_Round_Btn = "";

    public static String Banner_Ads_On = "";
    public static String Native_Ads_On = "";
    public static String NativeBanner_Ads_On = "";

    public static String App_Extra_Trigger_1 = "";
    public static String App_Extra_Trigger_2 = "";
    public static String App_Extra_Trigger_3 = "";
    public static String App_Extra_Trigger_4 = "";
    public static String App_Extra_Trigger_5 = "";

    public static int Next_Click_InterAd_Cntr = 0;
    public static int Back_Click_InterAd_Cntr = 0;

    // custome ads
    public static String app_OnlyInterstitalADShow = "";
    public static String app_OnlyNativeADShow = "";
    public static String app_OnlyBannerADShow = "";

    public static int app_CustClickCntSAd = 0;

    public static String app_CustomeADText = "";

    public static String app_CustomeAdInterstitialLink = "";
    public static String app_CustomeAdInterFullscreenImg = "";
    public static String app_CustomeAdQurekaLink = "";

    public static String app_CustomeAdNativeLargeImage = "";
    public static String app_CustomeAdNativeIconImage = "";
    public static String app_CustomeAdNativeTitle = "";
    public static String app_CustomeAdNativesubHander = "";
    public static String app_CustomeAdNativesubHander2 = "";
    public static String app_CustomeAdNativeInstallText = "";
    public static String app_CustomeADNativeLink = "";

    public static String app_CustomeAdBannerIcon = "";
    public static String app_CustomeAdBannerInstallText = "";
    public static String app_CustomeAdBannerHanderText = "";
    public static String app_CustomeAdBannerSubHanderText = "";
    public static String app_CustomeADBannerLink = "";

    public static String app_OnlyQurekaStatusShow = "";
    public static String app_OnlyQurekaLink = "";


    // easy to decalr for use varibvable list

    public static Activity activity;
    public static Main_IO_Units mainIOUnits;

    static RelativeLayout admobBanerLayout = null;
    static RelativeLayout admobBanerLayout2 = null;
    static RelativeLayout admobBanerLayout3 = null;

    static RelativeLayout fbBanerLayout = null;
    static RelativeLayout fbBanerLayout2 = null;
    static RelativeLayout fbBanerLayout3 = null;


    static RelativeLayout admobNativeBanerLayout = null;
    static RelativeLayout admobNativeBanerLayout2 = null;
    static RelativeLayout admobNativeBanerLayout3 = null;

    static RelativeLayout fbNativeBanerLayout = null;
    static RelativeLayout fbNativeBanerLayout2 = null;
    static RelativeLayout fbNativeBanerLayout3 = null;


    static LinearLayout admobNativeNewLayout = null;
    static LinearLayout admobNativeNewLayout2 = null;
    static LinearLayout admobNativeNewLayout3 = null;
    static LinearLayout admobNativeNewLayout4 = null;

    static LinearLayout fbNativeNewLayout = null;
    static LinearLayout fbNativeNewLayout2 = null;
    static LinearLayout fbNativeNewLayout3 = null;
    static LinearLayout fbNativeNewLayout4 = null;


    public static boolean preloadNative_AdStatus = true;

    NativeAd admobNativeAd_preLoad = null;

    NativeAd admobBannerNativeAd = null;

    public static String state_admobNative = "Start";

    com.facebook.ads.NativeAd fbNativeAd_preLoad = null;
    public static String state_fbNative = "Start";

    static MyCallback myCallback;
    public static int count_click = -1;
    public static int Custcadscnt_click = -1;
    public Dialog dialog;
    public static int ad_dialog_time_in_second = 2;
    public InterstitialAd mInterstitialAd;
    public String google_i_pre = "";
    public com.facebook.ads.InterstitialAd fbinterstitialAd1;
    public String facebook_i_pre = "";
    public Main_IO_Units(Activity activity1) {
        activity = activity1;
    }
    public static Main_IO_Units getInstance(Activity activity1) {
        activity = activity1;
        if (mainIOUnits == null) {
            mainIOUnits = new Main_IO_Units(activity);
        }
        return mainIOUnits;
    }
    static OnAdListner onAdListner;
    public interface OnAdListner {
        void OnClose();
    }
    public static void appOpenFailLoadeds(OnAdListner onAdListner1) {
        onAdListner = onAdListner1;
        onAdListner.OnClose();
    }
    public void configDatas(JSONObject jsonObject) throws JSONException {

        Log.e(TAG, "ResponseBegin:");

        app_AllAdShowStatus = jsonObject.getInt("app_AllAdShowStatus");
        Dialog_Show = jsonObject.getString("Dialog_Show");

        app_redirectOtherAppStatus = jsonObject.getInt("app_redirectOtherAppStatus");
        app_newPackageName = jsonObject.getString("app_newPackageName");

        app_updateAppDialogStatus = jsonObject.getInt("app_updateAppDialogStatus");
        app_versionCode = jsonObject.getString("app_versionCode");
        app_UpdatePackageName = jsonObject.getString("app_UpdatePackageName");

        app_DeveloperOption_Check_Mode = jsonObject.getString("app_DeveloperOption_Check_Mode");

        Privacy_Policy = jsonObject.getString("Privacy_Policy");
        app_onesingle_appid = jsonObject.getString("app_OneSingleID");

        app_AdsPriority = jsonObject.getString("app_AdsPriority");
        app_NativeAdCodeType = jsonObject.getString("app_NativeAdCodeType");
        app_BannerPeriority = jsonObject.getString("app_BannerPeriority");

        AD_MOB_STATUS = jsonObject.getString("AD_MOB_STATUS");
        AD_MOB_APP_ID_Banner1 = jsonObject.getString("AD_MOB_APP_ID_Banner1");
        AD_MOB_APP_ID_Banner2 = jsonObject.getString("AD_MOB_APP_ID_Banner2");
        AD_MOB_APP_ID_Banner3 = jsonObject.getString("AD_MOB_APP_ID_Banner3");

        AD_MOB_APP_ID_NativeBanner1 = jsonObject.getString("AD_MOB_APP_ID_NativeBanner1");
        AD_MOB_APP_ID_NativeBanner2 = jsonObject.getString("AD_MOB_APP_ID_NativeBanner2");
        AD_MOB_APP_ID_NativeBanner3 = jsonObject.getString("AD_MOB_APP_ID_NativeBanner3");

        AD_MOB_APP_ID_Inter1 = jsonObject.getString("AD_MOB_APP_ID_Inter1");
        AD_MOB_APP_ID_Inter2 = jsonObject.getString("AD_MOB_APP_ID_Inter2");
        AD_MOB_APP_ID_Inter3 = jsonObject.getString("AD_MOB_APP_ID_Inter3");

        AD_MOB_APP_ID_Native1 = jsonObject.getString("AD_MOB_APP_ID_Native1");
        AD_MOB_APP_ID_Native2 = jsonObject.getString("AD_MOB_APP_ID_Native2");
        AD_MOB_APP_ID_Native3 = jsonObject.getString("AD_MOB_APP_ID_Native3");
        AD_MOB_APP_ID_Native4 = jsonObject.getString("AD_MOB_APP_ID_Native4");

        AD_MOB_OpenAd_STATUS = jsonObject.getString("AD_MOB_OpenAd_STATUS");
        AD_MOB_APP_ID_OpenAd1 = jsonObject.getString("AD_MOB_APP_ID_OpenAd1");
        AD_MOB_APP_ID_OpenAd2 = jsonObject.getString("AD_MOB_APP_ID_OpenAd2");
        AD_MOB_APP_ID_OpenAd3 = jsonObject.getString("AD_MOB_APP_ID_OpenAd3");

        FACEBOOK_AD_STATUS = jsonObject.getString("FACEBOOK_AD_STATUS");
        FB_Banner_ID1 = jsonObject.getString("FB_Banner_ID1");
        FB_Banner_ID2 = jsonObject.getString("FB_Banner_ID2");
        FB_Banner_ID3 = jsonObject.getString("FB_Banner_ID3");

        FB_BannerNative_ID1 = jsonObject.getString("FB_BannerNative_ID1");
        FB_BannerNative_ID2 = jsonObject.getString("FB_BannerNative_ID2");
        FB_BannerNative_ID3 = jsonObject.getString("FB_BannerNative_ID3");

        FB_Inter_ID1 = jsonObject.getString("FB_Inter_ID1");
        FB_Inter_ID2 = jsonObject.getString("FB_Inter_ID2");
        FB_Inter_ID3 = jsonObject.getString("FB_Inter_ID3");

        FB_Native_ID1 = jsonObject.getString("FB_Native_ID1");
        FB_Native_ID2 = jsonObject.getString("FB_Native_ID2");
        FB_Native_ID3 = jsonObject.getString("FB_Native_ID3");
        FB_Native_ID4 = jsonObject.getString("FB_Native_ID4");

        Native_Btn_Color = jsonObject.getString("Native_Btn_Color");
        Native_Btn_text = jsonObject.getString("Native_Btn_Ads_Text");
        Native_Btn_Text_Size = jsonObject.getString("Native_Btn_Text_Size");
        Native_Btn_Text_Color = jsonObject.getString("Native_Btn_Text_Color");

        Native_Ad_Shape_Square_Corner = jsonObject.getString("Native_Ad_Shape_Square_Corner");
        Native_Ad_Small_Size_normal = jsonObject.getString("Native_Ad_Small_Size_normal");
        Native_Ad_Small_Size_Edited = jsonObject.getString("Native_Ad_Small_Size_Edited");
        Native_Ad_Shape_Normal_Round_Btn = jsonObject.getString("Native_Ad_Shape_Normal_Round_Btn");

        Native_Ads_On = jsonObject.getString("Native_Ads_On");
        Banner_Ads_On = jsonObject.getString("Banner_Ads_On");
        NativeBanner_Ads_On = jsonObject.getString("NativeBanner_Ads_On");

        Next_Click_InterAd_Cntr = jsonObject.getInt("Next_Click_InterAd_Cntr");
        Back_Click_InterAd_Cntr = jsonObject.getInt("Back_Click_InterAd_Cntr");

        app_OnlyInterstitalADShow = jsonObject.getString("app_OnlyInterstitalADShow");
        app_OnlyNativeADShow = jsonObject.getString("app_OnlyNativeADShow");
        app_OnlyBannerADShow = jsonObject.getString("app_OnlyBannerADShow");

        app_CustClickCntSAd = jsonObject.getInt("app_CustClickCntSAd");
        app_CustomeADText = jsonObject.getString("app_CustomeADText");

        app_CustomeAdInterstitialLink = jsonObject.getString("app_CustomeAdInterstitialLink");
        app_CustomeAdInterFullscreenImg = jsonObject.getString("app_CustomeAdInterFullscreenImg");
        app_CustomeAdQurekaLink = jsonObject.getString("app_CustomeAdQurekaLink");

        app_CustomeAdNativeLargeImage = jsonObject.getString("app_CustomeAdNativeLargeImage");
        app_CustomeAdNativeIconImage = jsonObject.getString("app_CustomeAdNativeIconImage");
        app_CustomeAdNativeTitle = jsonObject.getString("app_CustomeAdNativeTitle");
        app_CustomeAdNativesubHander = jsonObject.getString("app_CustomeAdNativesubHander");
        app_CustomeAdNativesubHander2 = jsonObject.getString("app_CustomeAdNativesubHander2");
        app_CustomeAdNativeInstallText = jsonObject.getString("app_CustomeAdNativeInstallText");
        app_CustomeADNativeLink = jsonObject.getString("app_CustomeADNativeLink");

        app_CustomeAdBannerIcon = jsonObject.getString("app_CustomeAdBannerIcon");
        app_CustomeAdBannerInstallText = jsonObject.getString("app_CustomeAdBannerInstallText");
        app_CustomeAdBannerHanderText = jsonObject.getString("app_CustomeAdBannerHanderText");
        app_CustomeAdBannerSubHanderText = jsonObject.getString("app_CustomeAdBannerSubHanderText");
        app_CustomeADBannerLink = jsonObject.getString("app_CustomeADBannerLink");

        app_OnlyQurekaStatusShow = jsonObject.getString("app_OnlyQurekaStatusShow");
        app_OnlyQurekaLink = jsonObject.getString("app_OnlyQurekaLink");

        App_Extra_Trigger_1 = jsonObject.getString("App_Extra_Trigger_1");
        App_Extra_Trigger_2 = jsonObject.getString("App_Extra_Trigger_2");
        App_Extra_Trigger_3 = jsonObject.getString("App_Extra_Trigger_3");
        App_Extra_Trigger_4 = jsonObject.getString("App_Extra_Trigger_4");
        App_Extra_Trigger_5 = jsonObject.getString("App_Extra_Trigger_5");

        Log.e(TAG, "ResponseComplete:");

    }


    /// banner code ------------------------------------------------------------------------

    public void Load_BannerAds() {
        if (app_AllAdShowStatus == 0) {
            return;
        }

        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("false")) {
            showFacebookBanner();
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobBanner();
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("true")) {
            if (app_AdsPriority.equalsIgnoreCase("google")) {
                showAdmobBanner();
            } else {
                showFacebookBanner();
            }
        }
    }

    public void showBanner(RelativeLayout banner_container) {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (app_BannerPeriority.equalsIgnoreCase("nativebanner")) {
            if (NativeBanner_Ads_On.equalsIgnoreCase("true")) {
                showNativeBanner(banner_container);
            }
        } else {
            if (Banner_Ads_On.equalsIgnoreCase("true")) {
                displayBanner(banner_container);
            }
        }
    }

    public void displayBanner(RelativeLayout Adlayout) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
            if (fbBanerLayout != null) {
                if (fbBanerLayout.getParent() != null) {
                    ((ViewGroup) fbBanerLayout.getParent()).removeView(fbBanerLayout); // <- fix
                }
                Adlayout.addView(fbBanerLayout);
            } else if (fbBanerLayout2 != null) {
                if (fbBanerLayout2.getParent() != null) {
                    ((ViewGroup) fbBanerLayout2.getParent()).removeView(fbBanerLayout2); // <- fix
                }
                Adlayout.addView(fbBanerLayout2);
            } else if (fbBanerLayout3 != null) {
                if (fbBanerLayout3.getParent() != null) {
                    ((ViewGroup) fbBanerLayout3.getParent()).removeView(fbBanerLayout3); // <- fix
                }
                Adlayout.addView(fbBanerLayout3);
            } else if (admobBanerLayout != null) {
                if (admobBanerLayout.getParent() != null) {
                    ((ViewGroup) admobBanerLayout.getParent()).removeView(admobBanerLayout); // <- fix
                }
                Adlayout.addView(admobBanerLayout);
            } else if (admobBanerLayout2 != null) {
                if (admobBanerLayout2.getParent() != null) {
                    ((ViewGroup) admobBanerLayout2.getParent()).removeView(admobBanerLayout2); // <- fix
                }
                Adlayout.addView(admobBanerLayout2);
            } else if (admobBanerLayout3 != null) {
                if (admobBanerLayout3.getParent() != null) {
                    ((ViewGroup) admobBanerLayout3.getParent()).removeView(admobBanerLayout3); // <- fix
                }
                Adlayout.addView(admobBanerLayout3);
                showFacebookBanner();
            } else {
                onlyCustBannerCallAD(activity);

            }
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
            if (admobBanerLayout != null) {
                if (admobBanerLayout.getParent() != null) {
                    ((ViewGroup) admobBanerLayout.getParent()).removeView(admobBanerLayout); // <- fix
                }
                Adlayout.addView(admobBanerLayout);
            } else if (admobBanerLayout2 != null) {
                if (admobBanerLayout2.getParent() != null) {
                    ((ViewGroup) admobBanerLayout2.getParent()).removeView(admobBanerLayout2); // <- fix
                }
                Adlayout.addView(admobBanerLayout2);
            } else if (admobBanerLayout3 != null) {
                if (admobBanerLayout3.getParent() != null) {
                    ((ViewGroup) admobBanerLayout3.getParent()).removeView(admobBanerLayout3); // <- fix
                }
                Adlayout.addView(admobBanerLayout3);
            } else if (fbBanerLayout != null) {
                if (fbBanerLayout.getParent() != null) {
                    ((ViewGroup) fbBanerLayout.getParent()).removeView(fbBanerLayout); // <- fix
                }
                Adlayout.addView(fbBanerLayout);
            } else if (fbBanerLayout2 != null) {
                if (fbBanerLayout2.getParent() != null) {
                    ((ViewGroup) fbBanerLayout2.getParent()).removeView(fbBanerLayout2); // <- fix
                }
                Adlayout.addView(fbBanerLayout2);
            } else if (fbBanerLayout3 != null) {
                if (fbBanerLayout3.getParent() != null) {
                    ((ViewGroup) fbBanerLayout3.getParent()).removeView(fbBanerLayout3); // <- fix
                }
                Adlayout.addView(fbBanerLayout3);
                showAdmobBanner();
            }
        } else {
            onlyCustBannerCallAD(activity);
        }
    }

    public void showFacebookBanner() {
        Log.e(TAG, "showFacebookBanner1: ");
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobBanner();
            return;
        }

        fbBanerLayout = new RelativeLayout(activity);
        com.facebook.ads.AdView fbadView;
        fbadView = new com.facebook.ads.AdView(activity, FB_Banner_ID1, com.facebook.ads.AdSize.BANNER_HEIGHT_50);
        fbBanerLayout.addView(fbadView);

        com.facebook.ads.AdListener adListener = new com.facebook.ads.AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorbner1: ");
                fbBanerLayout.removeAllViews();
                fbBanerLayout = null;
                showFacebookBanner2();

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedbner1: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClicked1: ");

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionbner1: ");

            }
        };
        fbadView.loadAd(fbadView.buildLoadAdConfig().withAdListener(adListener).build());
    }

    public void showFacebookBanner2() {
        Log.e(TAG, "showFacebookBanner2: ");
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobBanner();
            return;
        }
        fbBanerLayout2 = new RelativeLayout(activity);
        com.facebook.ads.AdView fbadView;
        fbadView = new com.facebook.ads.AdView(activity, FB_Banner_ID2, com.facebook.ads.AdSize.BANNER_HEIGHT_50);
        fbBanerLayout2.addView(fbadView);

        com.facebook.ads.AdListener adListener = new com.facebook.ads.AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorbner2: ");
                fbBanerLayout2.removeAllViews();
                fbBanerLayout2 = null;
                showFacebookBanner3();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedbner2: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedbner2: ");

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionbner2: ");

            }
        };
        fbadView.loadAd(fbadView.buildLoadAdConfig().withAdListener(adListener).build());

    }

    public void showFacebookBanner3() {
        Log.e(TAG, "showFacebookBanner3: ");
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobBanner();
            return;
        }

        fbBanerLayout3 = new RelativeLayout(activity);
        com.facebook.ads.AdView fbadView;
        fbadView = new com.facebook.ads.AdView(activity, FB_Banner_ID3, com.facebook.ads.AdSize.BANNER_HEIGHT_50);
        fbBanerLayout3.addView(fbadView);

        com.facebook.ads.AdListener adListener = new com.facebook.ads.AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorbner3: ");
                fbBanerLayout3.removeAllViews();
                fbBanerLayout3 = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    showAdmobBanner();
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedbner3: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedbner3: ");

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionbner3: ");

            }
        };

        fbadView.loadAd(fbadView.buildLoadAdConfig().withAdListener(adListener).build());

    }

    public void showAdmobBanner() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }

        admobBanerLayout = new RelativeLayout(activity);
        AdView mAdView = new AdView(activity);
        mAdView.setAdSize(AdSize.BANNER);
        mAdView.setAdUnitId(AD_MOB_APP_ID_Banner1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Log.e(TAG, "onAdClosedggb1: ");
                // super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggb1: ");
                //  super.onAdFailedToLoad(loadAdError);
                admobBanerLayout.removeAllViews();
                admobBanerLayout = null;
                showAdmobBanner2();


            }

            @Override
            public void onAdOpened() {
                Log.e(TAG, "onAdOpenedggb1: ");
                //  super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                Log.e(TAG, "onAdLoadedggb1: ");
                //   super.onAdLoaded();
                admobBanerLayout.removeAllViews();
                admobBanerLayout.addView(mAdView);
            }

            @Override
            public void onAdClicked() {
                Log.e(TAG, "onAdClickedggb1: ");
                //   super.onAdClicked();
            }

            @Override
            public void onAdImpression() {
                Log.e(TAG, "onAdImpressionggb1: ");
                //    super.onAdImpression();
            }
        });

    }

    public void showAdmobBanner2() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobBanerLayout2 = new RelativeLayout(activity);
        AdView mAdView = new AdView(activity);
        mAdView.setAdSize(AdSize.BANNER);
        mAdView.setAdUnitId(AD_MOB_APP_ID_Banner2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Log.e(TAG, "onAdClosedggb2: ");
                // super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggb2: ");
                //  super.onAdFailedToLoad(loadAdError);
                admobBanerLayout2.removeAllViews();
                admobBanerLayout2 = null;
                showAdmobBanner3();

            }

            @Override
            public void onAdOpened() {
                Log.e(TAG, "onAdOpenedggb2: ");
                //  super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                Log.e(TAG, "onAdLoadedggb2: ");
                //   super.onAdLoaded();
                admobBanerLayout2.removeAllViews();
                admobBanerLayout2.addView(mAdView);
            }

            @Override
            public void onAdClicked() {
                Log.e(TAG, "onAdClickedggb2: ");
                //   super.onAdClicked();
            }

            @Override
            public void onAdImpression() {
                Log.e(TAG, "onAdImpressionggb2: ");
                //    super.onAdImpression();
            }
        });

    }

    public void showAdmobBanner3() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobBanerLayout3 = new RelativeLayout(activity);
        AdView mAdView = new AdView(activity);
        mAdView.setAdSize(AdSize.BANNER);
        mAdView.setAdUnitId(AD_MOB_APP_ID_Banner3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Log.e(TAG, "onAdClosedggb3: ");
                //  super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggb3: ");
                //  super.onAdFailedToLoad(loadAdError);
                admobBanerLayout3.removeAllViews();
                admobBanerLayout3 = null;
                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    showFacebookBanner();
                }
            }

            @Override
            public void onAdOpened() {
                Log.e(TAG, "onAdOpenedggb3: ");
                //  super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                Log.e(TAG, "onAdLoadedggb3: ");
                //   super.onAdLoaded();
                admobBanerLayout3.removeAllViews();
                admobBanerLayout3.addView(mAdView);
            }

            @Override
            public void onAdClicked() {
                Log.e(TAG, "onAdClickedggb3: ");
                //   super.onAdClicked();
            }

            @Override
            public void onAdImpression() {
                Log.e(TAG, "onAdImpressionggb3: ");
                //    super.onAdImpression();
            }
        });

    }

    /// native banner code ------------------------------------------------------------------------

    public void Load_NativeBannerAds() {
        if (app_AllAdShowStatus == 0) {
            return;
        }


        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("false")) {
            showNativeFacebookBanner();
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadGoogleNativeSmall();
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("true")) {
            if (app_AdsPriority.equalsIgnoreCase("google")) {
                LoadGoogleNativeSmall();
            } else {
                showNativeFacebookBanner();
            }
        }


    }

    public void showNativeBanner(RelativeLayout banner_container) {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (NativeBanner_Ads_On.equalsIgnoreCase("true")) {
            displayNativeBanner(banner_container);
        }
    }

    public void displayNativeBanner(RelativeLayout Adlayout) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
            if (fbNativeBanerLayout != null) {
                if (fbNativeBanerLayout.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout.getParent()).removeView(fbNativeBanerLayout); // <- fix
                }
                Adlayout.addView(fbNativeBanerLayout);
            } else if (fbNativeBanerLayout2 != null) {
                if (fbNativeBanerLayout2.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout2.getParent()).removeView(fbNativeBanerLayout2); // <- fix
                }
                Adlayout.addView(fbNativeBanerLayout2);
            } else if (fbNativeBanerLayout3 != null) {
                if (fbNativeBanerLayout3.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout3.getParent()).removeView(fbNativeBanerLayout3); // <- fix
                }
                Adlayout.addView(fbNativeBanerLayout3);
            } else if (admobNativeBanerLayout != null) {
                if (admobNativeBanerLayout.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout.getParent()).removeView(admobNativeBanerLayout); // <- fix
                }
                Adlayout.addView(admobNativeBanerLayout);
            } else if (admobNativeBanerLayout2 != null) {
                if (admobNativeBanerLayout2.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout2.getParent()).removeView(admobNativeBanerLayout2); // <- fix
                }
                Adlayout.addView(admobNativeBanerLayout2);
            } else if (admobNativeBanerLayout3 != null) {
                if (admobNativeBanerLayout3.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout3.getParent()).removeView(admobNativeBanerLayout3); // <- fix
                }
                Adlayout.addView(admobNativeBanerLayout3);
                showNativeFacebookBanner();
            } else {
                onlyCustBannerCallAD(activity);

            }
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
            if (admobNativeBanerLayout != null) {
                if (admobNativeBanerLayout.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout.getParent()).removeView(admobNativeBanerLayout); // <- fix
                }
                Adlayout.addView(admobNativeBanerLayout);
            } else if (admobNativeBanerLayout2 != null) {
                if (admobNativeBanerLayout2.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout2.getParent()).removeView(admobNativeBanerLayout2); // <- fix
                }
                Adlayout.addView(admobNativeBanerLayout2);
            } else if (admobNativeBanerLayout3 != null) {
                if (admobNativeBanerLayout3.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout3.getParent()).removeView(admobNativeBanerLayout3); // <- fix
                }
                Adlayout.addView(admobNativeBanerLayout3);
            } else if (fbNativeBanerLayout != null) {
                if (fbNativeBanerLayout.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout.getParent()).removeView(fbNativeBanerLayout); // <- fix
                }
                Adlayout.addView(fbNativeBanerLayout);
            } else if (fbNativeBanerLayout2 != null) {
                if (fbNativeBanerLayout2.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout2.getParent()).removeView(fbNativeBanerLayout2); // <- fix
                }
                Adlayout.addView(fbNativeBanerLayout2);
            } else if (fbNativeBanerLayout3 != null) {
                if (fbNativeBanerLayout3.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout3.getParent()).removeView(fbNativeBanerLayout3); // <- fix
                }
                Adlayout.addView(fbNativeBanerLayout3);
                LoadGoogleNativeSmall();
            }
        } else {
            onlyCustBannerCallAD(activity);
        }
    }

    public void showNativeFacebookBanner() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadGoogleNativeSmall();
            return;
        }

        fbNativeBanerLayout = new RelativeLayout(activity);
        final NativeBannerAd nativeAd1 = new NativeBannerAd(activity, FB_BannerNative_ID1);
        nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e(TAG, "onMediaDownloadedfbnb1: ");
                fbNativeBanerLayout.removeAllViews();
                Inflate_FBNativeBannerADS(nativeAd1, fbNativeBanerLayout);
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorfbnb1: ");
                fbNativeBanerLayout.removeAllViews();
                fbNativeBanerLayout = null;
                showNativeFacebookBanner2();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedfbnb1: ");
                if (nativeAd1 == null || nativeAd1 != ad) {
                    return;
                }
                nativeAd1.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedfbnb1: ");

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionfbnb1: ");

            }
        }).build());
    }

    public void showNativeFacebookBanner2() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadGoogleNativeSmall();
            return;
        }

        fbNativeBanerLayout2 = new RelativeLayout(activity);
        final NativeBannerAd nativeAd1 = new NativeBannerAd(activity, FB_BannerNative_ID2);
        nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e(TAG, "onMediaDownloadedfbnb2: ");
                fbNativeBanerLayout2.removeAllViews();
                Inflate_FBNativeBannerADS(nativeAd1, fbNativeBanerLayout2);
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorfbnb2: ");
                fbNativeBanerLayout2.removeAllViews();
                fbNativeBanerLayout2 = null;
                showNativeFacebookBanner3();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedfbnb2: ");
                if (nativeAd1 == null || nativeAd1 != ad) {
                    return;
                }
                nativeAd1.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedfbnb2: ");

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionfbnb2: ");

            }
        }).build());
    }

    public void showNativeFacebookBanner3() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadGoogleNativeSmall();
            return;
        }

        fbNativeBanerLayout3 = new RelativeLayout(activity);
        final NativeBannerAd nativeAd1 = new NativeBannerAd(activity, FB_BannerNative_ID3);
        nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                fbNativeBanerLayout3.removeAllViews();
                Inflate_FBNativeBannerADS(nativeAd1, fbNativeBanerLayout3);
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorfbnb3: ");
                fbNativeBanerLayout3.removeAllViews();
                fbNativeBanerLayout3 = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    LoadGoogleNativeSmall();
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {
                if (nativeAd1 == null || nativeAd1 != ad) {
                    return;
                }
                nativeAd1.downloadMedia();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        }).build());
    }

    public void Inflate_FBNativeBannerADS(NativeBannerAd nativeBannerAd, ViewGroup cardView) {
        nativeBannerAd.unregisterView();

        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = null;
        view = inflater.inflate(R.layout.ads_nb_fb, null);
        cardView.addView(view);

        NativeAdLayout nativeAdLayout = view.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = view.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeBannerAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        TextView nativeAdTitle = view.findViewById(R.id.native_ad_title);
        TextView nativeAdSocialContext = view.findViewById(R.id.native_ad_social_context);
        MediaView nativeAdIconView = view.findViewById(R.id.native_icon_view);
        TextView nativeAdCallToAction = view.findViewById(R.id.b_name);
        nativeAdCallToAction.setText(nativeBannerAd.getAdCallToAction());
        nativeAdCallToAction.setVisibility(
                nativeBannerAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdTitle.setText(nativeBannerAd.getAdvertiserName());
        nativeAdSocialContext.setText(nativeBannerAd.getAdBodyText());

        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdCallToAction);
        clickableViews.add(nativeAdIconView);
        clickableViews.add(nativeAdSocialContext);
        nativeBannerAd.registerViewForInteraction(view, nativeAdIconView, clickableViews);
    }

    private void LoadGoogleNativeSmall() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }

        admobNativeBanerLayout = new RelativeLayout(activity);
        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_NativeBanner1);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                // boolean isDestroyed = false;
                if (admobBannerNativeAd != null) {
                    admobBannerNativeAd.destroy();
                }
                admobBannerNativeAd = NativeAd;

                populateUnifiedNativeBannerAdView(NativeAd, admobNativeBanerLayout);
            }
        });

        AdLoader adLoader = builder.withAdListener(
                        new AdListener() {
                            @Override
                            public void onAdFailedToLoad(LoadAdError loadAdError) {
                                Log.e(TAG, "onAdFailedToLoadggnb1: ");
                                admobNativeBanerLayout.removeAllViews();
                                admobNativeBanerLayout = null;
                                LoadGoogleNativeSmall2();
                            }
                        })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

    private void LoadGoogleNativeSmall2() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobNativeBanerLayout2 = new RelativeLayout(activity);
        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_NativeBanner2);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                //  boolean isDestroyed = false;
                if (admobBannerNativeAd != null) {
                    admobBannerNativeAd.destroy();
                }
                admobBannerNativeAd = NativeAd;

                populateUnifiedNativeBannerAdView(NativeAd, admobNativeBanerLayout2);
            }
        });

        AdLoader adLoader = builder.withAdListener(
                        new AdListener() {
                            @Override
                            public void onAdFailedToLoad(LoadAdError loadAdError) {
                                Log.e(TAG, "onAdFailedToLoadggnb2: ");
                                admobNativeBanerLayout2.removeAllViews();
                                admobNativeBanerLayout2 = null;
                                LoadGoogleNativeSmall3();
                            }
                        })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

    private void LoadGoogleNativeSmall3() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }

        admobNativeBanerLayout3 = new RelativeLayout(activity);

        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_NativeBanner3);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                // boolean isDestroyed = false;
                if (admobBannerNativeAd != null) {
                    admobBannerNativeAd.destroy();
                }
                admobBannerNativeAd = NativeAd;

                populateUnifiedNativeBannerAdView(NativeAd, admobNativeBanerLayout3);
            }
        });

        AdLoader adLoader = builder.withAdListener(
                        new AdListener() {
                            @Override
                            public void onAdFailedToLoad(LoadAdError loadAdError) {
                                admobNativeBanerLayout3.removeAllViews();
                                admobNativeBanerLayout3 = null;
                                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                                    showNativeFacebookBanner();
                                }

                            }
                        })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void populateUnifiedNativeBannerAdView(NativeAd nativeAd, ViewGroup nativeAdContainer) {
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = null;

        view = inflater.inflate(R.layout.google_small_native_banner, null);

        nativeAdContainer.removeAllViews();
        nativeAdContainer.addView(view);

        NativeAdView adView = (NativeAdView) view.findViewById(R.id.ntbnradview);

        adView.setMediaView((com.google.android.gms.ads.nativead.MediaView) adView.findViewById(R.id.ad_medianb));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headlinenb));
        adView.setBodyView(adView.findViewById(R.id.ad_bodynb));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_actionnb));
        /*if (!Native_Btn_Color.isEmpty()) {
            adView.findViewById(R.id.ad_call_to_action).setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }*/
        adView.setIconView(adView.findViewById(R.id.ad_app_iconnb));
        //  adView.setPriceView(adView.findViewById(R.id.ad_price));  //wait
        adView.setStarRatingView(adView.findViewById(R.id.ad_starsnb));
        // adView.setStoreView(adView.findViewById(R.id.ad_store));  // wiat
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertisernb));

        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        ((TextView) (adView.getHeadlineView())).setText(nativeAd.getHeadline());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

       /* if (!Native_Btn_Text_Size.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }

        if (!Native_Btn_Text_Color.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }*/

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            /*if (!Native_Btn_text.isEmpty()) {
                ((TextView) adView.getCallToActionView()).setText(Native_Btn_text);
            } else {*/
            ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            // }
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }

        adView.setNativeAd(nativeAd);
    }

    /// new and old native code ------------------------------------------------------------------------

    public void ads_NativeCall(ViewGroup native_container) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false") && AD_MOB_STATUS.equalsIgnoreCase("false")) {
            if (app_OnlyNativeADShow.equalsIgnoreCase("true")) {
                native_container.setVisibility(View.GONE);
                onlyCustNativeCallAD(activity);
            } else {
                native_container.setVisibility(View.GONE);
            }
        } else {
            if (app_NativeAdCodeType.equalsIgnoreCase("new")) {
                showNativeNew(native_container);
            } else {
                showNative(native_container);
            }
        }
    }

    /// new native code ------------------------------------------------------------------------

    public void Load_NativeNewAds() {
        if (app_AllAdShowStatus == 0) {
            return;
        }

        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("false")) {
            showFacebookNativeNew();
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadAdNativeNew();
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("true")) {
            if (app_AdsPriority.equalsIgnoreCase("google")) {
                LoadAdNativeNew();
            } else {
                showFacebookNativeNew();
            }
        }


    }

    public void showNativeNew(ViewGroup banner_container) {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (Native_Ads_On.equalsIgnoreCase("true")) {
            displayNativeNew(banner_container);
        }
    }

    public void displayNativeNew(ViewGroup Adlayout) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {

            if (fbNativeNewLayout != null) {
                if (fbNativeNewLayout.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout.getParent()).removeView(fbNativeNewLayout); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout);

            } else if (fbNativeNewLayout2 != null) {
                if (fbNativeNewLayout2.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout2.getParent()).removeView(fbNativeNewLayout2); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout2);

            } else if (fbNativeNewLayout3 != null) {
                if (fbNativeNewLayout3.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout3.getParent()).removeView(fbNativeNewLayout3); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout3);

            } else if (fbNativeNewLayout4 != null) {
                if (fbNativeNewLayout4.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout4.getParent()).removeView(fbNativeNewLayout4); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout4);

            } else if (admobNativeNewLayout != null) {
                if (admobNativeNewLayout.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout.getParent()).removeView(admobNativeNewLayout); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout);

            } else if (admobNativeNewLayout2 != null) {
                if (admobNativeNewLayout2.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout2.getParent()).removeView(admobNativeNewLayout2); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout2);

            } else if (admobNativeNewLayout3 != null) {
                if (admobNativeNewLayout3.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout3.getParent()).removeView(admobNativeNewLayout3); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout3);

            } else if (admobNativeNewLayout4 != null) {
                if (admobNativeNewLayout4.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout4.getParent()).removeView(admobNativeNewLayout4); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout4);
                showFacebookNativeNew();
            } else {
                onlyCustNativeCallAD(activity);
            }
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
            if (admobNativeNewLayout != null) {
                if (admobNativeNewLayout.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout.getParent()).removeView(admobNativeNewLayout); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout);

            } else if (admobNativeNewLayout2 != null) {
                if (admobNativeNewLayout2.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout2.getParent()).removeView(admobNativeNewLayout2); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout2);

            } else if (admobNativeNewLayout3 != null) {
                if (admobNativeNewLayout3.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout3.getParent()).removeView(admobNativeNewLayout3); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout3);

            } else if (admobNativeNewLayout4 != null) {
                if (admobNativeNewLayout4.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout4.getParent()).removeView(admobNativeNewLayout4); // <- fix
                }
                Adlayout.addView(admobNativeNewLayout4);

            } else if (fbNativeNewLayout != null) {
                if (fbNativeNewLayout.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout.getParent()).removeView(fbNativeNewLayout); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout);

            } else if (fbNativeNewLayout2 != null) {
                if (fbNativeNewLayout2.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout2.getParent()).removeView(fbNativeNewLayout2); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout2);

            } else if (fbNativeNewLayout3 != null) {
                if (fbNativeNewLayout3.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout3.getParent()).removeView(fbNativeNewLayout3); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout3);

            } else if (fbNativeNewLayout4 != null) {
                if (fbNativeNewLayout4.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout4.getParent()).removeView(fbNativeNewLayout4); // <- fix
                }
                Adlayout.addView(fbNativeNewLayout4);
                LoadAdNativeNew();
            }
        } else {
            onlyCustNativeCallAD(activity);
        }
    }

    public void showFacebookNativeNew() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadAdNativeNew();
            return;
        }
        fbNativeNewLayout = new LinearLayout(activity);
        fbNativeNewLayout.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


        final com.facebook.ads.NativeAd nativeAd;
        nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID1);

        com.facebook.ads.NativeAdListener nativeAdListener = new com.facebook.ads.NativeAdListener() {
            @Override
            public void onMediaDownloaded(com.facebook.ads.Ad ad) {
                // Native ad finished downloading all assets
            }

            @Override
            public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
                // Native ad failed to load
                //fbNativeLayout.removeAllViews();
                fbNativeNewLayout = null;
                showFacebookNativeNew2();
            }

            @Override
            public void onAdLoaded(com.facebook.ads.Ad ad) {
                // Native ad is loaded and ready to be displayed

                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                // Inflate Native Ad into Container
                inflateFBNativeAd(nativeAd, fbNativeNewLayout);
            }

            @Override
            public void onAdClicked(com.facebook.ads.Ad ad) {
                // Native ad clicked
            }

            @Override
            public void onLoggingImpression(com.facebook.ads.Ad ad) {
                // Native ad impression
            }
        };

        // Request an ad
        nativeAd.loadAd(
                nativeAd.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    public void showFacebookNativeNew2() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadAdNativeNew();
            return;
        }
        fbNativeNewLayout2 = new LinearLayout(activity);
        fbNativeNewLayout2.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        final com.facebook.ads.NativeAd nativeAd;
        nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID2);

        com.facebook.ads.NativeAdListener nativeAdListener = new com.facebook.ads.NativeAdListener() {
            @Override
            public void onMediaDownloaded(com.facebook.ads.Ad ad) {
                // Native ad finished downloading all assets
            }

            @Override
            public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
                // Native ad failed to load
                //fbNativeLayout.removeAllViews();
                fbNativeNewLayout2 = null;
                showFacebookNativeNew3();
            }

            @Override
            public void onAdLoaded(com.facebook.ads.Ad ad) {
                // Native ad is loaded and ready to be displayed

                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                // Inflate Native Ad into Container
                inflateFBNativeAd(nativeAd, fbNativeNewLayout2);
            }

            @Override
            public void onAdClicked(com.facebook.ads.Ad ad) {
                // Native ad clicked
            }

            @Override
            public void onLoggingImpression(com.facebook.ads.Ad ad) {
                // Native ad impression
            }
        };

        // Request an ad
        nativeAd.loadAd(
                nativeAd.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    public void showFacebookNativeNew3() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadAdNativeNew();
            return;
        }

        fbNativeNewLayout3 = new LinearLayout(activity);
        fbNativeNewLayout3.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        final com.facebook.ads.NativeAd nativeAd;
        nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID3);

        com.facebook.ads.NativeAdListener nativeAdListener = new com.facebook.ads.NativeAdListener() {
            @Override
            public void onMediaDownloaded(com.facebook.ads.Ad ad) {
                // Native ad finished downloading all assets
            }

            @Override
            public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
                // Native ad failed to load
                //fbNativeLayout.removeAllViews();
                fbNativeNewLayout3 = null;
                showFacebookNativeNew4();
            }

            @Override
            public void onAdLoaded(com.facebook.ads.Ad ad) {
                // Native ad is loaded and ready to be displayed

                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                // Inflate Native Ad into Container
                inflateFBNativeAd(nativeAd, fbNativeNewLayout3);
            }

            @Override
            public void onAdClicked(com.facebook.ads.Ad ad) {
                // Native ad clicked
            }

            @Override
            public void onLoggingImpression(com.facebook.ads.Ad ad) {
                // Native ad impression
            }
        };

        // Request an ad
        nativeAd.loadAd(
                nativeAd.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    public void showFacebookNativeNew4() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadAdNativeNew();
            return;
        }

        fbNativeNewLayout4 = new LinearLayout(activity);
        fbNativeNewLayout4.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        final com.facebook.ads.NativeAd nativeAd;
        nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID4);

        com.facebook.ads.NativeAdListener nativeAdListener = new com.facebook.ads.NativeAdListener() {
            @Override
            public void onMediaDownloaded(com.facebook.ads.Ad ad) {
                // Native ad finished downloading all assets
            }

            @Override
            public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
                // Native ad failed to load
                //fbNativeLayout.removeAllViews();
                fbNativeNewLayout4 = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    LoadAdNativeNew();
                }
            }

            @Override
            public void onAdLoaded(com.facebook.ads.Ad ad) {
                // Native ad is loaded and ready to be displayed

                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                // Inflate Native Ad into Container
                inflateFBNativeAd(nativeAd, fbNativeNewLayout4);
            }

            @Override
            public void onAdClicked(com.facebook.ads.Ad ad) {
                // Native ad clicked
            }

            @Override
            public void onLoggingImpression(com.facebook.ads.Ad ad) {
                // Native ad impression
            }
        };

        // Request an ad
        nativeAd.loadAd(
                nativeAd.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    public void inflateFBNativeAd(com.facebook.ads.NativeAd nativeAd, ViewGroup card) {
        nativeAd.unregisterView();
        LayoutInflater inflater = LayoutInflater.from(activity);
        View adView = inflater.inflate(R.layout.fb_native_layout, null);

        card.removeAllViews();
        card.addView(adView);

        NativeAdLayout nativeAdLayout = adView.findViewById(R.id.nativview);

        LinearLayout adChoicesContainer = adView.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        MediaView nativeAdIcon = adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = adView.findViewById(R.id.native_ad_title);
        MediaView nativeAdMedia = adView.findViewById(R.id.native_ad_media);
        TextView nativeAdSocialContext = adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdBody = adView.findViewById(R.id.native_ad_body);
        TextView sponsoredLabel = adView.findViewById(R.id.native_ad_sponsored_label);
        TextView nativeAdCallToAction = adView.findViewById(R.id.native_ad_call_to_action);

        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);

        if (!Native_Btn_Text_Size.isEmpty()) {
            nativeAdCallToAction.setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }

        if (!Native_Btn_text.isEmpty()) {
            nativeAdCallToAction.setText(Native_Btn_text);
        } else {
            nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        }

        if (!Native_Btn_Text_Color.isEmpty()) {
            nativeAdCallToAction.setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }

        if (!Native_Btn_Color.isEmpty()) {
            nativeAdCallToAction.setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }

        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());
        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdBody);
        clickableViews.add(nativeAdCallToAction);
        clickableViews.add(nativeAdIcon);
        clickableViews.add(nativeAdSocialContext);

        nativeAd.registerViewForInteraction(
                adView,
                nativeAdMedia,
                nativeAdIcon,
                clickableViews);
    }

    public void LoadAdNativeNew() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        admobNativeNewLayout = new LinearLayout(activity);
        admobNativeNewLayout.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native1);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                boolean isDestroyed = false;
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;

                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout);
            }
        });

        AdLoader adLoader = builder.withAdListener(
                        new AdListener() {
                            @Override
                            public void onAdFailedToLoad(LoadAdError loadAdError) {
                                admobNativeNewLayout.removeAllViews();
                                admobNativeNewLayout = null;
                                LoadAdNativeNew2();
                            }
                        })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void LoadAdNativeNew2() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        admobNativeNewLayout2 = new LinearLayout(activity);
        admobNativeNewLayout2.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native2);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                boolean isDestroyed = false;
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;

                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout2);
            }
        });

        AdLoader adLoader = builder.withAdListener(
                        new AdListener() {
                            @Override
                            public void onAdFailedToLoad(LoadAdError loadAdError) {
                                admobNativeNewLayout2.removeAllViews();
                                admobNativeNewLayout2 = null;
                                LoadAdNativeNew3();
                            }
                        })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void LoadAdNativeNew3() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        admobNativeNewLayout3 = new LinearLayout(activity);
        admobNativeNewLayout3.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native3);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                boolean isDestroyed = false;
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;

                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout3);
            }
        });

        AdLoader adLoader = builder.withAdListener(
                        new AdListener() {
                            @Override
                            public void onAdFailedToLoad(LoadAdError loadAdError) {
                                admobNativeNewLayout3.removeAllViews();
                                admobNativeNewLayout3 = null;
                                LoadAdNativeNew4();
                            }
                        })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void LoadAdNativeNew4() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        admobNativeNewLayout4 = new LinearLayout(activity);
        admobNativeNewLayout4.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native4);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                boolean isDestroyed = false;
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;
                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout4);
            }
        });

        AdLoader adLoader = builder.withAdListener(
                        new AdListener() {
                            @Override
                            public void onAdFailedToLoad(LoadAdError loadAdError) {
                                admobNativeNewLayout4.removeAllViews();
                                admobNativeNewLayout4 = null;
                                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                                    showFacebookNativeNew();
                                }
                            }
                        })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void populateUnifiedNativeAdView(NativeAd nativeAd, ViewGroup nativeAdContainer) {
        nativeAdContainer.setVisibility(View.VISIBLE);
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = null;

        if (Native_Ad_Small_Size_normal.equals("true")) {
            view = inflater.inflate(R.layout.native_small_normal_admob, null);
        } else if (Native_Ad_Shape_Square_Corner.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_square, null);
        } else if (Native_Ad_Shape_Normal_Round_Btn.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_normal_round_btn, null);
        } else if (Native_Ad_Small_Size_Edited.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_small_size_edited, null);
        } else {
            view = inflater.inflate(R.layout.native_admob_square, null);
        }

        nativeAdContainer.removeAllViews();
        nativeAdContainer.addView(view);

        NativeAdView adView = (NativeAdView) view.findViewById(R.id.uadview);

        adView.setMediaView((com.google.android.gms.ads.nativead.MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        if (!Native_Btn_Color.isEmpty()) {
            adView.findViewById(R.id.ad_call_to_action).setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));

        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        ((TextView) (adView.getHeadlineView())).setText(nativeAd.getHeadline());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (!Native_Btn_Text_Size.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }

        if (!Native_Btn_Text_Color.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (!Native_Btn_text.isEmpty()) {
                ((TextView) adView.getCallToActionView()).setText(Native_Btn_text);
            } else {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }

        adView.setNativeAd(nativeAd);
    }


    /// old native code ------------------------------------------------------------------------

    public void showNative(ViewGroup nativeAdContainer) {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (Native_Ads_On.equalsIgnoreCase("true")) {
            displayNative(nativeAdContainer);
        }
    }

    public void displayNative(ViewGroup nativeAdContainer) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("false")) {
            showFacebookNative(nativeAdContainer, FB_Native_ID1);
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && AD_MOB_STATUS.equalsIgnoreCase("true")) {
            if (app_AdsPriority.equalsIgnoreCase("google")) {
                showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            } else {
                showFacebookNative(nativeAdContainer, FB_Native_ID1);
            }
        }
    }

    public void showFacebookNative(final ViewGroup nativeAdContainer, String facebook_n1) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }

        if (fbNativeAd_preLoad == null) {
            final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, facebook_n1);

            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {

                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    showFacebookNative2(nativeAdContainer, FB_Native_ID2);
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    if (nativeAd == null || nativeAd != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd, nativeAdContainer, facebook_n1);
                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            }).build());
        } else {
            state_fbNative = "Start";
            inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n1);
        }

    }

    public void showFacebookNative2(final ViewGroup nativeAdContainer, String facebook_n2) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }

        if (fbNativeAd_preLoad == null) {
            final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, facebook_n2);

            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {

                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    showFacebookNative3(nativeAdContainer, FB_Native_ID3);
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    if (nativeAd == null || nativeAd != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd, nativeAdContainer, facebook_n2);
                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            }).build());
        } else {
            state_fbNative = "Start";
            inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n2);
        }
    }

    public void showFacebookNative3(final ViewGroup nativeAdContainer, String facebook_n3) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }

        if (fbNativeAd_preLoad == null) {
            Log.e(TAG, "showFacebookNative3IF: ");
            final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, facebook_n3);
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {
                    Log.e(TAG, "onMediaDownloaded: ");
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    Log.e(TAG, "onError: ");
                    showFacebookNative4(nativeAdContainer, FB_Native_ID4);
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    Log.e(TAG, "onAdLoaded: " + nativeAd);
                    if (nativeAd == null || nativeAd != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd, nativeAdContainer, facebook_n3);
                }

                @Override
                public void onAdClicked(Ad ad) {
                    Log.e(TAG, "onAdClicked: ");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    Log.e(TAG, "onLoggingImpression: ");
                }
            }).build());
        } else {
            Log.e(TAG, "showFacebookNative3else: ");
            state_fbNative = "Start";
            inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n3);
        }
    }

    public void showFacebookNative4(final ViewGroup nativeAdContainer, String facebook_n4) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }

        if (fbNativeAd_preLoad == null) {
            final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, facebook_n4);
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {

                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                        showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
                    }

                    /*if (AD_MOB_STATUS.equalsIgnoreCase("true")) {
                        showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
                    } else {
                        onlyCustNativeCallAD(activity);
                    }*/
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    if (nativeAd == null || nativeAd != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd, nativeAdContainer, facebook_n4);
                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            }).build());
        } else {

            state_fbNative = "Start";
            inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n4);
        }
    }

    public void inflate_NATIV_FB(com.facebook.ads.NativeAd nativeAd, ViewGroup card, String facebook_n) {
        nativeAd.unregisterView();
        LayoutInflater inflater = LayoutInflater.from(activity);
        View adView = inflater.inflate(R.layout.fb_native_layout, null);

        card.removeAllViews();
        card.addView(adView);

        NativeAdLayout nativeAdLayout = adView.findViewById(R.id.nativview);

        LinearLayout adChoicesContainer = adView.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        MediaView nativeAdIcon = adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = adView.findViewById(R.id.native_ad_title);
        MediaView nativeAdMedia = adView.findViewById(R.id.native_ad_media);
        TextView nativeAdSocialContext = adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdBody = adView.findViewById(R.id.native_ad_body);
        TextView sponsoredLabel = adView.findViewById(R.id.native_ad_sponsored_label);
        TextView nativeAdCallToAction = adView.findViewById(R.id.native_ad_call_to_action);

        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);

        if (!Native_Btn_Text_Size.isEmpty()) {
            nativeAdCallToAction.setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }

        if (!Native_Btn_text.isEmpty()) {
            nativeAdCallToAction.setText(Native_Btn_text);
        } else {
            nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        }

        if (!Native_Btn_Text_Color.isEmpty()) {
            nativeAdCallToAction.setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }

        if (!Native_Btn_Color.isEmpty()) {
            nativeAdCallToAction.setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }

        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());
        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdBody);
        clickableViews.add(nativeAdCallToAction);
        clickableViews.add(nativeAdIcon);
        clickableViews.add(nativeAdSocialContext);

        nativeAd.registerViewForInteraction(
                adView,
                nativeAdMedia,
                nativeAdIcon,
                clickableViews);


        if (preloadNative_AdStatus == true && (state_fbNative.equals("Start")) || state_fbNative.equals("Fail")) {
//            if ((facebook_loadAdIdsType == 0 || facebook_loadAdIdsType == 2 || facebook_n.equals("random")) && !facebook_n.isEmpty()) {
//                facebook_n = getRandomPlacementId(FACEBOOK, "N");
//            }
            if (facebook_n.isEmpty()) {
                return;
            }
            state_fbNative = "Loading";
            final com.facebook.ads.NativeAd nativeAd1 = new com.facebook.ads.NativeAd(activity, facebook_n);
            nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override
                public void onMediaDownloaded(Ad ad) {
                    Log.e(TAG, "onMediaDownloadedinflate: ");
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    Log.e(TAG, "onErrorinflate: ");
                    state_fbNative = "Fail";
                    fbNativeAd_preLoad = null;
                    showFacebookNative(card, facebook_n);

                }

                @Override
                public void onAdLoaded(Ad ad) {
                    Log.e(TAG, "onAdLoadedinflate: ");
                    if (nativeAd1 == null || nativeAd1 != ad) {
                        Log.e(TAG, "onAdLoadedIFinflate: ");
                        return;
                    }
                    fbNativeAd_preLoad = null;
                    fbNativeAd_preLoad = nativeAd1;
                    state_fbNative = "Loaded";

                }

                @Override
                public void onAdClicked(Ad ad) {
                    Log.e(TAG, "onAdClickedinflate: ");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    Log.e(TAG, "onLoggingImpressioninflate: ");

                }
            }).build());
        } else {
            Log.e("fb_stateinflate", "proccess");
        }
    }

    public void showAdmobNative(final ViewGroup nativeAdContainer, String admob_native1) {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            Log.e(TAG, "showAdmobNativePreloadIF: " + admob_native1);
            final AdLoader adLoader = new AdLoader.Builder(activity, admob_native1)
                    .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(NativeAd nativeAd) {
                            Log.e(TAG, "onNativeAdLoaded0condition::");
                            // Show the ad.
                            inflate_NATIV_ADMOB(nativeAd, nativeAdContainer, admob_native1);
                        }
                    })
                    .withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError adError) {
                            Log.e(TAG, "onAdFailedToLoad0condition:: ");
                            showAdmobNative2(nativeAdContainer, AD_MOB_APP_ID_Native2);
                        }
                    })
                    .withNativeAdOptions(new NativeAdOptions.Builder()
                            // Methods in the NativeAdOptions.Builder class can be
                            // used here to specify individual options settings.
                            .build())
                    .build();
            adLoader.loadAd(new AdRequest.Builder().build());
        } else {
            state_admobNative = "Start";
            inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native1);
        }
    }

    public void showAdmobNative2(final ViewGroup nativeAdContainer, String admob_native2) {
        Log.e(TAG, "showAdmobNative2: " + admob_native2);
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            final AdLoader adLoader = new AdLoader.Builder(activity, admob_native2)
                    .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(NativeAd nativeAd) {
                            Log.e(TAG, "onNativeAdLoaded0condition2::");
                            // Show the ad.
                            inflate_NATIV_ADMOB(nativeAd, nativeAdContainer, admob_native2);
                        }
                    })
                    .withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError adError) {
                            Log.e(TAG, "onAdFailedToLoad0condition2:: ");
                            showAdmobNative3(nativeAdContainer, AD_MOB_APP_ID_Native3);
                        }
                    })
                    .withNativeAdOptions(new NativeAdOptions.Builder()
                            // Methods in the NativeAdOptions.Builder class can be
                            // used here to specify individual options settings.
                            .build())
                    .build();
            adLoader.loadAd(new AdRequest.Builder().build());
        } else {
            state_admobNative = "Start";
            inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native2);
        }
    }

    public void showAdmobNative3(final ViewGroup nativeAdContainer, String admob_native3) {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            Log.e(TAG, "showAdmobNative3PreloadIF3: " + admob_native3);
            final AdLoader adLoader = new AdLoader.Builder(activity, admob_native3)
                    .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(NativeAd nativeAd) {
                            Log.e(TAG, "onNativeAdLoaded0condition3::");
                            // Show the ad.
                            inflate_NATIV_ADMOB(nativeAd, nativeAdContainer, admob_native3);
                        }
                    })
                    .withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError adError) {
                            Log.e(TAG, "onAdFailedToLoad0condition3:: ");
                            showAdmobNative4(nativeAdContainer, AD_MOB_APP_ID_Native4);
                        }
                    })
                    .withNativeAdOptions(new NativeAdOptions.Builder()
                            // Methods in the NativeAdOptions.Builder class can be
                            // used here to specify individual options settings.
                            .build())
                    .build();
            adLoader.loadAd(new AdRequest.Builder().build());
        } else {
            state_admobNative = "Start";
            inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native3);
        }
    }

    public void showAdmobNative4(final ViewGroup nativeAdContainer, String admob_native4) {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            Log.e(TAG, "showAdmobNative4PreloadIF4: " + admob_native4);
            final AdLoader adLoader = new AdLoader.Builder(activity, admob_native4)
                    .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(NativeAd nativeAd) {
                            Log.e(TAG, "3onNativeAdLoaded0condition4::");
                            // Show the ad.
                            inflate_NATIV_ADMOB(nativeAd, nativeAdContainer, admob_native4);
                        }
                    })
                    .withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError adError) {
                            Log.e(TAG, "onAdFailedToLoad0condition4:: ");

                            if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                                showFacebookNative(nativeAdContainer, FB_Native_ID1);
                            }
                            // onlyCustNativeCallAD(activity);
                        }
                    })
                    .withNativeAdOptions(new NativeAdOptions.Builder()
                            // Methods in the NativeAdOptions.Builder class can be
                            // used here to specify individual options settings.
                            .build())
                    .build();
            adLoader.loadAd(new AdRequest.Builder().build());
        } else {
            state_admobNative = "Start";
            inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native4);
        }
    }

    public void inflate_NATIV_ADMOB(NativeAd nativeAd, ViewGroup nativeAdContainer, String admob_native) {

        nativeAdContainer.setVisibility(View.VISIBLE);
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = null;

        if (Native_Ad_Small_Size_normal.equals("true")) {
            view = inflater.inflate(R.layout.native_small_normal_admob, null);
        } else if (Native_Ad_Shape_Square_Corner.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_square, null);
        } else if (Native_Ad_Shape_Normal_Round_Btn.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_normal_round_btn, null);
        } else if (Native_Ad_Small_Size_Edited.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_small_size_edited, null);
        } else {
            view = inflater.inflate(R.layout.native_admob_square, null);
        }

        nativeAdContainer.removeAllViews();
        nativeAdContainer.addView(view);

        NativeAdView adView = (NativeAdView) view.findViewById(R.id.uadview);

        adView.setMediaView((com.google.android.gms.ads.nativead.MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        if (!Native_Btn_Color.isEmpty()) {
            adView.findViewById(R.id.ad_call_to_action).setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));

        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        ((TextView) (adView.getHeadlineView())).setText(nativeAd.getHeadline());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (!Native_Btn_Text_Size.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }

        if (!Native_Btn_Text_Color.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (!Native_Btn_text.isEmpty()) {
                ((TextView) adView.getCallToActionView()).setText(Native_Btn_text);
            } else {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }

        adView.setNativeAd(nativeAd);

        if (preloadNative_AdStatus == true && (state_admobNative.equals("Start")) || state_admobNative.equals("Fail")) {

            Log.e(TAG, "inflate_NATIV_ADMOBIFTruePreload: " + preloadNative_AdStatus);

//            if ((admob_loadAdIdsType == 0 || admob_loadAdIdsType == 2 || admob_db.equals("random")) && !admob_db.isEmpty()) {
//                Log.e(TAG, "inflate_NATIV_ADMOBRandmandCondition: ");
//                admob_db = getRandomPlacementId(ADMOB, "N");
//            }

            if (admob_native.isEmpty()) {
                Log.e(TAG, "inflate_NATIV_ADMOBadmob_dbEmityConditomnif: " + admob_native);
                return;
            }

            state_admobNative = "Loading";
            final AdLoader adLoader = new AdLoader.Builder(activity, admob_native)
                    .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                        @Override
                        public void onNativeAdLoaded(NativeAd nativeAd) {
                            // Show the ad.
                            Log.e(TAG, "MainonNativeAdLoaded: ");
                            admobNativeAd_preLoad = null;
                            admobNativeAd_preLoad = nativeAd;
                            state_admobNative = "Loaded";
                        }
                    })

                    .withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError adError) {
                            // Handle the failure by logging, altering the UI, and so on.
                            admobNativeAd_preLoad = null;
                            state_admobNative = "Fail";
                            showAdmobNative(nativeAdContainer, admob_native);

                        }
                    })
                    .withNativeAdOptions(new NativeAdOptions.Builder()
                            // Methods in the NativeAdOptions.Builder class can be
                            // used here to specify individual options settings.
                            .build())
                    .build();
            adLoader.loadAd(new AdRequest.Builder().build());
        } else {
            Log.e("admob_state", "proccess");
        }
    }

    /// inters code ------------------------------------------------------------------------

    public void loadInterstitialAd(Activity activity) {
        turnLoadInterstitialAd(activity, AD_MOB_APP_ID_Inter1, FB_Inter_ID1);
    }

    public void turnLoadInterstitialAd(Activity activity, String google_i, String facebook_i) {
        if (app_AllAdShowStatus == 0) {
            return;
        }

        if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google") && !google_i.isEmpty() && !google_i_pre.equals(google_i)) {
            loadAdmobInterstitial(activity, google_i);
        }


        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook") && !facebook_i.isEmpty() && !facebook_i_pre.equals(facebook_i)) {
            loadFacebookInterstitial(activity, facebook_i);
        }

    }

    public void showInterstitialAd(Activity context, MyCallback myCallback, int how_many_clicks) {

        turnInterstitialAd(context, myCallback, how_many_clicks);
    }

    public void turnInterstitialAd(Activity context, MyCallback myCallback2, int how_many_clicks) {
        myCallback = myCallback2;

        count_click++;

        if (app_AllAdShowStatus == 0) {
            if (myCallback != null) {
                myCallback.callbackCall();
                myCallback = null;
            }
            return;
        }
        if (how_many_clicks != 0) {
            if (count_click % how_many_clicks != 0) {
                if (myCallback != null) {
                    myCallback.callbackCall();
                    myCallback = null;
                }
                return;
            }
        }

        displayInterstitialAd(context);
    }

    public void displayInterstitialAd(final Activity context) {
        dialog = new Dialog(context);
        View view = LayoutInflater.from(context).inflate(R.layout.ad_loading_dialog, null);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(view);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();


        if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
            if (mInterstitialAd != null) {
                if (Dialog_Show.equalsIgnoreCase("true")) {
                    dialog.show();

                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            double time = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override
                        public void onFinish() {
                            dialog.dismiss();
                            mInterstitialAd.show((Activity) context);
                        }
                    }.start();

                } else {
                    mInterstitialAd.show((Activity) context);
                }
            } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true")) {
                if (fbinterstitialAd1.isAdLoaded()) {
                    if (Dialog_Show.equalsIgnoreCase("true")) {
                        dialog.show();

                        new CountDownTimer(ad_dialog_time_in_second * 1000, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                double time = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                            }

                            @Override
                            public void onFinish() {
                                dialog.dismiss();
                                fbinterstitialAd1.show();
                            }
                        }.start();

                    } else {
                        fbinterstitialAd1.show();
                    }
                }
            } else {
                if (!google_i_pre.isEmpty()) {
                    loadAdmobInterstitial((Activity) context, google_i_pre);
                }
                nextInterstitialPlatform();
            }
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
            if (fbinterstitialAd1.isAdLoaded()) {
                if (Dialog_Show.equalsIgnoreCase("true")) {
                    dialog.show();

                    new CountDownTimer(ad_dialog_time_in_second * 1000, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            double time = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override
                        public void onFinish() {
                            dialog.dismiss();
                            fbinterstitialAd1.show();
                        }
                    }.start();

                } else {
                    fbinterstitialAd1.show();
                }
            } else if (AD_MOB_STATUS.equalsIgnoreCase("true")) {
                if (mInterstitialAd != null) {
                    if (Dialog_Show.equalsIgnoreCase("true")) {
                        dialog.show();

                        new CountDownTimer(ad_dialog_time_in_second * 1000, 10) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                double time = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                            }

                            @Override
                            public void onFinish() {
                                dialog.dismiss();
                                mInterstitialAd.show((Activity) context);
                            }
                        }.start();

                    } else {
                        mInterstitialAd.show((Activity) context);
                    }
                }
            } else {
                loadFacebookInterstitial((Activity) context, facebook_i_pre);
                nextInterstitialPlatform();
            }

        } else {
            nextInterstitialPlatform();
        }
    }

    public void loadAdmobInterstitial(final Activity activity, String google_i) {
        this.google_i_pre = google_i;

        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(activity, google_i, adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.e(TAG, "onAdLoadedgg1");

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.e("TAG", "onAdDismissedFullScreenContentgg1");
                        google_i_pre = AD_MOB_APP_ID_Inter1;
                        if (!google_i_pre.isEmpty()) {
                            loadAdmobInterstitial(activity, google_i_pre);
                        }

                        interstitialCallBack();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.e("TAG", "onAdFailedToShowFullScreenContentgg1");
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        mInterstitialAd = null;
                        Log.e("TAG", "onAdShowedFullScreenContentgg1");
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                Log.e(TAG, "onAdFailedToLoadgg1");
                mInterstitialAd = null;

                google_i_pre = AD_MOB_APP_ID_Inter2;
                if (!google_i_pre.isEmpty()) {
                    loadAdmobInterstitial2(activity, google_i_pre);
                }
            }
        });

    }

    public void loadAdmobInterstitial2(final Activity activity, String google_i) {
        this.google_i_pre = google_i;

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(activity, google_i, adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.e(TAG, "onAdLoadedgg2");

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.e("TAG", "onAdDismissedFullScreenContentgg2");
                        google_i_pre = AD_MOB_APP_ID_Inter2;
                        if (!google_i_pre.isEmpty()) {
                            loadAdmobInterstitial2(activity, google_i_pre);
                        }

                        interstitialCallBack();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.e("TAG", "onAdFailedToShowFullScreenContentgg2");
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        mInterstitialAd = null;
                        Log.e("TAG", "onAdShowedFullScreenContentgg2");
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                Log.e(TAG, "onAdFailedToLoadgg2");
                mInterstitialAd = null;

                google_i_pre = AD_MOB_APP_ID_Inter3;
                if (!google_i_pre.isEmpty()) {
                    loadAdmobInterstitial3(activity, google_i_pre);
                }
            }
        });

    }

    public void loadAdmobInterstitial3(final Activity activity, String google_i) {
        this.google_i_pre = google_i;

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(activity, google_i, adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                // interCalledSuccess = "true";
                mInterstitialAd = interstitialAd;
                Log.e(TAG, "onAdLoadedgg3");

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.e("TAG", "onAdDismissedFullScreenContentgg3");
                        google_i_pre = AD_MOB_APP_ID_Inter3;
                        if (!google_i_pre.isEmpty()) {
                            loadAdmobInterstitial3(activity, google_i_pre);
                        }
                        interstitialCallBack();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.e("TAG", "onAdFailedToShowFullScreenContentgg3");
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        // Called when fullscreen content is shown.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        Log.e("TAG", "onAdShowedFullScreenContentgg3");
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                Log.e(TAG, "onAdFailedToLoadgg3");
                mInterstitialAd = null;
                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadFacebookInterstitial(activity, FB_Inter_ID1);
                }
            }
        });
    }

    public void loadFacebookInterstitial(final Activity activity, String facebook_i) {
        facebook_i_pre = facebook_i;

        fbinterstitialAd1 = new com.facebook.ads.InterstitialAd(activity, facebook_i);
        fbinterstitialAd1.loadAd(fbinterstitialAd1.buildLoadAdConfig().withAdListener(new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                super.onError(ad, error);
                Log.e(TAG, "onError1: ");
                if (!facebook_i_pre.isEmpty()) {
                    loadFacebookInterstitial2(activity, FB_Inter_ID2);
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoaded1: ");
                super.onAdLoaded(ad);
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "onInterstitialDismissed1: ");
                super.onInterstitialDismissed(ad);
                loadFacebookInterstitial(activity, facebook_i_pre);
                interstitialCallBack();
            }
        }).build());
    }

    public void loadFacebookInterstitial2(final Activity activity, String facebook_i) {
        facebook_i_pre = facebook_i;

        fbinterstitialAd1 = new com.facebook.ads.InterstitialAd(activity, facebook_i);
        fbinterstitialAd1.loadAd(fbinterstitialAd1.buildLoadAdConfig().withAdListener(new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                Log.e(TAG, "onError2: ");
                super.onError(ad, error);
                if (!facebook_i_pre.isEmpty()) {
                    loadFacebookInterstitial3(activity, FB_Inter_ID3);
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoaded2: ");
                super.onAdLoaded(ad);
                //  interCalledSuccess = "true";
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "onInterstitialDismissed2: ");
                super.onInterstitialDismissed(ad);
                loadFacebookInterstitial(activity, facebook_i_pre);
                interstitialCallBack();
            }
        }).build());
    }

    public void loadFacebookInterstitial3(final Activity activity, String facebook_i) {
        facebook_i_pre = facebook_i;

        fbinterstitialAd1 = new com.facebook.ads.InterstitialAd(activity, facebook_i);
        fbinterstitialAd1.loadAd(fbinterstitialAd1.buildLoadAdConfig().withAdListener(new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                super.onError(ad, error);
                Log.e(TAG, "onErrorinter3: ");
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadAdmobInterstitial(activity, AD_MOB_APP_ID_Inter1);
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {
                super.onAdLoaded(ad);
                Log.e(TAG, "onAdLoaded3: ");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "onInterstitialDismissed3: ");
                super.onInterstitialDismissed(ad);
                loadFacebookInterstitial(activity, facebook_i_pre);
                interstitialCallBack();
            }
        }).build());
    }

    public void interstitialCallBack() {

        if (myCallback != null) {
            myCallback.callbackCall();
            Main_IO_Units.myCallback = null;
        }
    }

    public interface MyCallback {
        void callbackCall();
    }

    public void nextInterstitialPlatform() {
        interstitialCallBack();
    }


    /// custome code ------------------------------------------------------------------------

    public void onlyCustBannerCallAD(Activity activity) {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (app_OnlyBannerADShow.equalsIgnoreCase("true")) {
            LinearLayout iv_qurekabanner = activity.findViewById(R.id.iv_qurekabanner);
            ImageView nbanner_icon_view = activity.findViewById(R.id.nbanner_icon_view);
            TextView banner_ad_title = activity.findViewById(R.id.banner_ad_title);
            TextView banner_subhander = activity.findViewById(R.id.banner_subhander);
            TextView bner_install = activity.findViewById(R.id.bner_install);

            iv_qurekabanner.setVisibility(View.VISIBLE);
            Glide.with(activity).load(app_CustomeAdBannerIcon).into(nbanner_icon_view);
            banner_ad_title.setText(app_CustomeAdBannerHanderText);
            banner_subhander.setText(app_CustomeAdBannerSubHanderText);
            bner_install.setText(app_CustomeAdBannerInstallText);

            iv_qurekabanner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openChromeCustomTabUrl(activity, app_CustomeADBannerLink);
                }
            });
        }
    }

    public void onlyCustNativeCallAD(Activity activity) {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (app_OnlyNativeADShow.equalsIgnoreCase("true")) {
            LinearLayout iv_qurekanative = activity.findViewById(R.id.iv_qurekanative);
            ImageView ad_app_icon = activity.findViewById(R.id.ad_app_icon);
            ImageView ad_image = activity.findViewById(R.id.ad_image);
            TextView ad_headline = activity.findViewById(R.id.ad_headline);
            TextView ad_subheadline = activity.findViewById(R.id.ad_subheadline);
            TextView ad_subheadline2 = activity.findViewById(R.id.ad_subheadline2);
            TextView ad_call_to_action = activity.findViewById(R.id.ad_call_to_action);

            iv_qurekanative.setVisibility(View.VISIBLE);
            Glide.with(activity).load(app_CustomeAdNativeLargeImage).into(ad_image);
            Glide.with(activity).load(app_CustomeAdNativeIconImage).into(ad_app_icon);
            ad_headline.setText(app_CustomeAdNativeTitle);
            ad_subheadline.setText(app_CustomeAdNativesubHander);
            ad_subheadline2.setText(app_CustomeAdNativesubHander2);
            ad_call_to_action.setText(app_CustomeAdNativeInstallText);


            iv_qurekanative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openChromeCustomTabUrl(activity, app_CustomeADNativeLink);
                }
            });
        }
    }

    public void onlyCustInterstitialCallAD(Activity activity) {
        if (app_AllAdShowStatus == 0) {
            return;
        }

        if (app_OnlyInterstitalADShow.equalsIgnoreCase("true")) {
            Custcadscnt_click++;
            if (app_CustClickCntSAd != 0) {
                if (Custcadscnt_click % app_CustClickCntSAd != 0) {
                    if (app_CustomeADText.equalsIgnoreCase("Qureka")) {
                        displayQurekaInterstitialAd(activity, app_CustomeAdQurekaLink);
                    } else if (app_CustomeADText.equalsIgnoreCase("Custome")) {
                        Rect displayRectangle = new Rect();
                        Window window = activity.getWindow();
                        window.getDecorView().getWindowVisibleDisplayFrame(displayRectangle);
                        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        ViewGroup viewGroup = activity.findViewById(android.R.id.content);
                        View dialogView = LayoutInflater.from(activity).inflate(R.layout.custome_interstitial, viewGroup, false);
                        dialogView.setMinimumWidth((int) (displayRectangle.width() * 1f));
                        dialogView.setMinimumHeight((int) (displayRectangle.height() * 1f));
                        builder.setView(dialogView);
                        final AlertDialog alertDialog = builder.create();
                        LinearLayout intest_layout = dialogView.findViewById(R.id.intest_layout);
                        intest_layout.setVisibility(View.VISIBLE);
                        ImageView iv_intersFullImage = dialogView.findViewById(R.id.iv_intersFullImage);
                        ImageView iv_intersFullImageCancel = dialogView.findViewById(R.id.iv_intersFullImageCancel);

                        Glide.with(activity).load(app_CustomeAdInterFullscreenImg).into(iv_intersFullImage);

                        iv_intersFullImage.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                alertDialog.dismiss();
                                try {
                                    activity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(app_CustomeAdInterstitialLink)));
                                } catch (ActivityNotFoundException e) {
                                    activity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(app_CustomeAdInterstitialLink)));
                                }
                            }
                        });

                        iv_intersFullImageCancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                alertDialog.dismiss();
                            }
                        });
                        alertDialog.show();
                    }
                    return;
                }
            }


        }
    }

    public void displayQurekaInterstitialAd(final Context context, String s) {
        Dialog dialog = new Dialog(context);
        View view = LayoutInflater.from(context).inflate(R.layout.ad_loading_dialog, null);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(view);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();

        if (Dialog_Show.equalsIgnoreCase("true")) {
            dialog.show();
            new CountDownTimer(ad_dialog_time_in_second * 1000, 10) {
                @Override
                public void onTick(long millisUntilFinished) {
                    double time = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                }

                @Override
                public void onFinish() {
                    dialog.dismiss();
                    openChromeCustomTabUrl(context, s);
                }
            }.start();
        } else {
            openChromeCustomTabUrl(context, s);
        }
    }

    public void openChromeCustomTabUrl(Context activity, String s) {
        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            int coolorInt = Color.parseColor("#66bb6a");
            builder.setToolbarColor(coolorInt);
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.intent.setPackage("com.android.chrome");
            customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            customTabsIntent.launchUrl(activity, Uri.parse(s));
            // builder.setActionButton("")
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
