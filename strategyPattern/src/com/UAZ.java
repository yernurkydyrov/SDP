package com;

public class UAZ extends Car{
    public UAZ() {
        super(new DriveGas());
    }

    @Override
    void display() {
        System.out.println("This is UAZ USSR");
    }
}
