package com.ms.caseStudy.OrderMs;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

interface OrderBinding {
	
	String ORDER_CHANNEL = "orderChannel";

	 @Input(ORDER_CHANNEL)
	 SubscribableChannel Orders();

}