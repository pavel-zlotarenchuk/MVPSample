package com.mdgroup.mvpsample.store;

import android.content.Context;

public class SettingsStore extends BaseStore {

    private static final String TOKEN = "token";

    public static SettingsStore INSTANCE;

    private SettingsStore(Context context) {
        super(context, context.getPackageName());
    }

    public static void initialise(Context context) {
        INSTANCE = new SettingsStore(context);
    }

    public void setToken(String value) {
        putString(TOKEN, value);
    }

    public String getToken() {
        return getString(TOKEN, null);
    }
}
