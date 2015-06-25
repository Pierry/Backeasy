package com.github.pierry.backeasy.domain.entities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Order")
public class Order extends Model {

  @Column(name = "User") User user;
  @Column(name = "CreateDate") String createDate;

  public Order() {
    super();
  }

  public Order(User user, String createDate) {
    this.user = user;
    this.createDate = createDate;
  }

  public void isValid(){

  }

  public User getUser() {
    return user;
  }

  public String getCreateDate() {
    return createDate;
  }
}
