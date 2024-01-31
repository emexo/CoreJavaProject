package com.emexo.collection.list;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

@Slf4j
public class ArrayListExample {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product();
        product1.setProductId(5);
        product1.setProductName("Iphone");

        Product product2 = new Product();
        product2.setProductId(9);
        product2.setProductName("One plus");

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setProductName("Redmi");

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

       // Product product = productList.get(2);
        //log.info("Product details, product id:{}, product name:{}", product.getProductId(), product.getProductName());

        ArrayListExample arrayListExample = new ArrayListExample();
        // before java 8
        //Collections.sort(productList, new CompareByProductName());

        // from java 8
        productList.sort(Comparator.comparing(data -> data.getProductId()));

        //productList.sort(Comparator.comparing(Product::getProductName));

        arrayListExample.usingLambdaExpression(productList);
    }

    public void usingLambdaExpression(List<Product> products){
        if(CollectionUtils.isNotEmpty(products)){
            products.forEach(data -> System.out.println(data)); // from java 8
            products.forEach(System.out::println);
        }
    }

    public void usingStreaming(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            products.stream().forEach(data -> log.info("data" +data));  // from java 8
        }
    }

    public void usingForEach(List<Product> products){
        if(!CollectionUtils.isEmpty(products)){
            for(Product data: products){   // from java 5
                log.info("data" +data);
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


}
