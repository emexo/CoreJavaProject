package com.emexo.java9;

import java.util.List;

//The 'takeWhile' is particularly useful when we want to limit the elements
// taken from the beginning of a stream until a certain condition becomes false.

//The ‘dropWhile’ is just the opposite of the ‘takeWhile’ method,
// the ‘dropWhile’ method returns a stream consisting of the remaining elements of the stream
// after dropping the longest prefix of elements that satisfy the given predicate.
public class TakeWhileAndDropWhile {
    public static void main(String[] args) {
        //take while
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        numbers.stream()
                .takeWhile(x -> x < 5)
                .forEach(e-> System.out.println(e));// 1234

        System.out.println();
        List<Integer> numbers1 = List.of(1,2,3,4,5,6,7,8);
        numbers1.stream()
                .dropWhile(x -> x < 5)
                .forEach(System.out :: print);  //5678
    }
}
