package com.github.pierry.backeasy.domain.entities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "User") public class User extends Model {

  @Column(name = "Username") String username;
  @Column(name = "Password") String password;
  @Column(name = "Email") String email;

  public User() {
    super();
  }

  public User(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  @Override public String toString() {
    return username;
  }
}
