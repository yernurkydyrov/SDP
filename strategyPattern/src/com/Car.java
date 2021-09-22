package com;

public abstract class Car {
    private DriveStrategy driveStrategy;

    public Car(DriveStrategy driveStrategy) {
        setDriveStrategy(driveStrategy);
    }

    public void performDrive() {
        driveStrategy.drive();
    }

    abstract void display();

    public DriveStrategy getDriveStrategy() {
        return driveStrategy;
    }

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
}
