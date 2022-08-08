package com.evoke.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evoke.ps.api.enitity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
