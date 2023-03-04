package com.taskcombo.dataz;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Circuit_Checker_Manage {
    public static Activity activity;
    public static Circuit_Checker_Manage circuitCheckerManage;
    public static boolean need_internet1 = false;
    public static boolean is_retry1;
    public static Handler refreshHandler1;
    public static Runnable runnable1;

    public Circuit_Checker_Manage(Activity activity1) {
        activity = activity1;
    }

    public static Circuit_Checker_Manage getInstance(Activity activity1) {
        activity = activity1;
        if (circuitCheckerManage == null) {
            circuitCheckerManage = new Circuit_Checker_Manage(activity);
        }
        return circuitCheckerManage;
    }

    public void ADSinit(final Activity activity1, Intent intent1, String url1, final int cversion) {
        if (!url1.isEmpty()) {
            need_internet1 = true;
        } else {
            need_internet1 = false;
        }
        final Dialog dialog = new Dialog(activity);
        dialog.setCancelable(false);
        View view = activity.getLayoutInflater().inflate(R.layout.internet_retry_layout, null);
        dialog.setContentView(view);
        final TextView retry_buttton = view.findViewById(R.id.retry_buttton);

        if (!isNetworkAvailable(activity) && need_internet1) {
            is_retry1 = false;
            dialog.show();
        }

        dialog.dismiss();
        refreshHandler1 = new Handler();
        runnable1 = new Runnable() {
            @Override
            public void run() {
                if (isNetworkAvailable(activity)) {
                    is_retry1 = true;
                    retry_buttton.setText("Retry Again");
                } else if (need_internet1) {
                    dialog.show();
                    is_retry1 = false;
                    retry_buttton.setText("Please Connect To Internet");
                }
                refreshHandler1.postDelayed(this, 1000);
            }
        };

        refreshHandler1.postDelayed(runnable1, 1000);

        retry_buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (is_retry1) {
                    if (need_internet1) {
                        activity.startActivity(new Intent(activity, activity.getClass()));
                        activity.finish();
                    }
                } else {
                    activity.startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
                }
            }
        });

        Log.e("TAG", "Success Return  Response:");
        Load_System_IO.getInstance(activity1).sendRequest(url1, intent1, cversion);

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

}



