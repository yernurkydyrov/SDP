package com;

public class Main {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();

        if(airPlane.main().equals("com.AirPlane")){
            System.out.println("Olzhik");
        }else{
            System.out.println("1");
        }
    }
}
