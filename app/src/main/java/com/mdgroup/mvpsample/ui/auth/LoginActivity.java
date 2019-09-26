package com.mdgroup.mvpsample.ui.auth;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mdgroup.mvpsample.R;
import com.mdgroup.mvpsample.ui.base.BaseActivity;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    private LoginPresenter presenter = new LoginPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter.onAttach(this);

        TextView showDataTextView = findViewById(R.id.showDataTextView);
        showDataTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onClickShowData();
            }
        });

        TextView loginTextView = findViewById(R.id.loginTextView);
        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onClickLogin();
            }
        });
    }

    @Override
    public void showData(String text) {
        TextView textView = findViewById(R.id.dataTextView);
        textView.setText(text);
    }
}
