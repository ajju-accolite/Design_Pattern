package com.Factory;

public class CarShowroom {
	
    private CarFactory carFactory;
    
    public CarShowroom(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
    
    public void assembleCar() {
        Car car = carFactory.createCar();
        car.assemble();
    }
}
