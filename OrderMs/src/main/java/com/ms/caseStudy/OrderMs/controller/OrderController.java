package com.ms.caseStudy.OrderMs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.caseStudy.OrderMs.model.OrderData;
import com.ms.caseStudy.OrderMs.repo.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;
	
	@GetMapping("/allOrders")
	public List<OrderData> getOrders() {
		List<OrderData> orders = orderRepository.findAll();
		System.out.println("allOrders size "+orders.size());
		return orders;
	}
	
	
}
