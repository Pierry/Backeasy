package com.github.pierry.backeasy.domain.contracts.repositories;

import com.github.pierry.backeasy.domain.entities.OrderItem;
import java.util.List;

public interface IOrderItemRepository extends IRepositoryBase<OrderItem>{

  List<OrderItem> getByOrderId(int orderId);
  void delete(int id);
}
