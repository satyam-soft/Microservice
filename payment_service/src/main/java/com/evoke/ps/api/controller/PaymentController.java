package com.evoke.ps.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.ps.api.client.Order;
import com.evoke.ps.api.client.OrderClient;
import com.evoke.ps.api.enitity.Payment;
import com.evoke.ps.api.service.PaymentService;
import com.netflix.discovery.converters.Auto;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService service;
	
	@Autowired
	private OrderClient orderClient;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment)
	{
		return service.doPayment(payment);
	}
	
	@GetMapping("/paymentList")
	public List<Payment> getPaymentList()
	{    
		List<Order> list=orderClient.invokeOrderservice();
		Order order=list.get(0);
		System.out.println(order);
		
		return service.paymentList();
	}

}
