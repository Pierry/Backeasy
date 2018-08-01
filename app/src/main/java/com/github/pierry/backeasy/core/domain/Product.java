package com.github.pierry.backeasy.core.domain;

public class Product {

  private String description;
  private double price;

  public Product() {
  }

  public Product(double price, String description) {
    this.price = price;
    this.description = description;
  }

  public void isValid() {

  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }
}
