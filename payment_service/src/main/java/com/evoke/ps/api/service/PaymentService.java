package com.evoke.ps.api.service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.ps.api.enitity.Payment;
import com.evoke.ps.api.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment doPayment(Payment payment)
	{
		payment.setTransactionId(UUID.randomUUID().toString());
		
		return paymentRepository.save(payment);
	}
	
	public List<Payment> paymentList()
	{
		return paymentRepository.findAll(); 
	}
}
