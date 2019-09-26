package com.mdgroup.mvpsample.ui.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity implements MvpBaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void reloadView() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError() {

    }
}