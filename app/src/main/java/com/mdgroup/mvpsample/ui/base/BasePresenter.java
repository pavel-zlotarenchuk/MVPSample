package com.mdgroup.mvpsample.ui.base;

import android.content.Context;

public class BasePresenter<V extends MvpBaseView> implements MvpBasePresenter<V> {

    private V mvpView;

    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mvpView = null;
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    protected V getMvpView() {
        return mvpView;
    }

    protected Context getContext() {
        if (mvpView instanceof BaseFragment) {
            return ((BaseFragment) mvpView).getContext();
        } else if (mvpView instanceof BaseActivity) {
            return (BaseActivity) mvpView;
        }
        return null;
    }

    protected String getString(int id) {
        return getContext().getString(id);
    }
}