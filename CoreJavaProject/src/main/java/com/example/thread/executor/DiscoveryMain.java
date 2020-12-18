package com.example.thread.executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DiscoveryMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        String[] ipAddress = {"10.0.0.0", "10.0.0.1","10.0.0.2","10.0.0.3","10.0.0.4","10.0.0.5"};
        List<String> ipAddressList = Arrays.asList(ipAddress);
        List<Discovery> taskList = new ArrayList<>();

        ipAddressList.forEach(ipAddr -> {
            Discovery discovery = new Discovery(ipAddr);
           /* Future<String> response = service.submit(discovery);
           try {
                System.out.println("Response :" + response.get());
            } catch (Exception e) {
                e.printStackTrace();
            } */
            taskList.add(discovery);
        });

        List<Future<String>> response = service.invokeAll(taskList);

        response.forEach(res -> {
            try {
                System.out.println(res.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        service.shutdown();

    }
}
