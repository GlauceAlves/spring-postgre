package com.widesys.spring_postgre_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.widesys.spring_postgre_test.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
