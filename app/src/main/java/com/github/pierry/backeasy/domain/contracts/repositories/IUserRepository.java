package com.github.pierry.backeasy.domain.contracts.repositories;

import com.github.pierry.backeasy.domain.entities.User;

public interface IUserRepository extends IRepositoryBase<User> {

  User getByUsername(String user);

  void delete(int id);
}
