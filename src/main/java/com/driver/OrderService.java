package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    public OrderRepository repositoryObj;

    public void addOrder(Order order){
        repositoryObj.addOrder(order);
    }



    public void addOrderPartner(String orderId,String partnerId){
        repositoryObj.addOrderPartner(orderId,partnerId);
    }

    public Order getOrder(String orderId){
        HashMap<String,Order> orderDb=repositoryObj.getOrderDb();
        return orderDb.get(orderId);
    }

    public void addPartner(String partnerId){
        repositoryObj.addPartner(partnerId);
    }
    public DeliveryPartner getPartnerById(String partnerId){
        return repositoryObj.getPartnerById(partnerId);
    }

}
