package com.example.collection.list;

import java.util.*;

/**
 * ArrayList Example
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayListExample obj = new ArrayListExample();
        List<String>  list = obj.addElements("Chennai", "Bangalore", "Mumbai", "Pune","Mumbai");
        Collections.sort(list, Collections.reverseOrder());
        //obj.getElements(list);
        //obj.addElementsFromArray("Chennai", "Bangalore", "Mumbai", "pune");
        //obj.getElementsByForEach(list);
       // obj.getElementsByForLoop(list);
       // obj.getElementsByIterator(list);
        //obj.getElementsByListIterator(list);
        obj.getElementsByLambdaExpression(list);
        //int index = obj.checkElement(list, "Bangalore1");
        //System.out.println( "Index of Bangalore :  " + index);
       // boolean response = obj.checkElement1(list, "Bangalore1");
       // System.out.println(response);
    }

    /**
     * Add Elements into ArrayList
     * @param input1
     * @param input2
     * @param input3
     * @param input4
     * @return
     */
    public List<String> addElements(String input1, String input2, String input3,String input4, String input5) {
        ArrayList<String> list  = new ArrayList<>();
        list.add(input1);
        list.add(input2);
        list.add(input3);
        list.add(input4);
        list.add(input5);
        return list;
    }

    /**
     * Convert Array into ArrayList
     * @param data
     * @return
     */
    public List<String> addElementsFromArray(String... data) {
        List<String> list = Arrays.asList(data);
        return list;
    }

    /**
     * Get the elements from ArrayList
     * @param list
     */
    public void getElements(List<String> list) {
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }

    /**
     * Iterate using ForEach Loop
     * @param list
     */
    public void getElementsByForEach(List<String> list) {
        for(String data: list) {
            System.out.println(data);
        }
    }

    /**
     * Iterate using For Loop
     * @param list
     */
    public void getElementsByForLoop(List<String> list) {
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * Iterate using Iterator
     * @param list
     */
    public void getElementsByIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * Iterate using List Iterator
     * @param list
     */
    public void getElementsByListIterator(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("#### List Iterator ####");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

    /**
     * Iterate using Lambda Expression
     * @param list
     */
    public void getElementsByLambdaExpression(List<String> list) {
        list.forEach(data -> System.out.println(data));
        // list.forEach(System.out::println);
    }

    /**
     * Check elements by indexOf
     * @param list
     * @param input
     * @return
     */
    public int checkElement(List<String> list, String input) {
        int index = list.indexOf(input);
        return index;
    }

    public boolean checkElement1(List<String> list, String input) {
        boolean response = list.contains(input);
        return response;
    }
}
