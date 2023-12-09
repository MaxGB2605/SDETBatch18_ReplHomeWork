package org.HomeWork;

import java.util.Scanner;

public class R34NestedIfScannerClass {
    /*
    Write a program to find the largest number among three distinct numbers
    using nested if condition
Please use Scanner class to take input from users
**Expected Output:*
Please enter 3 distinct numbers 4 5  and 14
The largest number is 14
     */

    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner newScanner = new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");
        num1 = newScanner.nextInt();
        num2 = newScanner.nextInt();
        num3 = newScanner.nextInt();


        if (num1 > num2){
            System.out.println("The largest number is "+num1);

        }else{
            if (num2 > num3){
                System.out.println("The largest number is "+num2);
            }else{
                System.out.println("The largest number is "+num3);
            }
        }
    }
}
