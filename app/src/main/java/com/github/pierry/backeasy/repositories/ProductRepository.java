package com.github.pierry.backeasy.repositories;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.github.pierry.backeasy.domain.contracts.repositories.IProductRepository;
import com.github.pierry.backeasy.domain.entities.Product;
import java.util.List;

public class ProductRepository implements IProductRepository {
  @Override public List<Product> get() {
    return new Select().from(Product.class).execute();
  }

  @Override public Product getById(int id) {
    return new Select().from(Product.class).where("Id = ?", id).executeSingle();
  }

  @Override public void create(Product product) {
    product.save();
  }

  @Override public void update(Product product) {
    product.save();
  }

  @Override public void delete(int id) {
    new Delete().from(Product.class).where("Id = ?", id).execute();
  }
}
