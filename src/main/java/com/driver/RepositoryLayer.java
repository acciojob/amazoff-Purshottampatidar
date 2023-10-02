package com.driver;

import java.util.HashMap;
import java.util.List;

public class RepositoryLayer {

    HashMap<String, Order> orderDb = new HashMap<>();


    public void addOrderToDb(Order order) {
        String id = order.getId();
        orderDb.put(id, order);
    }



    public Order getOrderList(String orderId){
          Order order=orderDb.get(orderId);
          return order;
    }
}
