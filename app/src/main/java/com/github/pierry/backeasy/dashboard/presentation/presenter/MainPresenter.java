package com.github.pierry.backeasy.dashboard.presentation.presenter;

import android.content.Context;
import com.github.pierry.backeasy.core.BackeasyApp;
import com.github.pierry.backeasy.core.domain.User;
import com.github.pierry.backeasy.dashboard.presentation.interactor.IMainInteractor;
import com.github.pierry.backeasy.dashboard.presentation.view.IMainView;
import javax.inject.Inject;
import timber.log.Timber;

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
    try {
      User user = new User(username, pass, email);
      user.isValid();
      String id = interactor.add(user);
      view.hideLoader();
      view.showToast("Connected");
    } catch (Exception e) {
      view.showToast(e.getMessage());
      Timber.e(e);
    }
  }

  @Override public void onStop() {

  }
}
