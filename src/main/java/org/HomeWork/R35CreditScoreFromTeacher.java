package org.HomeWork;

import java.util.Scanner;

public class R35CreditScoreFromTeacher {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean needLoan = input.nextBoolean();

        if (needLoan){
            System.out.println("What is your credit score?");
            int creditrScore = input.nextInt();

            if ((creditrScore <=600) && (creditrScore<=700)){
                System.out.println("You maybe eligible");
            }else if (creditrScore>=701 && creditrScore<=800){
                System.out.println("You are eligible");
            } else if (creditrScore>=801 && creditrScore<=900) {
                System.out.println("Eligible");

            }else {
                System.out.println("Defenetely eligible");
            }

        }else{
            System.out.println("You are not eligible");
        }
    }
}
