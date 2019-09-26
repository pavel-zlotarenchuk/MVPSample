package com.mdgroup.mvpsample.ui.auth;

import com.mdgroup.mvpsample.ui.base.MvpBasePresenter;
import com.mdgroup.mvpsample.ui.base.MvpBaseView;

interface LoginContract {
    interface View extends MvpBaseView {
        void showData(String text);
    }

    interface Presenter<V extends View> extends MvpBasePresenter<V> {
        void onClickShowData();

        void onClickLogin();
    }
}
