package com.github.pierry.backeasy.di;

import com.github.pierry.backeasy.domain.contracts.repositories.IOrderItemRepository;
import com.github.pierry.backeasy.domain.contracts.repositories.IOrderRepository;
import com.github.pierry.backeasy.domain.contracts.repositories.IProductRepository;
import com.github.pierry.backeasy.domain.contracts.repositories.IUserRepository;
import com.github.pierry.backeasy.domain.contracts.services.IOrderItemService;
import com.github.pierry.backeasy.domain.contracts.services.IOrderService;
import com.github.pierry.backeasy.domain.contracts.services.IProductService;
import com.github.pierry.backeasy.domain.contracts.services.IUserService;
import com.github.pierry.backeasy.repositories.OrderItemRepository;
import com.github.pierry.backeasy.repositories.OrderRepository;
import com.github.pierry.backeasy.repositories.ProductRepository;
import com.github.pierry.backeasy.repositories.UserRepository;
import com.github.pierry.backeasy.services.OrderItemService;
import com.github.pierry.backeasy.services.OrderService;
import com.github.pierry.backeasy.services.ProductService;
import com.github.pierry.backeasy.services.UserService;
import com.google.inject.AbstractModule;

public class Container extends AbstractModule {
  @Override protected void configure() {
    binder.bind(IUserRepository.class).to(UserRepository.class);
    binder.bind(IOrderRepository.class).to(OrderRepository.class);
    binder.bind(IOrderItemRepository.class).to(OrderItemRepository.class);
    binder.bind(IProductRepository.class).to(ProductRepository.class);
    binder.bind(IUserService.class).to(UserService.class);
    binder.bind(IOrderService.class).to(OrderService.class);
    binder.bind(IOrderItemService.class).to(OrderItemService.class);
    binder.bind(IProductService.class).to(ProductService.class);
  }
}
