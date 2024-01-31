package com.emexo.oops.inheritance;

public class SmallCar extends Car{

    public SmallCar(int noDoors) {
        super(noDoors);
    }

    public void getSmallCarDetails(){
        System.out.print(noDoors);
        engine();
    }

    @Override
    public Integer engine(String model) throws Exception{
        int input = 10;
        return input;
    }

}
