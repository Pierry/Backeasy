package com.github.pierry.backeasy.domain.contracts.repositories;

import com.github.pierry.backeasy.domain.entities.Product;

public interface IProductRepository extends IRepositoryBase<Product> {

  void delete(int id);
}
