package com.github.pierry.backeasy.dashboard.presentation.interactor;

import com.github.pierry.backeasy.core.domain.User;

public interface IMainInteractor {

  void get();

  void fetch();

  void responseOk();

  void responseNoContent();

  String add(User user);

  void delete();
}
