package com.emexo.thread.executor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        map.put(4,300);
        map.put(5,400);
        map.put(6,600);

        List<TicketTask> ticketTasks = new ArrayList<>();

        map.forEach((key, value)->{
            TicketTask ticketTask = new TicketTask(key, value);
            ticketTasks.add(ticketTask);
        });


       List<Future<String>> futureList = service.invokeAll(ticketTasks);

        futureList.forEach(res-> {
            try {
                System.out.println(res.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


    }
}
