package com.github.pierry.backeasy.domain.entities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Product")
public class Product extends Model {

  @Column(name = "Description") String description;
  @Column(name = "Price") double price;

  public Product() {
    super();
  }

  public Product(double price, String description) {
    this.price = price;
    this.description = description;
  }

  public void isValid(){

  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }
}
