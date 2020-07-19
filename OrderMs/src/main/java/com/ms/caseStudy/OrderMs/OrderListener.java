package com.ms.caseStudy.OrderMs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.ms.caseStudy.OrderMs.model.OrderData;
import com.ms.caseStudy.OrderMs.repo.OrderRepository;

@Component
@EnableBinding(OrderBinding.class)
public class OrderListener {

	@Autowired
	OrderRepository orderRepository;
	
    @StreamListener(target = OrderBinding.ORDER_CHANNEL)
    public void processMessage(String msg) {
        String[] order = msg.split("\\|");
        System.out.println("msg "+msg);
        System.out.println(order[0] +" : "+order[1]);
        OrderData orderData = new OrderData();
        orderData.setProductName(order[0]);
        orderData.setProductPrice(order[1]);
        orderData.setDeliveryDate("TBD. Your order will deliver soon");
        orderData.setOrderId("ORD_ID_"+(int)((Math.random()*9000)+1000));
        orderRepository.save(orderData);
        
    }
}