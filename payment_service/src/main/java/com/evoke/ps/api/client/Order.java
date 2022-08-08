package com.evoke.ps.api.client;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;

}
