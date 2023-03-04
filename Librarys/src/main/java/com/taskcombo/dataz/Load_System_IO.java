package com.taskcombo.dataz;

import static com.taskcombo.dataz.Main_IO_Units.app_BannerPeriority;
import static com.taskcombo.dataz.Main_IO_Units.app_NativeAdCodeType;
import static com.taskcombo.dataz.Main_IO_Units.app_UpdatePackageName;
import static com.taskcombo.dataz.Main_IO_Units.app_newPackageName;
import static com.taskcombo.dataz.Main_IO_Units.app_onesingle_appid;
import static com.taskcombo.dataz.Main_IO_Units.app_redirectOtherAppStatus;
import static com.taskcombo.dataz.Main_IO_Units.app_updateAppDialogStatus;
import static com.taskcombo.dataz.Main_IO_Units.app_versionCode;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.onesignal.OneSignal;

import org.json.JSONObject;
import java.util.Arrays;

public class Load_System_IO {
    public static Activity activity;
    public static Load_System_IO loadSystemIO;
    public static String mode = "";
    public static boolean isShowOpen = false;
    public static AppOpenManager appOpenManager;
    public static Intent intent;
    public static boolean need_internet = false;
    public static boolean is_retry;
    public static Handler refreshHandler;
    public static Runnable runnable;
    public static int vercode;

