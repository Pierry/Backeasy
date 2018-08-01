package com.github.pierry.backeasy.dashboard.presentation.presenter;

import com.github.pierry.backeasy.core.presentation.presenter.IBasePresenter;

public interface IMainPresenter extends IBasePresenter {
  void logon(String email, String user, String pass);
}
