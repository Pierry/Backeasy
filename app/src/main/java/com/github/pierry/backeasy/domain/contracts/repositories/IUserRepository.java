package com.github.pierry.backeasy.domain.contracts.repositories;

import com.github.pierry.backeasy.domain.entities.User;
import java.util.List;

public interface IUserRepository {

  List<User> get(int page);

  User getById(int id);

  User getByUsername(String user);

  void create(User user);
}
