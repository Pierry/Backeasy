package com.github.pierry.backeasy.repositories;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.github.pierry.backeasy.domain.contracts.repositories.IOrderItemRepository;
import com.github.pierry.backeasy.domain.entities.OrderItem;
import java.util.List;

public class OrderItemRepository implements IOrderItemRepository {

  @Override public List<OrderItem> get() {
    return new Select().from(OrderItem.class).execute();
  }

  @Override public List<OrderItem> getByOrderId(int orderId) {
    return new Select().from(OrderItem.class).where("Order = ?", orderId).execute();
  }

  @Override public OrderItem getById(int id) {
    return new Select().from(OrderItem.class).where("Id = ?", id).executeSingle();
  }

  @Override public void create(OrderItem orderItem) {
    orderItem.save();
  }

  @Override public void update(OrderItem orderItem) {
    orderItem.save();
  }

  @Override public void delete(int id) {
    new Delete().from(OrderItem.class).where("Id = ?", id).execute();
  }
}
