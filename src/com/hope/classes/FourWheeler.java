package com.hope.classes;

//class can extend a class = is a relationship
//interface can extend a interface = is a relationship
//class can implement a interface = has a relationship


public abstract class FourWheeler extends GearVehicle {

    abstract Integer forward(Integer forwardDistance);
    abstract Integer reverse(Integer backwardDistance);
}
