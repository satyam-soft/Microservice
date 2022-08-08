package com.evoke.ps.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "ORDER-SERVICE")
public interface OrderClient {
	@GetMapping("/order/orderList")
  public List<Order> invokeOrderservice();
}
