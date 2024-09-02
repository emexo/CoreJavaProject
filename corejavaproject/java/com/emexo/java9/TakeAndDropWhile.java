package com.emexo.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeAndDropWhile {
    public static void main(String[] args) {
        // create a stream of numbers from 1 to 10
        Stream<Integer> stream
                = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

        // apply takeWhile to take all the numbers
        // matches passed predicate
        List<Integer> list
                = stream.dropWhile(i -> i % 2 == 0 )
                .collect(Collectors.toList());

        // print list
        System.out.println(list);
    }
}
