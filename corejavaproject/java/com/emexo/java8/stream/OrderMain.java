package com.corejavaproject.java8.stream;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


@Log4j2
public class OrderMain {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setLocation("Marathalli");
        address1.setCity("Bangalore");

        Address address2 = new Address();
        address2.setLocation("Nagercoil");
        address2.setCity("Kanyakumari");

        Address address3 = new Address();
        address3.setLocation("Anna Nager");
        address3.setCity("Chennai");

        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setPrice(3455.45f);
        order1.setAddress(address1);

        Order order2 = new Order();
        order2.setOrderId(4);
        order2.setPrice(65.5f);
        order2.setAddress(address1);

        Order order3 = new Order();
        order3.setOrderId(6);
        order3.setPrice(56.6f);
        order3.setAddress(address1);

        Order order4 = new Order();
        order4.setOrderId(7);
        order4.setPrice(577.45f);
        order4.setAddress(address2);

        Order order5 = new Order();
        order5.setOrderId(77);
        order5.setPrice(7565.45f);
        order5.setAddress(address3);

        Order order6 = new Order();
        order6.setOrderId(45);
        order6.setPrice(5456.45f);
        order6.setAddress(address3);


        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);



       Map<Address, Long> addressMap =  orderList.stream().map(order -> order.getAddress()).collect(groupingBy(address -> address, counting()));

       log.info(addressMap);
       //Address address = addressMap.entrySet().stream().max(comparingByValue()).get().getKey();
       //Long count = addressMap.entrySet().stream().max(comparingByValue()).get().getValue();

      //log.info(address);
      // log.info(count);
    }
}
