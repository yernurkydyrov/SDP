package com;

public class Ship extends Swim{
    public Ship() {
        super(new DriveWithAir());
    }

    @Override
    void display() {
        System.out.println("This is ship");
    }
}
