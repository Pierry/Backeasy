package com.github.pierry.backeasy.core;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import com.github.pierry.backeasy.BuildConfig;
import com.github.pierry.backeasy.core.di.Components;
import com.github.pierry.backeasy.core.di.DaggerComponents;
import com.github.pierry.backeasy.core.di.Modules;
import timber.log.Timber;

public class BackeasyApp extends Application {

  private Components components;

  @Override public void onCreate() {
    super.onCreate();
    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    }
    components();
  }

  @Override protected void attachBaseContext(Context base) {
    super.attachBaseContext(base);
    MultiDex.install(this);
  }

  void components() {
    if (components == null) {
      components = DaggerComponents.builder().modules(new Modules(this)).build();
    }
  }

  public static Components getControllerComponent(Context context) {
    return ((BackeasyApp) context.getApplicationContext()).getComponents();
  }

  public Components getComponents() {
    return components;
  }

}
