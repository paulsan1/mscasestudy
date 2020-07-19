package com.ms.caseStudy.OrderMs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ms.caseStudy.OrderMs.model.OrderData;

@Component
public interface OrderRepository extends JpaRepository<OrderData, Integer> {
	
}
