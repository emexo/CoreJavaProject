package com.emexo.collection.list;

import com.emexo.scanner.ScannerExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;


import java.util.*;

@Slf4j
public class ArrayListExample {

    public static void main(String[] args) {
        List<Product> productList = new LinkedList<>();

        Product product1 = new Product();
        product1.setProductId(5);
        product1.setProductName("Iphone");

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setAddress("Bangalore");
        order1.setQuantity("2");

        Order order2 = new Order();
        order2.setOrderId(3);
        order2.setAddress("Chennai");
        order2.setQuantity("20");

        Order order3 = new Order();
        order3.setOrderId(4);
        order3.setAddress("Mumbai");
        order3.setQuantity("6");

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        product1.setOrderList(orders);

        Product product2 = new Product();
        product2.setProductId(9);
        product2.setProductName("One plus");

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setProductName("Redmi");

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        Product product = productList.get(2);
        //log.info("Product details, product id:{}, product name:{}", product.getProductId(), product.getProductName());

        ArrayListExample arrayListExample = new ArrayListExample();
        // before java 8
        //Collections.sort(productList, new CompareByProductName());

        // from java 8
        productList.sort(Comparator.comparing(data -> data.getProductId()));

        productList.sort(Comparator.comparing(Product::getProductName));

        arrayListExample.usingLambdaExpression(productList);
    }

    public void usingLambdaExpression(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            products.forEach(data -> log.info("data" +data)); // from java 8
        }
    }

    public void usingStreaming(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            products.stream().forEach(data -> log.info("data" +data));  // from java 8
        }
    }

    public void usingForEach(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            for(Product product: products){   // from java 5
                log.info("data" +product);
            }
        }
    }

    public void usingIterator(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            Iterator<Product> productIterator = products.iterator();

            while (productIterator.hasNext()){
                log.info("data" +productIterator.next());
            }
         }
    }

    public void usingListIterator(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            ListIterator<Product> productIterator = products.listIterator();

            while (productIterator.hasNext()){
                log.info("data" +productIterator.next());
            }

            while (productIterator.hasPrevious()){
                log.info("data" +productIterator.previous());
            }
        }
    }

    public void usingForLoop(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            for(int i=0; i<products.size(); i++){
                log.info("data" +products.get(i));
            }
        }
    }

    public void filterByOrder(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            products.stream()
                    .filter(product -> product.getOrderList().stream().filter(order -> order.getQuantity().equals("20")).isParallel()

                            )

                        .forEach(product -> log.info("data" +product.getOrderList()));

        }
    }
}
