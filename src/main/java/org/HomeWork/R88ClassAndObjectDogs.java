package org.HomeWork;

public class R88ClassAndObjectDogs {
    /*
    In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
     */
    String breed;
    String name;
    String color;
    void bark(){
        System.out.println(breed+" can bark");
    }
    void run(){
        System.out.println(breed+" can run");
    }
    void play(){
        System.out.println(breed+" can play");
    }

    public static void main(String[] args) {
        R88ClassAndObjectDogs dog1 = new R88ClassAndObjectDogs();
        dog1.breed="Husky";
        dog1.name="Tusik";
        dog1.color="Brown";
        dog1.bark();
        dog1.run();
        dog1.play();

        R88ClassAndObjectDogs dog2 = new R88ClassAndObjectDogs();
        dog2.breed="Bulldog";
        dog2.name="Sharik";
        dog2.color="White";
        dog2.bark();
        dog2.run();
        dog2.play();

        R88ClassAndObjectDogs dog3 = new R88ClassAndObjectDogs();
        dog3.breed="Labrador";
        dog3.name="Bobik";
        dog3.color="Black";
        dog3.bark();
        dog3.run();
        dog3.play();

    }
}
