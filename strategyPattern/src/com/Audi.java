package com;

public class Audi extends Car{
    public Audi() {
        super(new DriveGasoline());
    }

    @Override
    void display() {
        System.out.println("This is Audi A8");
    }
}
