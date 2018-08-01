package com.github.pierry.backeasy.dashboard.presentation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.github.pierry.backeasy.R;
import com.github.pierry.backeasy.core.BackeasyApp;
import com.github.pierry.backeasy.core.presentation.view.BaseActivity;
import com.github.pierry.backeasy.dashboard.presentation.presenter.IMainPresenter;
import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainView {

  @BindView(R.id.email) EditText email;
  @BindView(R.id.username) EditText username;
  @BindView(R.id.password) EditText password;
  @BindView(R.id.logon) Button logIn;

  @Inject IMainPresenter presenter;

  private Unbinder bind;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    BackeasyApp.getControllerComponent(this).inject(this);
    setContentView(R.layout.activity_main);
    bind = ButterKnife.bind(this);
  }

  @OnClick(R.id.logon) void logonClick() {
    presenter.logon(email.getText().toString(), username.getText().toString(), password.getText().toString());
  }

  @Override protected void onStart() {
    presenter.onStart(this);
    super.onStart();
  }

  @Override protected void onStop() {
    presenter.onStop();
    super.onStop();
  }

  @Override protected void onDestroy() {
    bind.unbind();
    super.onDestroy();
  }
}