package com.github.pierry.backeasy.dashboard.presentation.presenter;

import android.content.Context;
import com.github.pierry.backeasy.core.BackeasyApp;
import com.github.pierry.backeasy.core.domain.User;
import com.github.pierry.backeasy.dashboard.presentation.interactor.IMainInteractor;
import com.github.pierry.backeasy.dashboard.presentation.view.IMainView;
import javax.inject.Inject;

public class MainPresenter implements IMainPresenter {

  @Inject IMainInteractor interactor;

  private IMainView view;

  public MainPresenter(Context context) {
    BackeasyApp.getControllerComponent(context).inject(this);
  }

  @Override public void onStart(Object view) {
    this.view = (IMainView) view;
  }

  @Override public void logon(String email, String username, String pass) {
    User user = new User(username, pass, email);
    String id = interactor.add(user);
    view.hideLoader();
    view.showToast("Connected");
  }

  @Override public void onStop() {

  }
}
