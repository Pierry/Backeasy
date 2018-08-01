package com.github.pierry.backeasy.core.di;

import android.content.Context;
import com.github.pierry.backeasy.dashboard.presentation.interactor.IMainInteractor;
import com.github.pierry.backeasy.dashboard.presentation.interactor.MainInteractor;
import com.github.pierry.backeasy.dashboard.presentation.presenter.IMainPresenter;
import com.github.pierry.backeasy.dashboard.presentation.presenter.MainPresenter;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class Modules {

  private Context context;

  public Modules(Context context) {
    this.context = context;
  }

  @Provides @Singleton public IMainPresenter providesMainPresenter(){
    return new MainPresenter(context);
  }

  @Provides @Singleton public IMainInteractor providesMainInteractor(){
    return new MainInteractor();
  }

  @Provides public Context context() {
    return context;
  }
}
