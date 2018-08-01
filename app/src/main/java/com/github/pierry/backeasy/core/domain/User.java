package com.github.pierry.backeasy.core.domain;

import com.github.pierry.backeasy.core.support.Assertion;

public class User implements Specification {

  private String username;
  private String password;
  private String email;

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

  @Override public void isValid() throws Exception {
    Assertion assertion = new Assertion();
    assertion.isNull(username).isEmpty(username).errors("Username");
    assertion.isNull(password).isEmpty(password).lengthMin(password, 6).errors("Password");
    assertion.isNull(email).isEmpty(email).isEmail(email).errors("E-mail");
  }
}
