package com.example.collection.map;

import java.util.HashMap;
import java.util.Map;


public class MapExample {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("name","Regu");
        map.put("address", "Bangalore");
        map.put("mob", "9940028001");
        map.put("name","Ajay");

        //System.out.println(map.size());
       //String name =  map.get("mob1");
       //System.out.println(name);
      //boolean res = map.containsKey("name1");
      //System.out.println(res);

       //Set<Map.Entry<String, String>> set =  map.entrySet();

      /* for(Map.Entry<String, String> data: set){
           System.out.println(data.getKey() + " : " + data.getValue());
       }*/

       map.forEach((key,value) -> System.out.println(key +" : " + value));
    }
}
