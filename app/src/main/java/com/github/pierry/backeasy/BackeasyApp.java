package com.github.pierry.backeasy;

import android.app.Application;
import roboguice.RoboGuice;

public class BackeasyApp extends com.activeandroid.app.Application {

  @Override public void onCreate() {
    super.onCreate();
    RoboGuice.setUseAnnotationDatabases(false);
  }
}
