package com.mdgroup.mvpsample;

import android.app.Application;

import com.mdgroup.mvpsample.store.SettingsStore;
import com.mdgroup.mvpsample.utils.FabricTree;

import timber.log.Timber;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initTimber();

        SettingsStore.initialise(this);
    }

    private void initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new FabricTree());
        }
    }
}
