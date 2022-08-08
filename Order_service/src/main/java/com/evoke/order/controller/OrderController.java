package com.evoke.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.order.entity.Order;
import com.evoke.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	public Order saveOrder(@RequestBody Order order)
	{
		return orderService.saveOrder(order);
	}
	
	@GetMapping("/orderList")
	public List<Order> getOrderList()
	{
		return orderService.getOrderList();
	}

}
