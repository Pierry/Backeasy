package com.github.pierry.backeasy.domain.contracts.services;

import com.github.pierry.backeasy.domain.entities.User;

public interface IUserService {

  User authenticate(String username, String password);

  void create(String username, String password, String email);
}