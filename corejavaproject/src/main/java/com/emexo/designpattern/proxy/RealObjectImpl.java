package com.emexo.designpattern.proxy;

public class RealObjectImpl implements RealObject {

    @Override
    public void doSomething() {
        System.out.println("Performingworkinrealobject");
    }

}
