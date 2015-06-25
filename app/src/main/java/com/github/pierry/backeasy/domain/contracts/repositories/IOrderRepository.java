package com.github.pierry.backeasy.domain.contracts.repositories;

import com.github.pierry.backeasy.domain.entities.Order;

public interface IOrderRepository extends IRepositoryBase<Order> {

  void delete(int id);
}
