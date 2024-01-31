package com.emexo.concurrentcollection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Chennai");
        set.add("Mumbai");
        set.add("Kolkata");

        Collections.synchronizedSet(set);
    }
}
