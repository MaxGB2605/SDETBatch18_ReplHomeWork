package org.HomeWork;

public class R87ClassObjectCars{
    /*
    Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
**Expected Output:**
```
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
     */

    String carColor;
    int carYear;
    String carMake;

        public static void main(String[] args) {
            R87ClassObjectCars car1 = new R87ClassObjectCars();
            car1.carColor = "Black";
            car1.carYear = 2019;
            car1.carMake = "BMW";
            System.out.println("Car color is " + car1.carColor+" and car year is " + car1.carYear + " and car model is " + car1.carMake);

            R87ClassObjectCars car2 = new R87ClassObjectCars();
            car2.carColor = "White";
            car2.carYear = 2018;
            car2.carMake = "Toyota";
            System.out.println("Car color is " + car2.carColor+" and car year is " + car2.carYear + " and car model is " + car2.carMake);
        }
    }

