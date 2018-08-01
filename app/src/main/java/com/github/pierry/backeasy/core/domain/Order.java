package com.github.pierry.backeasy.core.domain;

public class Order {

  private User user;
  private String createDate;

  public Order() {
  }

  public Order(User user, String createDate) {
    this.user = user;
    this.createDate = createDate;
  }

  public void isValid() {

  }

  public User getUser() {
    return user;
  }

  public String getCreateDate() {
    return createDate;
  }
}
