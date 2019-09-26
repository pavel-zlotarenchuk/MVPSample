package com.mdgroup.mvpsample.store;

import android.content.Context;
import android.content.SharedPreferences;

abstract class BaseStore {
    private SharedPreferences appSharedPreference;

    BaseStore(Context context, String storeKey) {
        appSharedPreference = context.getSharedPreferences(storeKey, Context.MODE_PRIVATE);
    }

    public String getString(String key, String defValue) {
        return appSharedPreference.getString(key, defValue);
    }

    void putString(String key, String value) {
        appSharedPreference.edit().putString(key, value).apply();
    }

    public int getInt(String key, int defValue) {
        return appSharedPreference.getInt(key, defValue);
    }

    public void putInt(String key, int value) {
        appSharedPreference.edit().putInt(key, value).apply();
    }

    public long getLong(String key, long defValue) {
        return appSharedPreference.getLong(key, defValue);
    }

    public void putLong(String key, long value) {
        appSharedPreference.edit().putLong(key, value).apply();
    }

    boolean getBool(String key, boolean defValue) {
        return appSharedPreference.getBoolean(key, defValue);
    }

    void putBool(String key, boolean value) {
        appSharedPreference.edit().putBoolean(key, value).apply();
    }
}