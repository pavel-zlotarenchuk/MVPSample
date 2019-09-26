package com.mdgroup.mvpsample.ui.auth;

import android.content.Intent;

import com.mdgroup.mvpsample.ui.base.BaseActivity;
import com.mdgroup.mvpsample.ui.base.BasePresenter;
import com.mdgroup.mvpsample.ui.main.MainActivity;

public class LoginPresenter<V extends LoginContract.View> extends BasePresenter<V> implements LoginContract.Presenter<V> {

    @Override
    public void onClickShowData() {
        getMvpView().showData("Hello word!");
    }

    @Override
    public void onClickLogin() {
        Intent intent = new Intent(getContext(), MainActivity.class);
        getContext().startActivity(intent);
        ((BaseActivity) getContext()).finish();
    }
}
