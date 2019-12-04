package com.coding.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayListExample {
    public static void main(String[] args){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Bangalore");
        list.add("Mumbai");
        list.add("kolkata");
        list.addIfAbsent("Mumbai");

        Iterator iterator = list.iterator();

        list.add("Chennai");

       while (iterator.hasNext()){
           System.out.println(iterator.next());
           //iterator.remove();
       }
    }
}
