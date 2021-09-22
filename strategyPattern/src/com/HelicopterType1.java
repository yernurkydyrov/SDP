package com;

public class HelicopterType1 extends Air{
    public HelicopterType1() {
        super(new DriveSulphurous());
    }

    @Override
    void display() {
        System.out.println("This is type1 helicopter");
    }
}
