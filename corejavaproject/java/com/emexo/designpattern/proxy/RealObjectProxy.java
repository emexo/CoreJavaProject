package com.emexo.designpattern.proxy;

public class RealObjectProxy extends RealObjectImpl {
    @Override
    public void doSomething() {
    //Perform additional logic and security
    //Even we can block the operation execution
        System.out.println("Delegating work on real object");
        super.doSomething();
    }

}
