package org.HomeWork;

public class hw3ia {
    public static void main(String[] args) {


    double mortgageRate = 4.4; // Example mortgage rate
    double housePrice = 110000; // Example house price

        if (mortgageRate > 4.5) {
        System.out.println("The mortgage rate is too high. You should not buy a house.");
    } else {
        if (housePrice > 100000) {
            boolean takeLoan = true; // Example decision to take a loan

            if (takeLoan) {
                System.out.println("You will take a loan to buy the house.");
            } else {
                System.out.println("You will pay cash for the house.");
            }
        } else {
            System.out.println("You will pay cash for the house.");
        }
    }
}
}


