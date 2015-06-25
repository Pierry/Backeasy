package com.github.pierry.backeasy.domain.entities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "OrderItem")
public class OrderItem extends Model{

  @Column(name = "Order") Order order;
  @Column(name = "Product") Product product;

  public OrderItem() {
    super();
  }

  public OrderItem(Order order, Product product) {
    this.order = order;
    this.product = product;
  }

  public void isValid(){

  }

  public Order getOrder() {
    return order;
  }

  public Product getProduct() {
    return product;
  }
}
