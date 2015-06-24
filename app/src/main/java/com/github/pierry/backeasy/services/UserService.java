package com.github.pierry.backeasy.services;

import com.github.pierry.backeasy.domain.contracts.repositories.IUserRepository;
import com.github.pierry.backeasy.domain.contracts.services.IUserService;
import com.github.pierry.backeasy.domain.entities.User;
import com.google.inject.Inject;

public class UserService implements IUserService {

  IUserRepository userRepository;

  @Inject public UserService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override public User authenticate(String username, String password) {
    User user = userRepository.getByUsername(username);
    if (user == null) {
      return null;
    }
    if (user.getPassword().equals(password)) {
      return user;
    }
    return null;
  }

  @Override public void create(String username, String password, String email) {
    userRepository.create(new User(username, password, email));
  }
}
