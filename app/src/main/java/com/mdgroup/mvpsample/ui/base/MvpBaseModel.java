package com.mdgroup.mvpsample.ui.base;

import java.util.Map;

public interface MvpBaseModel<T> {

    interface OnFinishedListener<T> {
        void onSuccess(T result);

        void onFailure(Throwable t);
    }

    void loadData(Map<String, String> params, OnFinishedListener<T> onFinishedListener);
}