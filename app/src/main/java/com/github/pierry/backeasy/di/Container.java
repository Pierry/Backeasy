package com.github.pierry.backeasy.di;

import com.github.pierry.backeasy.domain.contracts.repositories.IUserRepository;
import com.github.pierry.backeasy.domain.contracts.services.IUserService;
import com.github.pierry.backeasy.repositories.UserRepository;
import com.github.pierry.backeasy.services.UserService;
import com.google.inject.AbstractModule;

public class Container extends AbstractModule {
  @Override protected void configure() {
    binder.bind(IUserRepository.class).to(UserRepository.class);
    binder.bind(IUserService.class).to(UserService.class);
  }
}
