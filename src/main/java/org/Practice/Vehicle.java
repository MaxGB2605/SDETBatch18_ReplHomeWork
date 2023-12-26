package org.Practice;

public abstract class Vehicle {
    /*
    Vehicle Management System: Design a base class Vehicle with methods like startEngine(),
    stopEngine(), fuelUp(), and fields like make, model, and fuelLevel. Create subclasses
    like Car, Truck, and Motorcycle, each with specific implementations for the methods,
    considering their unique characteristics.
     */
    private String make;
    private String color;
    private String fuelLevel;
    public Vehicle(String make, String color, String fuelLevel){
        this.make=make;
        this.color=color;
        this.fuelLevel=fuelLevel;
    }
    public void printInfo(){
        System.out.println("Vehicle make - "+make+", "+color+" color. Fuel level is - "+fuelLevel);
    }
    public abstract void startEngine();
    public void stopEngine(){
        System.out.println("Engine stopped");
    }
    public abstract void fuelUp();
}
class Car extends Vehicle{
    public Car(String make, String color, String fuelLevel){
        super(make,color,fuelLevel);
    }
    @Override
    public void startEngine(){
        System.out.println("Car engine starts by pushing button");
    }

    @Override
    public void fuelUp() {
        System.out.println("Car fuel is petrol");
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(String make, String color, String fuelLevel){
        super(make,color,fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts with combination of clutch and key");
    }

    @Override
    public void fuelUp() {
        System.out.println("Motorcycle requires premium fuel");
    }
}
class Truck extends Vehicle{
public Truck(String make, String color, String fuelLevel){
    super(make,color,fuelLevel);
}

    @Override
    public void startEngine() {
        System.out.println("Truck engine starts very loud");
    }

    @Override
    public void fuelUp() {
        System.out.println("Truck should be filled with diesel");
    }
}
class VehicleTester{
    public static void main(String[] args) {
        Vehicle c = new Car("Subaru","White","Full tank");
        Vehicle m = new Motorcycle("Suzuki","Red","Full tank");
        Vehicle t = new Truck("Toyota","Gray","3/4 of the tank");

        Vehicle [] vArray = {c,m,t};
        for (Vehicle v:vArray){
            v.printInfo();
            v.fuelUp();
            v.startEngine();
            v.stopEngine();
            System.out.println("****************************");
        }
    }
}
