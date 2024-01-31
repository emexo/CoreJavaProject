package com.emexo.designpattern.chainofresposibility;


public class TestChainOfResponsibility {
    public static void main(String[] args)
    {

        SupportService supportService = new SupportService();

        ServiceRequest request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_ONE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

    }
}
