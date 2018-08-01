package com.github.pierry.backeasy.dashboard.presentation.interactor;

import com.github.pierry.backeasy.core.domain.User;
import java.util.UUID;

public class MainInteractor implements IMainInteractor {

  @Override public void get() {
    // get from db
  }

  @Override public void fetch() {
    // fetch from api
  }

  @Override public void responseOk() {

  }

  @Override public void responseNoContent() {

  }

  @Override public String add(User user) {
    // save into db
    return UUID.randomUUID().toString();
  }

  @Override public void delete() {

  }
}
