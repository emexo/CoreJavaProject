package com.example.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // Map
        //HashMap
        //LinkedHashMap
        //TreeMap
        Map<String,String> map = new TreeMap<>();
        map.put("name","Regu");
        map.put("address", "Bangalore");
        map.put("mob", "9940028001");
        map.put("name","Ajay");

       // System.out.println(map.size());
       String name =  map.get("name");
      //  System.out.println(name);
       boolean res = map.containsKey("name");
       // System.out.println(res);

       Set<Map.Entry<String, String>> set =  map.entrySet();

       /*for(Map.Entry<String, String> data: set){
           System.out.println(data.getKey() + " : " + data.getValue());
       }
       */
       map.forEach((k,v) -> {
           System.out.println(k +" : " + v);
       });
    }
}
