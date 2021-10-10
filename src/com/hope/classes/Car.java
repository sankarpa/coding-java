package com.hope.classes;

import com.hope.interfaces.Light;
import com.hope.interfaces.SteeringWheel;

public class Car extends com.hope.classes.FourWheeler implements Light, SteeringWheel {

    private Integer running = 0;
    private boolean brake = false;
    private boolean lightsOn = false;
    private Integer gear = 1;
    private Integer numberOfGears;
    private Integer steeringWheelAngle;


    private Integer position = 0;

    private String brand;


    public Car(String brand, Integer numberOfGears){
        this.brand = brand;
        this.numberOfGears = numberOfGears;
    }


    public Integer getPosition(){
        return  position;
    }


    @Override
    public Integer accelerate() {
        System.out.println("Car is running....");
        running = 1;
        return running;
    }

    @Override
    public boolean brake() {
        System.out.println("Brake applied....");
        running = 0;
        brake = true;
        return brake;
    }

    @Override
    public Integer changeGear() {
        System.out.println("Changing Gear...");
        gear++;
        return gear;
    }

    public Integer forward(Integer forwardDistance) {
        position+=forwardDistance;
        return position;
    }


    public Integer reverse(Integer backwardDistance) {
        position-=backwardDistance;
        return position;
    }

    @Override
    public Boolean on() {
        lightsOn = true;
        return lightsOn;
    }

    @Override
    public Boolean off() {
        lightsOn = false;
        return lightsOn;
    }

    @Override
    public Integer left(Integer angle) {
        steeringWheelAngle+=angle;
        return steeringWheelAngle;
    }

    @Override
    public Integer right(Integer angle) {
        steeringWheelAngle-=angle;
        return steeringWheelAngle;
    }
}
