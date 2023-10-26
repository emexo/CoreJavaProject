package com.emexo.designpattern.prototype;

public interface PrototypeCapable extends Cloneable{

    PrototypeCapable clone() throws CloneNotSupportedException;
}
