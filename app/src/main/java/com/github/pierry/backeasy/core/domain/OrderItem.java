package com.github.pierry.backeasy.core.domain;

public class OrderItem {

  private Order order;
  private Product product;

  public OrderItem() {
  }

  public OrderItem(Order order, Product product) {
    this.order = order;
    this.product = product;
  }

  public void isValid() {

  }

  public Order getOrder() {
    return order;
  }

  public Product getProduct() {
    return product;
  }
}
