package com.emexo.primitivedatatype;

public class PrimitiveDataType {
    private byte byteVal;
    private short shortVal;

    public PrimitiveDataType(byte byteVal, short shortVal) {
        this.byteVal = byteVal;
        this.shortVal = shortVal;
    }

    public void getValues(){
        System.out.println(byteVal);
        System.out.println(shortVal);
    }

    public static void main(String[] args) {
        String str = "12";
       int i = Integer.parseInt(str);

      Integer j =  Integer.valueOf(i);
    }
}
