package org.example.arge;

public class CarFactory {




    public static void main (String[] args){
        CarSkeleton electricCar =  new ElectricCar("tesla","teslaibo1.1",500.0,9000);
        CarSkeleton hybridCar = new HybridCar("İBO","İBO1.1",900.0,120000,8);
        CarSkeleton gaspoweredCar = new GasPoweredCar("Toros","Torosbabamın",50,2);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gaspoweredCar);


    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }

}
