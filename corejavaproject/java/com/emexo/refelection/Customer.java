package com.emexo.refelection;

public class Customer {
    private int customerId;

    public String customerName;

    private String getCustomerAddress(){
        return "Bangalore";
    }

    public String getCustomerAddress(String address){
        return address;
    }
}
