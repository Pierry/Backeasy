package com.github.pierry.backeasy.core.di;

import android.content.Context;
import com.github.pierry.backeasy.dashboard.presentation.presenter.MainPresenter;
import com.github.pierry.backeasy.dashboard.presentation.view.MainActivity;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = Modules.class) public interface Components {

  Context context();

  void inject(MainActivity mainActivity);

  void inject(MainPresenter mainPresenter);
}
