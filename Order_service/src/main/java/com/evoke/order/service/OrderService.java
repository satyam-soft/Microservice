package com.evoke.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.order.entity.Order;
import com.evoke.order.repository.OrderRepository;

@Service
public class OrderService {
	 @Autowired
	 private OrderRepository orderRepository;
	 
	 public Order saveOrder(Order order)
	 {
		 System.out.println(order.getId());
		 return orderRepository.save(order);
	 }
	 
	 public List<Order> getOrderList()
	 {
		 return orderRepository.findAll();
	 }
	 

}
