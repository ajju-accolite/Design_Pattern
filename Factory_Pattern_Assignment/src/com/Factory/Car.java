package com.Factory;

 interface Car {
    void assemble();
}

class SedanCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan Car");
    }
}

class SUVCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling SUV Car");
    }
}
