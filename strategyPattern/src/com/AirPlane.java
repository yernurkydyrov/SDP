package com;

public class AirPlane extends Air{
    public AirPlane() {
        super(new DriveSulphurous());
    }

    @Override
    void display() {
        System.out.println("This is airplane");
    }

    public  String main() {
        return this.getClass().getName();
    }


}
