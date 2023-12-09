package org.HomeWork;

public class HW2NestedElseIf {

    public static void main(String[] args) {

        double rate = 4.8;
        int price = 100000;

        if (rate > 4.5) {
            System.out.println("You will not buy a house.");
        } else {
            System.out.println("You will consider to buy a house");
            if (price > 100000) {
                System.out.println("You will take a loan");
            } else {
                System.out.println("You will pay cash");
            }
        }

    }

}
