package com.driver;

import java.util.HashMap;
import java.util.List;

public class RepositoryLayer {

    HashMap<String, Order> orderDb = new HashMap<>();
    HashMap<String,Integer> partnerDb = new HashMap<>();

    HashMap<String,String> orderPartnerDb=new HashMap<>();

    public void addOrderToDb(Order order) {
        String id = order.getId();
        orderDb.put(id, order);
    }

    public void addPartnerToDb(String partnerId){
        partnerDb.put(partnerId,0);
    }

    public void addOrderPartnerToDb(String orderId,String partnerId){
        orderPartnerDb.put(partnerId,orderId);
    }

    public Order getOrderList(String orderId){
          Order order=orderDb.get(orderId);
          return order;
    }
}
