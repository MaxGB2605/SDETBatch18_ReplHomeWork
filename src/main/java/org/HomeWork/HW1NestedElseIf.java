package org.HomeWork;

public class HW1NestedElseIf {

    public static void main(String[] args) {

        boolean degree = true;
        double gpa = 3.7;

        if (degree) {
            System.out.println("Congratulations!");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }
        } else {
            System.out.println("You should get a degree!");
        }

    }
}
