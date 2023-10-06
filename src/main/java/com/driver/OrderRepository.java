package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class OrderRepository {

    HashMap<String,Order> orderDb=new HashMap<>();

    HashMap<String,String> DeliveryPartnerDb=new HashMap<>();
    HashMap<String,Integer> partnerDb=new HashMap<>();

    HashMap<String ,String> orderPartnerDb=new HashMap<>();

    public void addOrder(Order order){
        orderDb.put(order.getId(),order);
    }

    public void addPartner(String partnerId){
        DeliveryPartnerDb.put(partnerId, new DeliveryPartner(partnerId));
    }

    public List<Order> getOrderList(String orderId){
        return orderDb.values().stream().toList();
    }





    public void addOrderPartner(String orderId,String partnerId){

        orderPartnerDb.put(orderId,partnerId);
        partnerDb.put(partnerId,partnerDb.getOrDefault(partnerId,0)+1);
    }

    public HashMap<String,Order> getOrderDb(){
        return orderDb;
    }

    public DeliveryPartner getPartnerById(String partnerId){
        return DeliveryPartnerDb.get(partnerId);
    }




}
