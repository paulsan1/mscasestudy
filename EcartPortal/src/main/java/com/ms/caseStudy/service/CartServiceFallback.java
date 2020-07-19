package com.ms.caseStudy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ms.caseStudy.bean.Cart;
import com.ms.caseStudy.bean.CartBean;
import com.ms.caseStudy.bean.Product;

@Component
public class CartServiceFallback implements CartServiceproxy {

	
	@Override
	public List<Cart> getCarts(String user,String token) {
		System.out.println("call fallback");
		return new ArrayList<Cart>();
	}

	@Override
	public void addToCart(CartBean cartBean, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> orderCart(int id, String token) {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

}
