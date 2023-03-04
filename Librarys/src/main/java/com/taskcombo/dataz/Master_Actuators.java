package com.taskcombo.dataz;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class Master_Actuators extends AppCompatActivity {

    Handler handlerr = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getCurrentVersionCode(this);
    }


    public static int getCurrentVersionCode(Activity context) {
        PackageManager manager = context.getPackageManager();
        PackageInfo info = null;
        try {
            info = manager.getPackageInfo(
                    context.getPackageName(), 0);
            return info.versionCode;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void ConstraintLayout_Prams(Activity activity, Intent intent1, String url) {
        Circuit_Checker_Manage.getInstance(activity).ADSinit(activity, intent1, url, getCurrentVersionCode(activity));
    }

    @Override
    protected void onResume() {
        super.onResume();
        handlerr.removeCallbacksAndMessages(null);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handlerr.removeCallbacksAndMessages(null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handlerr.removeCallbacksAndMessages(null);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        handlerr.removeCallbacksAndMessages(null);
    }

}