package com.mdgroup.mvpsample.ui.base;

public interface MvpBasePresenter<V extends MvpBaseView> {
    void onAttach(V mvpView);

    void onDetach();

    void onResume();

    void onPause();
}