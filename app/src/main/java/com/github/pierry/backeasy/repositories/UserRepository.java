package com.github.pierry.backeasy.repositories;

import com.activeandroid.query.Select;
import com.github.pierry.backeasy.domain.contracts.repositories.IUserRepository;
import com.github.pierry.backeasy.domain.entities.User;
import java.util.List;

public class UserRepository implements IUserRepository {

  @Override public List<User> get(int page) {
    return new Select().from(User.class).execute();
  }

  @Override public User getById(int id) {
    return new Select().from(User.class).where("Id = ?", id).executeSingle();
  }

  @Override public User getByUsername(String username) {
    return new Select().from(User.class).where("Username = ?", username).executeSingle();
  }

  @Override public void create(User user) {
    user.save();
  }
}
