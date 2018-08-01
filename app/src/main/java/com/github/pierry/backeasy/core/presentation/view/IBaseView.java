package com.github.pierry.backeasy.core.presentation.view;

public interface IBaseView {

  void showLoader();

  void hideLoader();

  void noContent();

  void noInternet();

  void showToast(String msg);
}
