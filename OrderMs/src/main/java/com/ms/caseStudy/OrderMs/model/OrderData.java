package com.ms.caseStudy.OrderMs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "orderdata")
public class OrderData {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name = "orderId", table = "orderdata")
	private String orderId;
	@Column(name = "productName", table = "orderdata")
	private String productName;
	@Column(name = "productPrice", table = "orderdata")
	private String productPrice;
	@Column(name = "deliveryDate", table = "orderdata")
	private String deliveryDate;

	public OrderData(Integer id, String orderId, String productName, String productPrice, String deliveryDate) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.deliveryDate = deliveryDate;
	}

	public OrderData() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}	