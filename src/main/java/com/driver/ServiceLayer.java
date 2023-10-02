package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceLayer {

    @Autowired
     RepositoryLayer repositoryLayer;

     public void addOrder(Order order){
         repositoryLayer.addOrderToDb(order);
     }

     public void addPartnerToDb(String partnerId){
         repositoryLayer.addPartnerToDb(partnerId);
     }

     public void addOrderPartnerToDb(String orderId,String partnerId){
         repositoryLayer.addOrderPartnerToDb(orderId,partnerId);
     }

     public Order getOrder(String orderId) {
         return repositoryLayer.getOrderList(orderId);
     }

}
