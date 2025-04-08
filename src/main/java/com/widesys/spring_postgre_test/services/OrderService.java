package com.widesys.spring_postgre_test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widesys.spring_postgre_test.entities.Order;
import com.widesys.spring_postgre_test.repositories.OrderRepository; 

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order  findById(Long id) {
		Optional<Order> objOrder =  orderRepository.findById(id);
		return objOrder.get();
	}
	
}
