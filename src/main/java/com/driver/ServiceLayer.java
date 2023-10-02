package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceLayer {


    public RepositoryLayer repositoryLayer=new RepositoryLayer();

     public void addOrder(Order order){
         repositoryLayer.addOrderToDb(order);
     }


     public Order getOrder(String orderId) {
         return repositoryLayer.getOrderList(orderId);
     }

}
