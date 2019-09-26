package com.mdgroup.mvpsample.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timber.log.Timber;

public class FabricTree extends Timber.Tree {
    @Override
    protected void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t) {
        // TODO
        // if (priority == ERROR) Crashlytics.logException(t);
    }
}