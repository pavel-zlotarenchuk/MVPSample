package com.mdgroup.mvpsample.ui.base;

import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment implements MvpBaseView {

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