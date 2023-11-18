package com.emexo.designpattern.proxy;

public class Client {
    public static void main(String[] args) {
        RealObjectProxy proxy = new RealObjectProxy();
        proxy.doSomething();
    }
}
