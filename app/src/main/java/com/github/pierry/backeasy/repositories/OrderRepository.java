package com.github.pierry.backeasy.repositories;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.github.pierry.backeasy.domain.contracts.repositories.IOrderRepository;
import com.github.pierry.backeasy.domain.entities.Order;
import java.util.List;

public class OrderRepository implements IOrderRepository {
  @Override public List<Order> get() {
    return new Select().from(Order.class).execute();
  }

  @Override public Order getById(int id) {
    return new Select().from(Order.class).where("Id = ?", id).executeSingle();
  }

  @Override public void create(Order order) {
    order.save();
  }

  @Override public void update(Order order) {
    order.save();
  }

  @Override public void delete(int id) {
    new Delete().from(Order.class).where("Id = ?", id).execute();
  }
}
