package org.HomeWork;

import java.util.Scanner;

public class R28ConditionalStatementScannerClass {
    /*
    Write a program to take values of length and width from the user.
Based on value define whether the shape is a square or rectangle.
Examples:
```
Please enter the length 18
Please enter the width 16
The shape of your object is rectangle
```
```
Please enter the length 16
Please enter the width 16
The shape of your object is square
     */

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        double length,width;
        System.out.println("Please enter the length");
        length = newScanner.nextDouble();
        System.out.println("Please enter the width");
        width = newScanner.nextDouble();

        if ((length > width) || (length < width)){
            System.out.println("The shape of your object is rectangle");
        } else if (length == width) {
            System.out.println("The shape of your object is square");

        }
    }
}
