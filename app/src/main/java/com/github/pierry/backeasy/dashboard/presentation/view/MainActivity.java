package com.github.pierry.backeasy.dashboard.presentation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
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
  @BindView(R.id.login) Button logIn;
  @BindView(R.id.progressBar) ProgressBar progressBar;

  @Inject IMainPresenter presenter;

  private Unbinder bind;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    BackeasyApp.getControllerComponent(this).inject(this);
  }

  @OnClick(R.id.login) void loginClick() {
    String emailText = email.getText().toString();
    String passwordText = password.getText().toString();
    String usernameText = username.getText().toString();
    presenter.logon(emailText, usernameText, passwordText);
  }

  @Override protected void onStart() {
    presenter.onStart(this);
    super.onStart();
  }

  @Override public void showLoader() {
    runOnUiThread(() -> {
      if (progressBar != null) {
        progressBar.setVisibility(View.VISIBLE);
      }
    });
  }

  @Override public void hideLoader() {
    runOnUiThread(() -> {
      if (progressBar != null) {
        progressBar.setVisibility(View.GONE);
      }
    });
  }

  @Override public void noContent() {
    showToast(getString(R.string.no_content));
  }

  @Override public void noInternet() {
    showToast(getString(R.string.no_internet));
  }

  @Override public void showToast(String msg) {
    runOnUiThread(() -> Toast.makeText(this, msg, Toast.LENGTH_SHORT).show());
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