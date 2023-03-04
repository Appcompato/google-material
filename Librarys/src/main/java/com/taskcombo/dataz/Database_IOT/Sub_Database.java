package com.taskcombo.dataz.Database_IOT;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatDelegate;

import com.anchorfree.partner.api.data.Country;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sub_Database {
    public static String PREFERENCE = "cloudprefs";
    public static String PREFERENCE_item = "instadata";
    public static String PREFERENCE_selectedcountry = "selectedcountry";
    public static String PREFERENCE_subscription = "subscription";
    public static String PREFERENCE_inappads = "inappads";
    public Context context;

    @SuppressLint("StaticFieldLeak")
    private static Sub_Database instance;
    SharedPreferences sharedPreference;
    SharedPreferences.Editor editor;

    public Sub_Database() {
    }


    public static void setcountry(List<Country> country, Activity activity)
    {
        SharedPreferences appSharedPrefs = PreferenceManager
                .getDefaultSharedPreferences(activity.getApplicationContext());
        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(country);
        prefsEditor.putString("country",    json);
        prefsEditor.commit();
    }

    public static List<Country> getCountry(Activity activity){

        SharedPreferences appSharedPrefs = PreferenceManager
                .getDefaultSharedPreferences(activity.getApplicationContext());
        Gson gson = new Gson();
        String json = appSharedPrefs.getString("country", "");
        Type type = new TypeToken<List<Country>>(){}.getType();

        return gson.fromJson(json, type );
    }
    public Sub_Database(Context context) {
        try {
            this.context = context;
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
            sharedPreference = context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE);
            editor = sharedPreference.edit();
        } catch (Exception ignored) {
        }
    }

    public static Sub_Database getInstance() {
        return instance;


    }


    public void setPreference(Map<String, String> map) {
        try {
            Gson gson = new Gson();
            String hashMapString = gson.toJson(map);

            editor = sharedPreference.edit();
            editor.putString(PREFERENCE_item, hashMapString);
            editor.apply();
        } catch (Exception ignored) {
        }
    }

    public Map<String, String> getPreference(String key) {
        try {
            Gson gson = new Gson();
            String storedHashMapString = sharedPreference.getString(PREFERENCE_item, "us");
            Type type = new TypeToken<HashMap<String, String>>() {
            }.getType();

            return gson.<HashMap<String, String>>fromJson(storedHashMapString, type);
        } catch (Exception exception) {
            return null;
        }
    }

    public void clearSharePrefs() {

        Map<String, String> map = new HashMap<>();


        map.put(Sub_Database.PREFERENCE_selectedcountry, "");
        map.put(Sub_Database.PREFERENCE_inappads, "");
        map.put(Sub_Database.PREFERENCE_subscription, "");

        Gson gson = new Gson();
        String hashMapString = gson.toJson(map);

        editor = sharedPreference.edit();
        editor.putString(PREFERENCE_item, hashMapString);
        editor.apply();

    }
}