    public Load_System_IO(Activity activity1) {
        activity = activity1;
    }
    public static Load_System_IO getInstance(Activity activity1) {
        activity = activity1;
        if (loadSystemIO == null) {
            loadSystemIO = new Load_System_IO(activity);
        }
        return loadSystemIO;
    }
    public void sendRequest(String model, Intent intent1, final int cversion) {
        if (!model.isEmpty()) {
            need_internet = true;
        } else {
            need_internet = false;
        }

        vercode = cversion;
        final Dialog dialog = new Dialog(activity);
        dialog.setCancelable(false);
        View view = activity.getLayoutInflater().inflate(R.layout.internet_retry_layout, null);
        dialog.setContentView(view);
        final TextView retry_buttton = view.findViewById(R.id.retry_buttton);

        if (!isNetworkAvailable(activity) && need_internet) {
            is_retry = false;
            dialog.show();
        }

        dialog.dismiss();
        refreshHandler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (isNetworkAvailable(activity)) {
                    is_retry = true;
                    retry_buttton.setText("Retry Again");
                } else if (need_internet) {
                    dialog.show();
                    is_retry = false;
                    retry_buttton.setText("Please Connect To Internet");
                }
                refreshHandler.postDelayed(this, 1000);
            }
        };

        refreshHandler.postDelayed(runnable, 1000);

        retry_buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (is_retry) {
                    if (need_internet) {
                        activity.startActivity(new Intent(activity, activity.getClass()));
                        activity.finish();
                    } else {
                        SuccessloadedRedirect();
                    }
                } else {
                    activity.startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
                }
            }
        });

        intent = intent1;
        String ghtjdfl679056 = activity.getString(R.string.error_msg1);
        try {
            mode = Algo_Utils.getRandomInt(ghtjdfl679056);
        } catch (Exception e) {
            // e.printStackTrace();
        }
        RequestQueue queue = Volley.newRequestQueue(activity);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, mode + model, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    if (jsonObject.getInt("success") == 1) {
                        Main_IO_Units.getInstance(activity).configDatas(jsonObject);
                        Data_Initializing();
                    } else {
                        Toast.makeText(activity, "Not Found Data!!!", Toast.LENGTH_LONG).show();
                    }

                } catch (Exception e) {
                    if (need_internet) {
                        dialog.dismiss();
                        refreshHandler = new Handler();
                        runnable = new Runnable() {
                            @Override
                            public void run() {
                                if (isNetworkAvailable(activity)) {
                                    is_retry = true;
                                    retry_buttton.setText("Retry Again");
                                } else {
                                    dialog.show();
                                    is_retry = false;
                                    retry_buttton.setText("Please Connect To Internet");
                                }
                                refreshHandler.postDelayed(this, 1000);
                            }
                        };
                    } else {
                        SuccessloadedRedirect();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if (need_internet) {
                    dialog.dismiss();
                    refreshHandler = new Handler();
                    runnable = new Runnable() {
                        @Override
                        public void run() {
                            if (isNetworkAvailable(activity)) {
                                is_retry = true;
                                retry_buttton.setText("Retry Again");
                            } else {
                                dialog.show();
                                is_retry = false;
                                retry_buttton.setText("Please Connect To Internet");
                            }
                            refreshHandler.postDelayed(this, 1000);
                        }
                    };
                } else {
                    SuccessloadedRedirect();
                }

            }
        });
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(8000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);

    }

    public void Data_Initializing() {
        Main_IO_Units.getInstance(activity).loadInterstitialAd(activity);

        if (app_BannerPeriority.equalsIgnoreCase("nativebanner")) {
            Main_IO_Units.getInstance(activity).Load_NativeBannerAds();
        } else {
            Main_IO_Units.getInstance(activity).Load_BannerAds();
        }

        if (app_NativeAdCodeType.equalsIgnoreCase("new")) {
            Main_IO_Units.getInstance(activity).Load_NativeNewAds();
        }

        if (app_onesingle_appid != null) {
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
            OneSignal.initWithContext(activity);
            OneSignal.setAppId(app_onesingle_appid);
        }

        if (app_redirectOtherAppStatus == 1) {
            showRedirectDialog(activity, app_newPackageName);
            return;
        } else if (app_updateAppDialogStatus == 1 && checkUpdate(vercode)) {
            showUpdateDialog(activity, app_UpdatePackageName);
            return;
        }

        isShowOpen = false;
        AppOpenManager.OnAppOpenClose onAppOpenClose = new AppOpenManager.OnAppOpenClose() {
            @Override
            public void OnAppOpenFailToLoad() {
                if (isShowOpen) {
                    isShowOpen = false;
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Main_IO_Units.appOpenFailLoadeds(new Main_IO_Units.OnAdListner() {
                                @Override
                                public void OnClose() {
                                    failInterLoadRedict();
                                }
                            });
                        }
                    }, 5000);
                }
            }

            @Override
            public void OnAppOpenClose() {
                if (isShowOpen) {
                    isShowOpen = false;

                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            SuccessloadedRedirect();
                        }
                    }, 1000);
                }
            }
        };
        isShowOpen = true;
        appOpenManager = new AppOpenManager(Applicationclass.getInstant(), onAppOpenClose);
    }

    public void SuccessloadedRedirect() {
        activity.startActivity(intent);
    }
    public void failInterLoadRedict() {
        Main_IO_Units.getInstance(activity).showInterstitialAd(activity, new Main_IO_Units.MyCallback() {
            public void callbackCall() {
                SuccessloadedRedirect();
            }
        }, 1);
    }

    public static boolean isNetworkAvailable(Activity contnex) {
        ConnectivityManager manager =
                (ConnectivityManager) contnex.getSystemService(Context.CONNECTIVITY_SERVICE);
        @SuppressLint("MissingPermission")
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean isAvailable = false;
        if (networkInfo != null && networkInfo.isConnected()) {
            // Network is present and connected
            isAvailable = true;
        }
        return isAvailable;
    }


    // rediret another app

    public static void showRedirectDialog(Activity context, final String url) {

        final Dialog dialog = new Dialog(context);
        dialog.setCancelable(false);
        View view = context.getLayoutInflater().inflate(R.layout.redirect_newapp_dialog, null);
        dialog.setContentView(view);
        TextView update = view.findViewById(R.id.update);
        TextView txt_title = view.findViewById(R.id.txt_titles);

        update.setText("Install Now");
        txt_title.setText("Install our new app now and enjoy");

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Uri marketUri = Uri.parse(url);
                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
                    context.startActivity(marketIntent);
                } catch (ActivityNotFoundException ignored1) {
                }
            }
        });

        dialog.create();
        dialog.show();
    }
    public static boolean checkUpdate(int cversion) {
        if (app_updateAppDialogStatus == 1) {
            String str[] = app_versionCode.split(",");

            try {
                if (Arrays.asList(str).contains(cversion + "")) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static void showUpdateDialog(Activity context, String updatePackageName) {
        final Dialog dialog = new Dialog(context);
        dialog.setCancelable(false);
        View view = context.getLayoutInflater().inflate(R.layout.redirect_newapp_dialog, null);
        dialog.setContentView(view);
        TextView update = view.findViewById(R.id.update);
        TextView txt_title = view.findViewById(R.id.txt_titles);
        update.setText("Update Now");
        txt_title.setText("Update our new app now and enjoy");

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Uri marketUri = Uri.parse("https://play.google.com/store/apps/details?id=" + updatePackageName);
                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
                    context.startActivity(marketIntent);
                } catch (ActivityNotFoundException ignored1) {
                }
            }
        });
        dialog.create();
        dialog.show();
    }
}
