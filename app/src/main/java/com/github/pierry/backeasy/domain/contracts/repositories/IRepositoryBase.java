package com.github.pierry.backeasy.domain.contracts.repositories;

import java.util.List;

public interface IRepositoryBase<T> {

  List<T> get();

  T getById(int id);

  void create(T item);

  void update(T item);
}
