package com.Factory;

public class Main {
    public static void main(String[] args) {
    	
        CarFactory sedanCarFactory = new SedanCarFactory();
        CarFactory suvCarFactory = new SUVCarFactory();
        
        CarShowroom sedanCarShowroom = new CarShowroom(sedanCarFactory);
        sedanCarShowroom.assembleCar();
        
        CarShowroom suvCarShowroom = new CarShowroom(suvCarFactory);
        suvCarShowroom.assembleCar();
    }
}